package homework15.challengingdom;

import homework15.BaseTest;
import homework15.MainPage;
import org.testng.annotations.Test;

public class ChallengingDomTest extends BaseTest {
    @Test
    public void clickAllButton() {
        driver.get("https://the-internet.herokuapp.com/");

        new MainPage(driver).goToChallengingDomPage()
                .clickBlueButton()
                .clickRedButton()
                .clickGreenButton()
                .selectColumnValues();
    }
}
