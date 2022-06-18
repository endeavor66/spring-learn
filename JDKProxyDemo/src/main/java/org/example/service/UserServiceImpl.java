package org.example.service;

import org.example.service.impl.UserService;

public class UserServiceImpl implements UserService {

    public int add(int x, int y) {
        System.out.println("add method execute...");
        return x + y;
    }
}
