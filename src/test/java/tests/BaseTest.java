package tests;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import guice.TestModule;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.CustomUtitilies;
import utilities.WaitUtilties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

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

    @BeforeClass
    public void setupconfig(ITestContext iTestContext) throws IOException {
        FileReader fileReader = new FileReader(new File(System.getProperty("user.dir") +
                "//config.file"));
        Properties readCnfigFile = new Properties();
        readCnfigFile.load(fileReader);

        iTestContext.setAttribute("username", readCnfigFile.getProperty("username"));
        iTestContext.setAttribute("password", readCnfigFile.getProperty("password"));
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
//        driver.get("https://datatables.net/examples/basic_init/alt_pagination.html");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }


}
