package tests;

import dataProviders.productsDataProvider;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import pojos.productData;
import utilities.Waits;

import java.util.List;

public class PriceTest extends BaseTest{

    public PriceTest(String browser) {
        super(browser);
    }
    @Test(groups = {"sanity"}, dataProvider = "getProductsFromJson", dataProviderClass = productsDataProvider.class, description = "List of products to test")
    public void doCheckPrice(productData products){
        HomePage home = new HomePage(driver, getBaseURL());
        ProductPage product = new ProductPage(driver);
        Waits wait = new Waits(driver);
        home.goToPage();
        home.doSearch(products.getName());

        wait.waitForJSandJQueryToLoad();
        if(!(product.getProductTile().size() > 0)) {
            Assert.fail("Empty Product list");
        }
        wait.untilElementExists(product.getProductTitleLink());
        wait.waitForJSandJQueryToLoad();
        product.getProductTitleLink().click();









    }

}
