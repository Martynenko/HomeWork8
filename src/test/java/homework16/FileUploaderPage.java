package homework16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploaderPage extends BasePage {
    private final By byUploadFile = By.id("file-upload");
    private final By byUploadButton = By.id("file-submit");


    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    public FileUploaderPage uploadFile() {
        WebElement fileInput = driver.findElement(byUploadFile);
        fileInput.sendKeys("D:\\artemMartynenko\\target\\ggg.txt");
        return this;
    }

    public FileUploaderPage clickUploadButton() {
        driver.findElement(byUploadButton).click();
        return this;
    }

}
