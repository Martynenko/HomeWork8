package homework16;

import homework15.BasePage;
import homework15.challengingdom.ChallengingDomPage;
import homework15.draganddrop.DragAndDropPage;
import homework15.dropdown.DropdownPage;
import homework15.geolocationtest.GeolocationPage;
import homework15.logintest.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    private By byDownloadLink = By.linkText("File Download");
    private By byUploadLink = By.linkText("File Upload");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public FileDownloaderPage goFileDownloaderPage() {
        driver.findElement(byDownloadLink).click();
        return new FileDownloaderPage(driver);
    }

    public FileUploaderPage goFileUploaderPage() {
        driver.findElement(byUploadLink).click();
        return new FileUploaderPage(driver);
    }

}
