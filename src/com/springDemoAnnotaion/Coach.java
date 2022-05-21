package com.springDemoAnnotaion;

public interface Coach {
    public String getWorkOut() ;
    public void getFortune();

    void afterProperties() throws Exception;

    void destory() throws Exception;
    void writeProperties();
}
