package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class ValidateColor extends BaseTest {
    @Test
    public void validateColor() {
        WebElement backGround = driver.findElement(By.xpath("//a[contains(text(),'Examples')]"));
        String colorString = backGround.getCssValue("color");
        Color color = Color.fromString(colorString);
        String hexValue = color.asHex();
        System.out.println(hexValue);
    }
}
