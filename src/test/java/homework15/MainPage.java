package homework15;
/*
Продолжить рефакторинг кода, разделить логику тестов и логику взаимодействия с приложением, вынести её в PageObjects.
Рефакторить и описывать нужно только функционал тестового сайта https://the-internet.herokuapp.com/
 */

import homework15.challengingdom.ChallengingDomPage;
import homework15.draganddrop.DragAndDropPage;
import homework15.dropdown.DropdownPage;
import homework15.geolocationtest.GeolocationPage;
import homework15.logintest.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    //    private WebDriver driver; вынесли в BasePage
    private By byLoginLink = By.linkText("Form Authentication");
    private By byChallengingDomLink = By.linkText("Challenging DOM");
    private By byGeolocationLink = By.linkText("Geolocation");
    private By byDragAndDropLink = By.linkText("Drag and Drop");
    private By byDropdownLink = By.linkText("Hover Menu");

    public MainPage(WebDriver driver) {
//        this.driver = driver;
        super(driver);
    }

    public LoginPage goToLoginPage() {
        driver.findElement(byLoginLink).click();
        return new LoginPage(driver);
    }

    public ChallengingDomPage goToChallengingDomPage() {
        driver.findElement(byChallengingDomLink).click();
        return new ChallengingDomPage(driver);
    }

    public GeolocationPage goToGeolocationPage() {
        driver.findElement(byGeolocationLink).click();
        return new GeolocationPage(driver);
    }

    public DragAndDropPage goToDragAndDropPage() {
        driver.findElement(byDragAndDropLink).click();
        return new DragAndDropPage(driver);
    }

    //    public void goToDropdownPage() {
//        driver.findElement(By.linkText("Hover Menu")).click();
//    }
    public DropdownPage goToDropdownPage() {
        driver.findElement(byDropdownLink).click();
        return new DropdownPage(driver);
    }
}
