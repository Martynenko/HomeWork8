package homework13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest {
    @Test
    public void dragAndDrop() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        WebElement From = driver.findElement(By.cssSelector("#draggable"));
        WebElement To = driver.findElement(By.cssSelector("#droppable"));
        Actions act = new Actions(driver);
        act.dragAndDrop(From, To).build().perform();
        assert (driver.findElement(By.cssSelector("#droppable")).getText().contains("Dropped!"));
    }
}
