package homework15.geolocationtest;

import homework15.BasePage;
import homework15.logintest.SecurePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeolocationPage extends BasePage {

    private final By byGeolocationButton = By.cssSelector("#content > div > button");
    private final By byWait = By.xpath("//*[@id=\"content\"]/div/h3");

    public GeolocationPage(WebDriver driver) {
        super(driver);
    }

    public GeolocationResultPage clickGeolocationButton() {
        driver.findElement(byGeolocationButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(byWait));
        return new GeolocationResultPage(driver);
    }

}
