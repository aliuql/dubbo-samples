/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.springboot.demo.consumer;

import org.apache.dubbo.common.core.CupsContext;
import org.apache.dubbo.common.core.Result;
import org.apache.dubbo.common.util.TimeUtil;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.springboot.demo.DemoService;

import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Task implements CommandLineRunner {

    @DubboReference(
            version = "1.0",
            group = "test1",
            timeout = 11000,
            methods = {
                    @Method(name = "sayHello", timeout = 21000)
            })
    private DemoService demoService;

    @Override
    public void run(String... args) {

        for (int i = 0; i < 1; i++) {
            System.out.println("-----------------------------------------------------------------");
            RpcContext.getClientAttachment().getObjectAttachments().put("dubbo.tag", "gray");

            CupsContext<String> context = new CupsContext<>();
            context.setInstNo("1001");
            context.setSubInstNo("10010001");
            context.setChannelNo("ATM");
            context.setData("world");

            Result<List<String>> result = demoService.sayHello(context);
            result.isSuccess();

            System.out.println(new Date() + " Receive result ======> " + result);
        }

        System.out.println("-----------------------------------------------------------------");

        new Thread(() -> {
            while (true) {
                TimeUtil.sleepSeconds(1);
            }
        }).start();
    }
}
