package homework16;

import homework15.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage {

    private final By byMessage = By.cssSelector("#content > div > h3");

    public SecurePage(WebDriver driver) {
        super(driver);
    }

    public String getMessage() {
        return driver.findElement(byMessage).getText();
    }
}
