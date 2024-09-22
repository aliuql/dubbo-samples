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

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.springboot.demo.DemoService;

import org.springframework.boot.CommandLineRunner;

//@Component
public class Task1 implements CommandLineRunner {
    @DubboReference(
            version = "1.0",
            group = "test1",
            timeout = 11000,
            methods = {
                    @Method(name = "sayHello", timeout = 21000)
            })
    private DemoService demoService1;

    @Override
    public void run(String... args) throws Exception {
//        for (int i = 0; i < 1; i++) {
//            System.out.println("-----------------------------------------------------------------");
//            RpcContext.getClientAttachment().getObjectAttachments().put("dubbo.tag", "gray");
//            Result<List<String>> result = demoService1.sayHello("world");
//            result.isSuccess();
//            System.out.println(new Date() + " Receive result ======> " + result);
//        }
//
//        new Thread(()-> {
//            while (true) {
//                TimeUtil.sleepSeconds(1);
//
//                RpcContext.getClientAttachment().getObjectAttachments().put("dubbo.tag", "gray");
//                Result<List<String>> result = demoService1.sayHello("world");
//                result.isSuccess();
//
//                System.out.println(new Date() + " Receive result ======> " + result);
//            }
//        }).start();
    }
}
