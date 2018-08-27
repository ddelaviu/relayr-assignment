import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ResultsPage;
import pages.SearchPage;

import java.util.List;


public class ResultsTest extends BaseTest {

    private static String URL = "https://google.com";
    private static String termToSearch = "relayr.io";
    private static String relayrURL = "https://relayr.io/en/";
    private ResultsPage results;

    @BeforeMethod
    // make first a search as a precondition to obtain a results page
    public void search() {
        driver.get(URL);
        results = new SearchPage(driver).enterSearch(termToSearch)
                                        .clickSearch();
    }

    @Test
    public void navigateToSecondPage() {
        results.clickNext();
        Assert.assertEquals(results.getCurrentPage(), "2");
    }

    @Test
    public void navigateToImages() {
        results.clickImagesTab();
        Assert.assertTrue(results.inImageTab());
    }

    @Test
    public void clickOnFirstResult() {
        List<WebElement> resultsList = results.getResults();
        results.clickResult(resultsList, 0);
        Assert.assertEquals(driver.getCurrentUrl(), relayrURL);
    }

}