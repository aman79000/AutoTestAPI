package com.autobot.practice.practice1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassParameterInTestNG {


    @Test
    @Parameters({ "browser" })
    public void PassParameterInTestNg(String browser) {
        System.out.println(browser);
    }

}
