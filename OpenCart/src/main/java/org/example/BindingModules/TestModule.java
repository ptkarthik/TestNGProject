package org.example.BindingModules;

import com.google.inject.AbstractModule;
import org.example.DriverFactory.DriverInstanceCreation;
import org.example.DriverFactory.ThreadLocalCreation;
import org.example.PropertyCreator.PropertyCreatorClass;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestModule extends AbstractModule {
    public void configure() {
        try {
            ThreadLocalCreation.setWebdriver(DriverInstanceCreation.
                    instaniateDriver(PropertyCreatorClass.getConfigProperties().getProperty("browser")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bind(WebDriver.class).toInstance(ThreadLocalCreation.getWebdriver());
    }
}
