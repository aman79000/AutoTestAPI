package com.autobot.practice.practice1;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryatRunTime implements IAnnotationTransformer {
//This is for implememnt the to retry at runtiume
    public void transform(ITestAnnotation annotation, Class var2, Constructor var3, Method var4){

        annotation.setRetryAnalyzer(RetryAnalyser.class);
    }

}

//After this we have to add the same in TestNg.xml file
