package homework16;

/*
Написать тест, который будет скачивать файл с сервера, его модифицировать и потом загружать обратно.
Для скачивания - использовать страницу https://the-internet.herokuapp.com/download
Отсюда нужно скачать любой текстовый файл (при желании - можно усложнить, скачать рандомно любой из текстовых).
В этот файл записать несколько строк (содержимое строк - не важно)
Для загрузки файла на сервер - использовать страницу https://the-internet.herokuapp.com/upload
проверить, что файл загружается
Логику работы со страницами - вынести в классы PageObject
Логика работы с файлами должны быть в тесте
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileTest extends BaseTest {

    @Test
    public void fileTest() throws IOException {

        driver.get("https://the-internet.herokuapp.com");

        MainPage mainPage = new MainPage(driver);
        mainPage.goFileDownloaderPage();

        FileDownloaderPage fileDownloaderPage = new FileDownloaderPage((driver));
        fileDownloaderPage.clickDownloadFile();

        System.out.println("file download");

        Path path = Paths.get("D:\\artemMartynenko\\target\\ggg.txt");
        List<String> newLines = new ArrayList<>();
        newLines.add("First String");
        newLines.add("Second String");
        Files.write(path, newLines);

        System.out.println("file overwritten");

        driver.get("https://the-internet.herokuapp.com");
        mainPage.goFileUploaderPage();
        FileUploaderPage fileUploaderPage = new FileUploaderPage(driver);

        fileUploaderPage.uploadFile().clickUploadButton();

        SecurePage securePage = new SecurePage(driver);
        Assert.assertTrue(securePage.getMessage().contains("File Uploaded!"));

        System.out.println("file upload");

    }

}
