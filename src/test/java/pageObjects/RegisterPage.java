package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.GenerateEmail;

public class RegisterPage extends BasePage {

    private By nameTextBox = By.id("input-firstname");
    private By lastnameTextBox = By.id("input-lastname");
    private By emailTextBox = By.id("input-email");
    private By telephoneTextBox = By.id("input-telephone");

    private By passTextBox = By.id("input-password");
    private By confirmPassTextBox = By.id("input-confirm");

    private By privacyCheck = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");



    private By continueButton = By.xpath("//input[@value='Continue']");



    private By logoutButton = By.linkText("Logout");
    //*[@id="column-right"]/div/a[13]



    public WebElement setNameTextBox() {
        return driver.findElement(this.nameTextBox);
    }

    public WebElement setLastNameTextBox() {
        return driver.findElement(this.lastnameTextBox);
    }
    public WebElement setEmailTextBox() {
        return driver.findElement(this.emailTextBox);
    }
    public WebElement setTelTextBox() {
        return driver.findElement(this.telephoneTextBox);
    }

    public WebElement setPassTextBoxtBox() {
        return driver.findElement(this.passTextBox);
    }
    public WebElement setConfirmPassTextBox() {
        return driver.findElement(this.confirmPassTextBox);
    }

    public WebElement setPrivacyCheck() {
       return driver.findElement(this.privacyCheck);
    }

    public WebElement setContinueButton() {
        return driver.findElement(this.continueButton);
    }



    public WebElement setLogoutButton() {
        return driver.findElement(this.logoutButton);
    }







    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage(WebDriver driver, String url) {
        super(driver, url + "index.php?route=account/register");
    }

    public void doRegister(){
        GenerateEmail email = new GenerateEmail();

        String emailGen =  email.genEMail()+"@gmail.com";
        this.setNameTextBox().sendKeys("Carlos");
        this.setLastNameTextBox().sendKeys("Mora");
        this.setEmailTextBox().sendKeys(emailGen);
        this.setTelTextBox().sendKeys("88888888");
        this.setPassTextBoxtBox().sendKeys("qw234&&20AL123321");
        this.setConfirmPassTextBox().sendKeys("qw234&&20AL123321");
        this.setPrivacyCheck().click();
        this.setContinueButton().click();

    }




}
