package com.example.practice.design.singleton;

/**
 * program: practice
 * Date: 2019/3/17 12:13
 * Author: Yi.Liu
 * Description:
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {

    }

    static {
        instance = new Singleton2();
    }

    public Singleton2 getInstance() {
        return instance;
    }
}
