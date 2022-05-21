package com.springDemoAnnotaion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        //retrieve bean from container
        Coach theCoach = context.getBean("swimCoach" , Coach.class);
        //call method from bean
        theCoach.getFortune();
        theCoach.writeProperties();
    }
}
