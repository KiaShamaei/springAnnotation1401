package com.springDemoAnnotaion;


import com.springDemoAnnotaion.services.FortuneService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("theTennnisCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach , InitializingBean , DisposableBean {

    @Autowired
    //this happen when we have multiple implement of a interface bean
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService ;


/*
    //inject dependency with method
    @Autowired
    public void testFucking(FortuneService theFortuneSerivce){
        this.fortuneService = theFortuneSerivce;
    }
*/
/*
    //inject dependency by setter method
    @Autowired
    public  void  SetFortuneService (FortuneService theFortuneService){
        this.fortuneService = theFortuneService;

    }
*/

    /*
    //the injection by constructor
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
     */
    public  TennisCoach(){
        System.out.println("Tennis obj call ...");
    }
    //define init method
    public void testLifeCyclePre() {
        System.out.println("this is a method before bean constuctor ...");
    }
    //define destroy method

    public void testLifeCycleEnd() {
        System.out.println("this is a method after bean constuctor ...");
    }

    @Override
    public String getWorkOut(){
        System.out.println("this work out from tennis obj");
        return null;
    }

    @Override
    public void getFortune(){
        System.out.println(fortuneService.getFortune());
    }

    @Override
    public void afterProperties() throws Exception {
        testLifeCyclePre();
    }

    @Override
    public void destory() throws Exception {

    }

    @Override
    public void writeProperties() {

    }


    @Override
    public void destroy() throws Exception {
        testLifeCycleEnd();
    }


    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
