package com.springDemoAnnotaion.services;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private Random random = new Random();
    private  String[] data = {"this first day luck" , "this first day luck2" ,"this first day luck3"};
    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        String getDate = data[index];
        return getDate;
    }
}
