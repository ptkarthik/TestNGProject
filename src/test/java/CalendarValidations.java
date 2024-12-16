import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CalendarValidations extends BaseTest {
    @Test
    public void calendarTest() {
        driver.switchTo().frame(0);
        WebElement calendar = driver.findElement(By.xpath("//section[@id='datePickers']" +
                "/div[2]/div/smart-calendar"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", calendar);
        WebElement calendarDateAndTime = driver.findElement(By.xpath("(//div[@smart-id='defaultHeaderDate'])" +
                "[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", calendarDateAndTime);
        WebElement previousArrowBtn = driver.findElement(By.xpath("(//div[@smart-id='header'])" +
                "[1]/smart-repeat-button[1]/button"));
        int i = 0;
        while (!calendarDateAndTime.getText().equalsIgnoreCase("1989") && i < 50) {
            previousArrowBtn.click();
            i++;
        }
    }
}
