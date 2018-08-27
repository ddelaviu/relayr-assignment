package utils.drivermanager.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public WebDriver getDriver() {
        driver = new FirefoxDriver();
        return driver;
    }

    @Override
    public void quitDriver() {
        driver.quit();
    }
}