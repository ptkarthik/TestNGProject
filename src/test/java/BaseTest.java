import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import guice.TestModule;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    @Inject
    WebDriver driver;

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
        driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }
}
