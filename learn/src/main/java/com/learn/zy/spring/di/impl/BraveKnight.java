package com.learn.zy.spring.di.impl;

import com.learn.zy.spring.di.Knight;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

    public static class Quest{

        private String name;

        public void embark(){
            System.out.println("执行");
        }
    }
}
