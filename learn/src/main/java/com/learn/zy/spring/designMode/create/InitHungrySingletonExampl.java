package com.learn.zy.spring.designMode.create;

public class InitHungrySingletonExampl {

    private InitHungrySingletonExampl(){

    }
    private static final InitHungrySingletonExampl instance;

    static {
        instance = new InitHungrySingletonExampl();
    }

    public static InitHungrySingletonExampl getInstance(){
        return instance;
    }
}
