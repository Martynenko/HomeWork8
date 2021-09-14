package homework15.draganddrop;

import homework15.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends BasePage {
    private final By byDraggable = By.cssSelector("#draggable");
    private final By byDroppable = By.cssSelector("#droppable");
    public By byGetDroppable = By.cssSelector("#droppable");

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }
    public DragAndDropPage dragAndDrop() {
        WebElement From = driver.findElement(byDraggable);
        WebElement To = driver.findElement(byDroppable);
        Actions act = new Actions(driver);
        act.dragAndDrop(From, To).build().perform();
        return this;
    }
    public DragAndDropPage getDroppable() {
        assert  (driver.findElement(byGetDroppable).getText().contains("Dropped!"));
        return this;
    }
}
