package com.example.practice.design.singleton;

/**
 * program: practice
 * Date: 2019/3/17 17:24
 * Author: Yi.Liu
 * Description:
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
