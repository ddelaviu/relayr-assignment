package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    private static final String SEARCH_INPUT_LOCATOR = "q";
    private static final String SEARCH_BUTTON_LOCATOR = "btnK";

    @FindBy(name = SEARCH_INPUT_LOCATOR)
    private WebElement searchInputField;

    @FindBy(name = SEARCH_BUTTON_LOCATOR)
    private WebElement searchButton;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage enterSearch(String wordToSearch) {
        this.searchInputField.clear();
        this.searchInputField.sendKeys(wordToSearch);
        return this;
    }

    public ResultsPage clickSearch() {
        this.searchButton.submit();
        return new ResultsPage(driver);
    }

}