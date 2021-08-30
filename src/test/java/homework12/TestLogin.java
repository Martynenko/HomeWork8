package homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {
    @Test
    public void correctLogin() {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement inputField = driver.findElement(By.cssSelector("#username"));
        inputField.clear();
        inputField.sendKeys("tomsmith");
        driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();
        assert(driver.findElement(By.cssSelector("#flash")).getText().contains("You logged into a secure area!"));
    }
    @Test
    public void incorrectLogin() {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement inputField = driver.findElement(By.cssSelector("#username"));
        inputField.clear();
        inputField.sendKeys("TomSmith");
        driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();
        assert(driver.findElement(By.cssSelector("#flash")).getText().contains("Your username is invalid!"));
    }
}
