package homework13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToMouse extends BaseTest {
    @Test
    public void get() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        for (int i = 3; i <= 5; i++) {
            WebElement userName = driver.findElement(By.cssSelector("#content > div > div:nth-child(" + i + ") > img"));
            Actions actions = new Actions(driver);
            actions.moveToElement(userName).perform();
            System.out.println(driver.findElement(By.cssSelector("#content > div > div:nth-child(" + i + ") > div > h5")).getText());

        }

//        WebElement userName1 = driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > img"));
//        Actions actions1 = new Actions(driver);
//        actions1.moveToElement(userName1).perform();
//        System.out.println(driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > div > h5")).getText());
//
//        WebElement userName2 = driver.findElement(By.cssSelector("#content > div > div:nth-child(4) > img"));
//        Actions actions2 = new Actions(driver);
//        actions2.moveToElement(userName2).perform();
//        System.out.println(driver.findElement(By.cssSelector("#content > div > div:nth-child(4) > div > h5")).getText());
//
//        WebElement userName3 = driver.findElement(By.cssSelector("#content > div > div:nth-child(5) > img"));
//        Actions actions3 = new Actions(driver);
//        actions3.moveToElement(userName3).perform();
//        System.out.println(driver.findElement(By.cssSelector("#content > div > div:nth-child(5) > div > h5")).getText());

    }
}