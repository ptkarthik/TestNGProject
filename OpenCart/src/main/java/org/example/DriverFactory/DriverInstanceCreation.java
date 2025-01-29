package org.example.DriverFactory;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverInstanceCreation {

    public static final Map<String, WebDriverCreation> mapOfWebDriver = new HashMap<>();

    static {
        mapOfWebDriver.put("chrome", new ChromeDriverClass());
        mapOfWebDriver.put("firefox", new FireFoxDriverClass());
    }


    public static WebDriver instaniateDriver(String webdriverType) {
        WebDriverCreation factory = mapOfWebDriver.get(webdriverType.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Incorrect Webdriver Type Given");
        }
        return factory.createWebDriver();
    }
}
