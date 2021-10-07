package homework20;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private Actions actions;
    private JavascriptExecutor javascriptExecutor;

    @BeforeClass
    public void beforeClass() {

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
//        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);

        javascriptExecutor = (JavascriptExecutor) driver;
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }
}
