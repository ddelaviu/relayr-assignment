import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ResultsPage;
import pages.SearchPage;

public class SearchTest extends BaseTest {

    private static String URL = "https://google.com";
    private ResultsPage results;
    private String termToSearch = "relayr.io";

    @BeforeMethod
    public void init() {
        driver.get(URL);
    }

    @Test
    public void search_withResults() {
        results = new SearchPage(driver).enterSearch(termToSearch)
                .clickSearch();
    }
}
