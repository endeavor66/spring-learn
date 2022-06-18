package org.example.service;

import org.example.service.impl.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        UserService proxy = (UserService)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), new Class[]{UserService.class}, new UserServiceProxy(new UserServiceImpl()));
        int result = proxy.add(1, 2);
        System.out.println(result);
    }
}




