package org.example;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.example.BindingModules.TestModule;
import org.example.listerners.CustomListeners;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.IOException;

@Listeners(CustomListeners.class)
public class BaseTest {

    @Inject
    WebDriver driver;

    @BeforeMethod
    public void setup() throws IOException {
        Injector injector = Guice.createInjector(new TestModule());
        injector.injectMembers(this);
        driver.get(TestConstants.BASEURL);
        driver.manage().deleteAllCookies();


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
