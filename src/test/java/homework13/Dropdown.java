package homework13;
/*
2. https://crossbrowsertesting.github.io/hover-menu.html - написать тест, который раскрывает dropdown-меню,
кликает на пункт Secondary Action и проверяет, что текст "Secondary Page" отобразился на странице
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Dropdown extends BaseTest {
    @Test
    public void dropdown() {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");

        driver.findElement(By.cssSelector("#bs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown > a")).click();
        WebElement secondaryMenu = driver.findElement(By.cssSelector("#bs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown > ul > li.secondary-dropdown > a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(secondaryMenu).perform();
        driver.findElement(By.cssSelector("#bs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown > ul > li.secondary-dropdown > ul > li > a")).click();
        assert (driver.findElement(By.cssSelector("body > div > div.jumbotron.secondary-clicked > h1")).getText().contains("Secondary Page"));

//        driver.findElement(By.cssSelector("#fbs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown > a")).click();
//        driver.findElement(By.cssSelector("#bs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown > ul > li.secondary-dropdown > a")).click();
//        driver.findElement(By.cssSelector("#bs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown > ul > li.secondary-dropdown > ul > li > a")).click();
//        assert (driver.findElement(By.cssSelector("body > div > div.jumbotron.secondary-clicked > h1")).getText().contains("Secondary Page"));


    }
}

