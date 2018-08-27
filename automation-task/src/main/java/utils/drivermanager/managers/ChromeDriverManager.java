package utils.drivermanager.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

    @Override
    public WebDriver getDriver() {
        driver = new ChromeDriver();
        return driver;
    }

    @Override
    public void quitDriver() {
        driver.close();
        driver.quit();
    }
}

