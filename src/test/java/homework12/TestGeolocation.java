package homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestGeolocation extends BaseTest {
    @Test
    public void getGeolocation() {
        driver.get("https://the-internet.herokuapp.com/geolocation");
        driver.findElement(By.cssSelector("#content > div > button")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Latitude = driver.findElement(By.cssSelector("#lat-value"));
        System.out.println("Latitude " + Latitude.getText());
        WebElement Longitude = driver.findElement(By.cssSelector("#long-value"));
        System.out.println("Longitude " + Longitude.getText());
    }
}
