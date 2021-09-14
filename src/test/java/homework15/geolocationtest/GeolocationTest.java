package homework15.geolocationtest;

import homework15.BaseTest;
import homework15.MainPage;
import org.testng.annotations.Test;

public class GeolocationTest extends BaseTest {
    @Test
    public void getGeolocation() {
        driver.get("https://the-internet.herokuapp.com/");
        GeolocationResultPage geolocationResultPage = new MainPage(driver).goToGeolocationPage()
                .clickGeolocationButton();
        System.out.println("Latitude " + geolocationResultPage.getLatitude());
        System.out.println("Longitude " + geolocationResultPage.getLongitude());
    }
}
