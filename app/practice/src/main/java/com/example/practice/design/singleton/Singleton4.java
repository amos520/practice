package com.example.practice.design.singleton;

/**
 * program: practice
 * Date: 2019/3/17 17:31
 * Author: Yi.Liu
 * Description:
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {

    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();

        }
        return instance;
    }

}

