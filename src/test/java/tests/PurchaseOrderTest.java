package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import utilities.Waits;
import dataProviders.productsDataProvider;
import pojos.productData;

public class PurchaseOrderTest extends  BaseTest {

    public PurchaseOrderTest(String browser) {
        super(browser);
    }

    @Test(groups = {"sanity"}, dataProvider = "getProductsFromJson", dataProviderClass = productsDataProvider.class, description = "List of products to test")
    public void doNotAllowedPurchase(productData products){

        HomePage home = new HomePage(driver, getBaseURL());
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        Waits wait = new Waits(driver);

        home.goToPage();
        home.doSearch(products.getName());



        if(!(product.getProductTile().size() > 0)) {
            Assert.fail("Empty Products list");
        }
        product.doBuyProduct();
        wait.waitForJSandJQueryToLoad();
        if(!product.getSuccessModal().isDisplayed()){
            Assert.fail("Product not added");
        }

        product.goToCart();
        wait.waitForJSandJQueryToLoad();
        Assert.assertTrue(cart.getAlertProductNotStock().isDisplayed(), "Alert Present");




















    }


}
