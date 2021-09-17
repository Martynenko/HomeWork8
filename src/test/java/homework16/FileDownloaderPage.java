package homework16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileDownloaderPage extends BasePage {

    private final By byDownloadFile = By.cssSelector("#content > div > a:nth-child(2)");

    public FileDownloaderPage(WebDriver driver) {
        super(driver);
    }

    public FileDownloaderPage clickDownloadFile() {
        driver.findElement(byDownloadFile).click();
        return this;
    }
}
