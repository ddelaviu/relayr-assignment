package utils.drivermanager.managers;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;
    public abstract void quitDriver();
    public abstract WebDriver getDriver();

}
