package org.example;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.example.BindingModules.TestModule;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    @Inject
    WebDriver driver;

    @BeforeMethod
    public void setup() throws IOException {

        Injector injector = Guice.createInjector(new TestModule());
        injector.injectMembers(this);
        driver.get("https://localhost/opencart/");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
