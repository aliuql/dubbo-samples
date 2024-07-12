package org.apache.dubbo.springboot.demo;

public class DemoServiceDubboProxy1000 {}
/*
public class DemoServiceDubboProxy0 implements ClassGenerator.DC, DemoService, EchoService, Destroyable {
    public static Method[] methods; // 来自各个接口的 Method 对象
    private InvocationHandler handler;

    public DemoServiceDubboProxy0() {
    }

    public DemoServiceDubboProxy0(InvocationHandler handler) {
        this.handler = handler;
    }

    public String sayHello(String name) {
        Object[] args = new Object[]{name};
        Object ret = this.handler.invoke(this, methods[0], args);
        return (String) ret;
    }

    public Object $echo(Object message) {
        Object[] args = new Object[]{message};
        Object ret = this.handler.invoke(this, methods[1], args);
        return (Object) ret;
    }

    public void $destroy() {
        Object[] args = new Object[0];
        this.handler.invoke(this, methods[2], args);
    }
}
*/
