package tests;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import guice.TestModule;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.CustomUtitilies;
import utilities.WaitUtilties;

public class BaseTest {

    @Inject
    WebDriver driver;
    @Inject
    CustomUtitilies customUtitilies;
    @Inject
    WaitUtilties waitUtilties;

    public static Injector getInjector() {
        return injector;
    }

    protected static Injector injector;

    public BaseTest() {
        // Initialize the injector here


    }

    @BeforeMethod
    public void setUp() throws Exception {
        injector = Guice.createInjector(new TestModule());
        injector.injectMembers(this);
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
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }
}
