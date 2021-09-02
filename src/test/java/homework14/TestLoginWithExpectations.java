package homework14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestLoginWithExpectations extends BaseTest {

    @Test
    public void correctLogin() {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement inputField = driver.findElement(By.cssSelector("#username"));
        inputField.clear();
        inputField.sendKeys("tomsmith");
        driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.button.secondary.radius")));
        assert (driver.findElement(By.cssSelector("#flash")).getText().contains("You logged into a secure area!"));
    }

    @Test
    public void incorrectLogin() {
        driver.get("https://the-internet.herokuapp.com/login");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"login\"]/button")));
        WebElement inputField = driver.findElement(By.cssSelector("#username"));
        inputField.clear();
        inputField.sendKeys("TomSmith");
        driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();
        assert (driver.findElement(By.cssSelector("#flash")).getText().contains("Your username is invalid!"));
    }
}
