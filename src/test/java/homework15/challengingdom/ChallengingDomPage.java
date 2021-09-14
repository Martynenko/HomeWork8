package homework15.challengingdom;

import homework15.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChallengingDomPage extends BasePage {

    private final By byBlueButton = By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[1]");
    private final By byRedButton = By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[2]");
    private final By byGreenButton = By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[3]");
    private final By byColumnValues = By.xpath("//div[@class='row']//table//tr/td[4]");

    public ChallengingDomPage(WebDriver driver) {
        super(driver);
    }

    public ChallengingDomPage clickBlueButton() {
        driver.findElement(byBlueButton).click();
        return this;
    }

    public ChallengingDomPage clickRedButton() {
        driver.findElement(byRedButton).click();
        return this;
    }

    public ChallengingDomPage clickGreenButton() {
        driver.findElement(byGreenButton).click();
        return this;
    }

    public void selectColumnValues() {
        List<WebElement> allRowSit = driver.findElements(byColumnValues);
        for (int i = 0; i <= 9; i++) {
            System.out.println(allRowSit.get(i).getText());
        }
    }
}
