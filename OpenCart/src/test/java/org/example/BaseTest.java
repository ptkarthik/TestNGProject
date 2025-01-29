package org.example;

import org.example.DriverFactory.DriverInstanceCreation;
import org.example.DriverFactory.ThreadLocalCreation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        ThreadLocalCreation.setWebdriver(DriverInstanceCreation.instaniateDriver("chrome"));
        ThreadLocalCreation.getWebdriver().get("http://localhost/opencart/");

    }

    @AfterMethod
    public void tearDown() {
        ThreadLocalCreation.getWebdriver().quit();
    }
}
