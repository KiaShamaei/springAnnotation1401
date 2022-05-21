package com.springDemoAnnotaion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theFortune = context.getBean("tennisCoach" , Coach.class);
        Coach alphaFortune = context.getBean("tennisCoach" , Coach.class);
        boolean result = (theFortune == alphaFortune);
        System.out.println("\n Pointing to same obj : " + result);
        System.out.println("\n Memory of 1 : " + theFortune);
        System.out.println("\n Memory of 2 : " + alphaFortune);
        context.close();
    }
}
