package homework20.logintest;

import homework20.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage {
//    private WebDriver driver; вынесли в BasePage

    private final By byMessage = By.id("flash");

    public SecurePage(WebDriver driver) {
//        this.driver = driver;
        super(driver);
    }

    public String getMessage() {
        return driver.findElement(byMessage).getText();
    }
}
