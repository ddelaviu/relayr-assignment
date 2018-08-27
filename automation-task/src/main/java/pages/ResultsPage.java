package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultsPage extends SearchPage {

    private static final String NEXT_BUTTON_LOCATOR = "pnnext";
    private static final String BUTTON_IMAGES_LOCATOR = "a[href*='tbm=isch";
    private static final String PAGE_CURSOR_LOCATOR = "cur";
    private static final String RESULTS_LOCATOR = "h3.r > a";
    private static final String IMAGE_LOCATOR = "rg_l";
    private static final String IMAGE_URL_SUBSTRING = "tbm=isch";

    @FindBy(id = NEXT_BUTTON_LOCATOR)
    private WebElement buttonNextPage;

    @FindBy(css = BUTTON_IMAGES_LOCATOR)
    private WebElement buttonImages;


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

    public BasePage clickResult(List<WebElement> resultsList, int position) {
        if (!resultsList.isEmpty()) {
            WebElement result = resultsList.get(position);
            result.click();
        }
        return new BasePage(driver);
    }

    public List<WebElement> getResults() {
        List<WebElement> resultsList = driver.findElements(By.cssSelector(RESULTS_LOCATOR));
        return resultsList;
    }

    public boolean inImageTab() {
        return driver.getCurrentUrl().contains(IMAGE_URL_SUBSTRING);
    }


}
