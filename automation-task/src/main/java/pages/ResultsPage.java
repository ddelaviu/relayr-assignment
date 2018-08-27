package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends SearchPage {

    @FindBy(id = "pnnext")
    private WebElement buttonNextPage;


    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public ResultsPage clickNext() {
        this.buttonNextPage.click();
        return new ResultsPage(driver);
    }

}
