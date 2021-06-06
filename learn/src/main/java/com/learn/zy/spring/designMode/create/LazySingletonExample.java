package com.learn.zy.spring.designMode.create;

/**
 * 懒汉式
 */
public class LazySingletonExample {
    //无参构造函数
    private LazySingletonExample(){

    }

    private static LazySingletonExample intance = null;

    public static LazySingletonExample getInstance(){
        if(null == intance){
            intance = new LazySingletonExample();
        }
        return intance;
    }

}
