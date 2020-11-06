package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import pageObjects.RegisterPage;
import org.testng.annotations.Test;
import utilities.Waits;

public class RegisterTest  extends BaseTest {
    public RegisterTest(String browser) {
        super("chrome");
    }

    @Test(groups = {"sanity"})
    public void doRegister(){

        RegisterPage registerPage = new RegisterPage(driver, getBaseURL());
        Waits wait = new Waits(driver);
        registerPage.goToPage();
        registerPage.doRegister();
        Assert.assertTrue(registerPage.setLogoutButton().isDisplayed(), "Logout Link present");






    }


    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }






}
