import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.drivermanager.DriverManagerFactory;
import utils.drivermanager.DriverTypes;
import utils.drivermanager.managers.DriverManager;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;
    protected static DriverManager driverManager;
    public static DriverTypes driverType;
    public static String browser;

    @BeforeTest
    public static void setUp() {
        browser = System.getProperty("browser");
        if (browser == null) { browser = "firefox"; }
        switch (browser) {
            case "chrome":
                driverType = DriverTypes.CHROME;
                break;
            case "firefox":
                driverType = DriverTypes.FIREFOX;
                break;
            default:
                driverType = DriverTypes.CHROME;
        }

        driverManager = new DriverManagerFactory().getManager(driverType);
    }

    @BeforeMethod
    public static void initDriver() {
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public static void tearDown() {
        driver.quit();
    }
}