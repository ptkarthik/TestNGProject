import com.google.inject.Inject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PaginationsData extends BaseTest {
    @Inject
    private WebDriver driver;

    @Test
    public void TestOne() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        int maxRetries = 5; // Max retries for stale element exceptions

        while (true) {
            try {
                // Locate the table and scroll to it
                WebElement table = driver.findElement(By.id("example"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", table);

                // Wait until rows are visible
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr")));

                // Process the table rows
                List<WebElement> rows = table.findElements(By.xpath("//tbody/tr"));
                for (WebElement row : rows) {
                    List<WebElement> columns = row.findElements(By.tagName("td"));
                    for (WebElement column : columns) {
                        System.out.print(column.getText() + " | ");
                    }
                    System.out.println();
                }

                // Locate the "Next" button dynamically
                List<WebElement> nextButtons = driver.findElements(By.xpath("//button[@role='link' and @aria-label='Next']"));
                if (nextButtons.isEmpty() || !nextButtons.get(0).isEnabled()) {
                    // Exit loop if "Next" button is not found or disabled
                    break;
                }

                // Click the "Next" button
                WebElement nextButton = nextButtons.get(0);
                wait.until(ExpectedConditions.elementToBeClickable(nextButton));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click()", nextButton);

                // Add a small wait to allow for table update
                Thread.sleep(2000);

            } catch (StaleElementReferenceException e) {
                System.out.println("Stale element encountered, retrying...");
                maxRetries--;
                if (maxRetries == 0) {
                    System.out.println("Max retries reached. Exiting...");
                    break;
                }
                Thread.sleep(2000);
            }
        }
    }
}
