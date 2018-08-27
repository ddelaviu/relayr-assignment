import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ResultsPage;
import pages.SearchPage;


public class ResultsTest extends BaseTest {

    private static String URL = "https://google.com";
    private String termToSearch = "relayr.io";
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
    }

}