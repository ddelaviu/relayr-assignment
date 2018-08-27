import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ResultsPage;
import pages.SearchPage;

public class SearchTest extends BaseTest {

    private static String URL = "https://google.com";
    private ResultsPage results;
    private String termToSearchResults = "relayr.io";
    private String termToSearchNoResults = "//////////////////////";

    @BeforeMethod
    public void init() {
        driver.get(URL);
    }

    @Test
    public void search_withResults() {
        results = new SearchPage(driver).enterSearch(termToSearchResults)
                                        .clickSearch();
        Assert.assertTrue(results.hasResults());
    }

    @Test
    public void search_withNoResults() {
        results = new SearchPage(driver).enterSearch(termToSearchNoResults)
                                        .clickSearch();
        Assert.assertFalse(results.hasResults());
    }

    @Test
    public void search_withImageResults() {
        results = new SearchPage(driver).enterSearch(termToSearchResults)
                                        .clickSearch()
                                        .clickImagesTab();
        Assert.assertTrue(results.hasImageResults());
    }

    @Test
    public void search_withNoImageResults() {
        results = new SearchPage(driver).enterSearch(termToSearchNoResults)
                                        .clickSearch()
                                        .clickImagesTab();
        Assert.assertFalse(results.hasImageResults());
    }
}
