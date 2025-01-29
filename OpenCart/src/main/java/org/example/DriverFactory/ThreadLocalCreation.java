package org.example.DriverFactory;

import org.openqa.selenium.WebDriver;

public class ThreadLocalCreation {
    public static WebDriver getWebdriver() {
        return webdriver.get();
    }


    public static void setWebdriver(WebDriver driver) {
        webdriver.set(driver);
    }

    public static ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();
}
