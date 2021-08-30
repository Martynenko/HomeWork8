package homework12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }
}
