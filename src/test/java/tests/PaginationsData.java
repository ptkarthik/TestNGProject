package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class PaginationsData extends BaseTest {

    @Test
    public void TestPagination() {
        String[] split = driver.findElement(By.xpath("//div[@id='example_info']")).
                getText().split(" ");
        int totalRecords = Integer.parseInt(split[5]);

        do {
            WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
            customUtitilies.scrollIntoView(table);
            String[] split1 = driver.findElement(By.xpath("//div[@id='example_info']")).
                    getText().split(" ");
            int currentRecord = Integer.parseInt(split1[3]);
            WebElement nxtButton = driver.findElement(By.xpath("//div[@class='dt-paging']//button[8]"));
            waitUtilties.waitUsingFluent(nxtButton);
            WebElement body = table.findElement(By.tagName("tbody"));
            List<WebElement> rows = body.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                List<WebElement> columns = row.findElements(By.tagName("td"));
                for (WebElement column : columns) {
                    System.out.print(column.getText() + " " + "|");
                }
                System.out.println();
            }
            nxtButton.click();

            if (totalRecords == currentRecord) {
                break;
            }
        } while (true);

    }
}