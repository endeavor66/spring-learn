package org.example.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceProxy implements InvocationHandler {

    private Object obj;

    public UserServiceProxy(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法调用前");
        Object value = method.invoke(obj, args);
        System.out.println("方法调用后");
        return value;
    }
}
