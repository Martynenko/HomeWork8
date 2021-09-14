package homework15.draganddrop;

import homework15.BaseTest;
import homework15.MainPage;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {
    @Test
    public void dragAndDropTest() {
        driver.get("https://crossbrowsertesting.github.io/");
//        MainPage mainPage = new MainPage(driver);
//        mainPage.goToDragAndDropPage();
//
//        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
//        dragAndDropPage.dragAndDrop();
//
//        assert (driver.findElement(By.cssSelector("#droppable")).getText().contains("Dropped!"));
        new MainPage(driver).goToDragAndDropPage()
                .dragAndDrop()
                .getDroppable();
    }
}

