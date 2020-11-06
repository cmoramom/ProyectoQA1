package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ProductPage extends BasePage {

    private By productTitle = By.xpath("//div[contains(@class,'product-layout')]");
    private By addToCartButton = By.xpath("//div[contains(@class,'product-layout')]//button[contains(span,'Add to Cart')]");
    private By successModal =  By.xpath("//div[contains(@class, 'alert alert-success')]");
    private By cartButton = By.linkText("shopping cart");
    private By productTitleLink = By.linkText("MacBook");



    public List<WebElement> getProductTile() {
        return driver.findElements(this.productTitle);
    }

    public  WebElement getAddToCartButton() {
        return driver.findElement(this.addToCartButton);
    }

    public WebElement getSuccessModal() {
        return driver.findElement(this.successModal);
    }

    public WebElement getCartButton() {
        return driver.findElement(this.cartButton);
    }

    public WebElement getProductTitleLink() {
        return driver.findElement(this.productTitleLink);
    }



    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void goToCart(){
        this.getCartButton().click();
    }

    public void doBuyProduct(){
    this.getAddToCartButton().click();



    }


}
