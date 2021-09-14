package homework15.geolocationtest;

import homework15.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeolocationResultPage extends BasePage {

    private final By byLat = By.cssSelector("#lat-value");
    private final By byLong = By.cssSelector("#long-value");

    public GeolocationResultPage(WebDriver driver) {
        super(driver);
    }

    public String getLatitude() {
        return driver.findElement(byLat).getText();
    }
    public String getLongitude() {
        return driver.findElement(byLong).getText();
    }
}
