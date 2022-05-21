package com.springDemoAnnotaion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
    public static void main(String[] args) {
        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach" , Coach.class);
        //call method from bean
        theCoach.getWorkOut();
    }
}
