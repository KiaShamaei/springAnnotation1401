package com.springDemoAnnotaion;


import org.springframework.stereotype.Component;

@Component("theTennnisCoach")
public class TennisCoach implements Coach {
    @Override
    public void getWorkOut(){
        System.out.println("this work out from tennis obj");
    }

}
