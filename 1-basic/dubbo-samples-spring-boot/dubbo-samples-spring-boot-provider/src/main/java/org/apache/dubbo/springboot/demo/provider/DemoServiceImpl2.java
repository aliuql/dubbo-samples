package org.apache.dubbo.springboot.demo.provider;

import org.apache.dubbo.common.Result;
import org.apache.dubbo.springboot.demo.DemoService;

//@DubboService(
//        version = "2.0",
//        group = "test2",
//        timeout = 10000,
//        methods = {
//                @Method(name = "sayHello", timeout = 20000)
//        })
public class DemoServiceImpl2 implements DemoService {

    @Override
    public Result<String> sayHello(String name) {
        return new Result<>("Hello" + name);
    }

}
