import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableUnderstanding extends BaseTest {
    @Inject
    private WebDriver driver;

    @Test
    public void TestOne() {

        System.out.println(driver.getCurrentUrl());
        WebElement table = driver.findElement(By.xpath("//table[@id='countries']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", table);

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            for (int j=0;j<columns.size();j++) {
                if(columns.get(j).getText().equalsIgnoreCase("Australia")) {
                    System.out.println("The currency  of the Country is"+columns.get(columns.size()-2).getText());
                }
                System.out.print(columns.get(j).getText() + " " + "|");
            }
            System.out.println("\n");
        }
//        driver.quit();
    }
}
