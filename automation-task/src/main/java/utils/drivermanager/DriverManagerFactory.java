package utils.drivermanager;

import utils.drivermanager.DriverTypes;
import utils.drivermanager.managers.ChromeDriverManager;
import utils.drivermanager.managers.DriverManager;
import utils.drivermanager.managers.FirefoxDriverManager;

public class DriverManagerFactory {

    public DriverManager getManager(DriverTypes type) {
        DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                driverManager = new FirefoxDriverManager();
        }

        return driverManager;
    }
}