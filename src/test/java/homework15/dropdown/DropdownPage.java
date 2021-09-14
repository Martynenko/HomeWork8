package homework15.dropdown;

import homework15.BasePage;
import homework15.logintest.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropdownPage extends BasePage {
    private final By byDropdownMenu = By.cssSelector("#bs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown > a");
    private final By bySecondaryMenu = By.cssSelector("#bs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown > ul > li.secondary-dropdown > a");
    private final By byMoveToElement = By.cssSelector("#bs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown > ul > li.secondary-dropdown > ul > li > a");
    private final By byAssert = By.cssSelector("body > div > div.jumbotron.secondary-clicked > h1");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public DropdownPage clickDropdown() {
        driver.findElement(byDropdownMenu).click();
        WebElement secondaryMenu = driver.findElement(bySecondaryMenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(secondaryMenu).perform();
        driver.findElement(byMoveToElement).click();
        return this;
    }
    public DropdownPage getAssert() {
        assert driver.findElement(byAssert).getText().contains("Secondary Page");
        return this;
    }
}
