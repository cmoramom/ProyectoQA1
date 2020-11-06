package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private By searchTextBox = By.xpath("//input[@name='search']");

    public WebElement getSearchTextBox() {
        return driver.findElement(this.searchTextBox);
    }


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage(WebDriver driver, String url) {
        super(driver, url);
    }

    public void doSearch(String productName) {
        getSearchTextBox().sendKeys(productName);
        getSearchTextBox().sendKeys(Keys.ENTER);
    }


}
