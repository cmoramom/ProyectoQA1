package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import utilities.Waits;

public class PurchaseOrderTest extends  BaseTest {

    public PurchaseOrderTest(String browser) {
        super(browser);
    }

    @Test(groups = {"sanity"})
    public void doNotAllowedPurchase(){

        HomePage home = new HomePage(driver, getBaseURL());
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        Waits wait = new Waits(driver);

        home.goToPage();
        home.doSearch("Macbook");
        //Assert.assertTrue(product.getProductTile().size() > 0,"Product Found");
        System.out.println("Hola usuario bienvenido");

        if(!(product.getProductTile().size() > 0)) {
            Assert.fail("Empty list");
        }
        product.doBuyProduct();
        wait.waitForJSandJQueryToLoad();
        if(!product.getSuccessModal().isDisplayed()){
            Assert.fail("Product do not added");
        }

        product.goToCart();
        wait.waitForJSandJQueryToLoad();
        Assert.assertTrue(cart.getAlertProductNotStock().isDisplayed(), "Alert Present");




















    }


}
