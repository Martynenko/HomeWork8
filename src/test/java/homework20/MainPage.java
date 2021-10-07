package homework20;

import homework20.logintest.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    //    private WebDriver driver; вынесли в BasePage
    private By byLoginLink = By.linkText("Form Authentication");

    public MainPage(WebDriver driver) {
//        this.driver = driver;
        super(driver);
    }

    public LoginPage goToLoginPage() {
        driver.findElement(byLoginLink).click();
        return new LoginPage(driver);
    }

}
