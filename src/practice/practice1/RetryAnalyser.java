package com.autobot.practice.practice1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
    int count =0;
    int retry=3;
//This is for implementing the retry logic
    @Override
    public boolean retry(ITestResult i){

        if(count <retry){
            count++;
            return true;
        }
        return false;
    }


}
