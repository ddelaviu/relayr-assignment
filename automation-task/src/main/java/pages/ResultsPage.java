package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends SearchPage {

    @FindBy(id = "pnnext")
    private WebElement buttonNextPage;

    @FindBy(css = "a[href*='tbm=isch")
    private WebElement buttonImages;

    private static final String PAGE_CURSOR_LOCATOR = "cur";
    private static final String RESULTS_LOCATOR = "h3.r > a";
    private static final String IMAGE_LOCATOR = "rg_l";


    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public ResultsPage clickNext() {
        this.buttonNextPage.click();
        return new ResultsPage(driver);
    }

    public String getCurrentPage() {
        return driver.findElement(By.className(PAGE_CURSOR_LOCATOR)).getText();
    }

    public boolean hasResults() {
        return driver.findElements(By.cssSelector(RESULTS_LOCATOR)).size() > 0;
    }

    public boolean hasImageResults() {
        return driver.findElements(By.className(IMAGE_LOCATOR)).size() > 0;
    }

    public ResultsPage clickImagesTab() {
        this.buttonImages.click();
        return new ResultsPage(driver);
    }



}
