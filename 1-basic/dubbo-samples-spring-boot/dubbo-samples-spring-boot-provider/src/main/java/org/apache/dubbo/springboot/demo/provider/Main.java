package org.apache.dubbo.springboot.demo.provider;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        for (Method method : Main.class.getMethods()) {
            System.out.println(method.getName());
            System.out.println(method.getGenericReturnType());
        }
    }
}
