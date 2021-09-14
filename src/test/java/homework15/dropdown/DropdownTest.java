package homework15.dropdown;

import homework15.BaseTest;
import homework15.MainPage;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {
    @Test
    public void dropdownTest() {
        driver.get("https://crossbrowsertesting.github.io/");
        new MainPage(driver).goToDropdownPage().clickDropdown().getAssert();

//        assert (driver.findElement(By.cssSelector("body > div > div.jumbotron.secondary-clicked > h1")).getText().contains("Secondary Page"));
    }
}
