package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import java.util.regex.Matcher;

public class ValidateCoolor extends BaseTest {
    @Test
    public void validateColor() {
        WebElement backGround = driver.findElement(By.xpath("//a[contains(text(),'Examples')]"));
       String cloorString=backGround.getCssValue("color");
        Color color= Color.fromString(cloorString);
        String hexValue=color.asHex();
        System.out.println(hexValue);
        Matcher

    }
}
