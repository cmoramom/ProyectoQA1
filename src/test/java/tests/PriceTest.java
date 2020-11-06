package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import utilities.Waits;

import java.util.List;

public class PriceTest extends BaseTest{

    public PriceTest(String browser) {
        super(browser);
    }
    @Test(groups = {"sanity"})
    public void doCheckPrice(){
        HomePage home = new HomePage(driver, getBaseURL());
        ProductPage product = new ProductPage(driver);
        Waits wait = new Waits(driver);
        home.goToPage();
        home.doSearch("MacBook");

        wait.waitForJSandJQueryToLoad();
        if(!(product.getProductTile().size() > 0)) {
            Assert.fail("Empty list");
        }
        wait.untilElementExists(product.getProductTitleLink());
        product.getProductTitleLink().click();






    }

}
