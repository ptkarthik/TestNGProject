package tests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AutomatingThePage extends BaseTest {

    @Test(priority = 1, groups = {"Smoke", "Regression"}, enabled = true,
            dependsOnMethods ="tests.CalendarValidations.calendarTest" )
    public void test() {
        driver.findElement(By.xpath("//input[@name='password'])"))
                .sendKeys("password");
        driver.findElement(By.xpath("//input[@name='password'])"))
                .sendKeys("password");
    }
}
