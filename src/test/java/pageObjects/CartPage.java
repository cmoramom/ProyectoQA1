package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{

    private By alertProductNotStock= By.xpath("//div[contains(@class, 'alert alert-danger')]");


    public WebElement getAlertProductNotStock() {
        return driver.findElement(this.alertProductNotStock);
    }




    public CartPage(WebDriver driver) {
        super(driver);
    }



}
