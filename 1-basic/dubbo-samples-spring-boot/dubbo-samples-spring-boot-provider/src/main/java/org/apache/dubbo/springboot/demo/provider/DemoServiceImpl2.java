package org.apache.dubbo.springboot.demo.provider;

import org.apache.dubbo.common.core.CupsContext;
import org.apache.dubbo.common.core.Result;
import org.apache.dubbo.springboot.demo.DemoService;

import java.util.List;

//@DubboService(
//        version = "2.0",
//        group = "test2",
//        timeout = 10000,
//        methods = {
//                @Method(name = "sayHello", timeout = 20000)
//        })
public class DemoServiceImpl2 implements DemoService {


    @Override
    public Result<List<String>> sayHello(CupsContext<String> context) {
        //throw new BizException(ErrorStatus.FAIL);
//        System.out.println("request context: " + context);
//        List<String> messages = new ArrayList<>();
//        messages.add("Hello " + context.getName());
//        messages.add("My name is aliuql");
        return new Result<>();
    }

}
