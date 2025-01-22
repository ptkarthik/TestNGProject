package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AutomatingThePage extends BaseTest {
    @Test
    public void test() {
        driver.findElement(By.xpath("//input[@title='Email'])"))
                .sendKeys("pt.karthik1989@gmail.com");
        driver.findElement(By.xpath("//input[@name='password'])"))
                .sendKeys("password");
        driver.findElement(By.xpath("//input[@name='password'])"))
                .sendKeys("password");
    }
}
