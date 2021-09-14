package homework15.logintest;

import homework15.BaseTest;
import homework15.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        driver.get("https://the-internet.herokuapp.com/");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
        SecurePage securePage = new SecurePage(driver);
        Assert.assertTrue(securePage.getMessage().contains("You logged into a secure area!"), "User should be logged in!");
    }

    @Test
    public void incorrectloginTest() {
        driver.get("https://the-internet.herokuapp.com/");
        SecurePage securePage = new MainPage(driver).goToLoginPage()
                        .setUsername("TomSmith")
                        .setPassword("SuperSecretPassword!")
                        .clickLoginButton();

        Assert.assertTrue(securePage.getMessage().contains("Your username is invalid!"), "User should be logged with incorrect credentials!");
    }

}
