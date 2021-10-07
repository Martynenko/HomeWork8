package homework20.logintest;

import homework20.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
//    private WebDriver driver; вынесли в BasePage

    private final By byUsername = By.id("username");
    private final By byPassword = By.id("password");
    private final By byLoginButton = By.tagName("button");

    public LoginPage(WebDriver driver) {
//        this.driver = driver;
        super(driver);

    }

    public LoginPage setUsername(String username) {
        driver.findElement(byUsername).sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        driver.findElement(byPassword).sendKeys(password);
        return this;
    }

    public SecurePage clickLoginButton() {
        driver.findElement(byLoginButton).click();
        return new SecurePage(driver);
    }
}

