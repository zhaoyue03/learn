package com.learn.zy.spring.designMode.create;

/**
 * 饿汉式
 */
public class HungrySingletonExample {

    private HungrySingletonExample(){

    }

    private static final HungrySingletonExample instance = new HungrySingletonExample();

    public HungrySingletonExample getInstance(){
        return instance;
    }
}
