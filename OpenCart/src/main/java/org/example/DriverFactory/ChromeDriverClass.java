package org.example.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverClass implements WebDriverCreation {
    @Override
    public WebDriver createWebDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notification");
        chromeOptions.setAcceptInsecureCerts(true);
        return new ChromeDriver(chromeOptions);
    }
}
