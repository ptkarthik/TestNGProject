import com.google.inject.Guice;
import com.google.inject.Injector;
import guice.TestModule;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static Injector injector;
    public BaseTest() {

    }
    @BeforeMethod
    public void setUp() throws Exception {

        /*this to be used for WebTables*
        driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
         */
        /*This to be used for calendar
        below

         */
        //driver.get("https://www.htmlelements.com/demos/calendar/overview/");
        //below for paginatioon
        driver.get("https://datatables.net/examples/basic_init/alt_pagination.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }
}
