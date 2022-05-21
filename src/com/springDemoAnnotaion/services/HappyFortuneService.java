package com.springDemoAnnotaion.services;


import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune(){
        return "this from fortune service" ;
    }

}
