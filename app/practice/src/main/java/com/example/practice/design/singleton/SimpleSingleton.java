package com.example.practice.design.singleton;

/**
 * Date: 2019/3/17 17:46
 * Author: Yi.Liu
 * Description:
 */
public class SimpleSingleton {

    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {

    }

    public SimpleSingleton getInstance() {
        return INSTANCE;
    }
}
