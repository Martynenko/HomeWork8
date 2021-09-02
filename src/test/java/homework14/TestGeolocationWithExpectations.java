package homework14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestGeolocationWithExpectations extends BaseTest {
    @Test
    public void getGeolocation() {
        driver.get("https://the-internet.herokuapp.com/geolocation");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#content > div > button"))).click();
        //driver.findElement(By.cssSelector("#content > div > button")).click(); - убрал, так как добавил click() сразу после ожидания
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); - убрал - НЕ рекомендуется использовать
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div/h3")));
        WebElement Latitude = driver.findElement(By.cssSelector("#lat-value"));
        System.out.println("Latitude " + Latitude.getText());
        WebElement Longitude = driver.findElement(By.cssSelector("#long-value"));
        System.out.println("Longitude " + Longitude.getText());

    }
}

