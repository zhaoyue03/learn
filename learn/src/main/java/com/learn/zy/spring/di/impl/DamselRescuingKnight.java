package com.learn.zy.spring.di.impl;

import com.learn.zy.spring.di.Knight;
import lombok.Data;

public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight(){
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest(){
        quest.embark();
    }

    @Data
    public static class RescueDamselQuest{

        private String name;

        public void embark(){
            System.out.println("执行");
        }
    }
}
