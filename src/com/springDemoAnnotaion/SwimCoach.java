package com.springDemoAnnotaion;

import com.springDemoAnnotaion.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements  Coach {
    @Value("${test.email}")
    private String email ;
    @Value("${test.team}")
    private String team ;

    FortuneService fortuneService ;
    public SwimCoach (FortuneService thefortuneService){
        this.fortuneService = thefortuneService;
    }
    @Override
    public String getWorkOut() {
        return "this from swim coach";

    }

    @Override
    public void getFortune() {
        System.out.println(fortuneService.getFortune());

    }

    @Override
    public void afterProperties() throws Exception {

    }

    @Override
    public void destory() throws Exception {

    }
    public void writeProperties(){
        System.out.println(this.email);
    }

}
