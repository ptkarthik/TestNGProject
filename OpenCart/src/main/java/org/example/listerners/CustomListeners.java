package org.example.listerners;

import com.google.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class CustomListeners implements ITestListener {
    public static final Logger logger = LogManager.getLogger(CustomListeners.class);

    @Inject
    WebDriver driver;

    @Override
    public void onTestStart(ITestResult iTestResult) {
        logger.info(iTestResult.getName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        logger.info(iTestResult.getName() + "is successfully passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
