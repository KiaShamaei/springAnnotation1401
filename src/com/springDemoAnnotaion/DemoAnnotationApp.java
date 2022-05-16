package com.springDemoAnnotaion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnnotationApp {
    public static void main(String[] args) {
        //read spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the bean from context
        Coach theCoach = context.getBean("theTennnisCoach" , Coach.class);
        //call method from bean
        theCoach.getWorkOut();
        //close context
        context.close();
    }
}
