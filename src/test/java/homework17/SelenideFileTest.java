package homework17;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideFileTest {
    @Test
    public void selenideFileTest() throws FileNotFoundException {
        Configuration.browser = "opera";
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        open("download");
        File file = $("#content > div > a:nth-child(12)").download();
        open("upload");
        $(By.id("file-upload")).uploadFile(file);
        $(By.id("file-submit")).click();
        System.out.println("done");
    }
}
