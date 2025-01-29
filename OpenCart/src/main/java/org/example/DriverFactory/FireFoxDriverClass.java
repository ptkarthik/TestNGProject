package org.example.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxDriverClass implements WebDriverCreation {
    @Override
    public WebDriver createWebDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--disable Notification");
        firefoxOptions.setAcceptInsecureCerts(true);
        return new FirefoxDriver(firefoxOptions);
    }
}
