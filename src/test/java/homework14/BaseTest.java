package homework14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();
        wait = new WebDriverWait(driver, 10);

    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }
}
