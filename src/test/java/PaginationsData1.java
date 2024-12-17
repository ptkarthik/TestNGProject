import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class PaginationsData1 extends BaseTest {

    @Test
    public void TestPagination() {
        // Locate the table and scroll into view
        WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
        customUtitilies.scrollIntoView(table);

        // Extract total number of records
        String[] split = driver.findElement(By.xpath("//div[@id='example_info']"))
                .getText().split(" ");
        int totalRecords = Integer.parseInt(split[5]);

        do {
            // Re-locate table and pagination elements within the loop to avoid stale references
            WebElement updatedTable = driver.findElement(By.xpath("//table[@id='example']"));
            WebElement body = updatedTable.findElement(By.tagName("tbody"));
            List<WebElement> rows = body.findElements(By.tagName("tr"));

            // Print all rows and columns
            for (WebElement row : rows) {
                List<WebElement> columns = row.findElements(By.tagName("td"));
                for (WebElement column : columns) {
                    System.out.print(column.getText() + " | ");
                }
                System.out.println();
            }

            // Locate updated pagination information
            String[] updatedSplit = driver.findElement(By.xpath("//div[@id='example_info']"))
                    .getText().split(" ");
            int currentRecords = Integer.parseInt(updatedSplit[3]);

            // Check if we're at the last page
            if (currentRecords == totalRecords) {
                break;
            }

            // Locate and click the "Next" button
            WebElement nextButton = driver.findElement(By.xpath("//div[@class='dt-paging']//button[8]"));
            waitUtilties.waitUsingFluent(nextButton);
            nextButton.click();

        } while (true); // Loop until the last page
    }
}
