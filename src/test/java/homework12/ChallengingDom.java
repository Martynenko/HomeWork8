package homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ChallengingDom extends BaseTest {

    @Test
    public void clickBlueButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[1]")).click();
    }

    @Test
    public void clickRedButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[2]")).click();
    }


    @Test
    public void clickGreenButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[3]")).click();
    }

    @Test
    public void selectColumnValues() {
        List<WebElement> allRowSit = driver.findElements(By.xpath("//div[@class='row']//table//tr/td[4]"));
        for (int i = 0; i <= 9; i++) {
            System.out.println(allRowSit.get(i).getText());
        }

//        String field1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[1]/td[4]")).getText();
//        System.out.println(field1);
//        String field2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[2]/td[4]")).getText();
//        System.out.println(field2);
//        String field3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[3]/td[4]")).getText();
//        System.out.println(field3);
//        String field4 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[4]/td[4]")).getText();
//        System.out.println(field4);
//        String field5 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[5]/td[4]")).getText();
//        System.out.println(field5);
//        String field6 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[6]/td[4]")).getText();
//        System.out.println(field6);
//        String field7 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[7]/td[4]")).getText();
//        System.out.println(field7);
//        String field8 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[8]/td[4]")).getText();
//        System.out.println(field8);
//        String field9 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[9]/td[4]")).getText();
//        System.out.println(field9);
//        String field10 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[10]/td[4]")).getText();
//        System.out.println(field10);

    }
}

