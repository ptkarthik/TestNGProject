package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomatingThePage extends BaseTest {

    @Test(priority = 1, groups = {"Smoke", "Regression"}, enabled = true)
    @Parameters({"username", "password"})
    public void test(@Optional("karthik") String userName, @Optional("password") String password) {
        driver.get("https://selectorshub.com/xpath-practice-page/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//input[@name='Password']")));
        driver.findElement(By.xpath("//input[@name='email']"))
                .sendKeys(userName);
        driver.findElement(By.xpath("//input[@name='Password']"))
                .sendKeys(password);
    }
}
