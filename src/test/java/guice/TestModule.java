package guice;


import com.google.inject.AbstractModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import services.Calculator;
import utilities.CustomUtitilies;
import utilities.WaitUtilties;


public class TestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Calculator.class);
        bind(WebDriver.class).toInstance(new ChromeDriver());
        bind(CustomUtitilies.class);
        bind(WaitUtilties.class);

    }
}
