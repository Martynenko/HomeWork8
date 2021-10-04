package homework19;

import homework17.DynamicControlPage;
import org.testng.annotations.Test;

public class DynamicControlTest {
    @Test
    public void dynControlTest(){

        homework17.DynamicControlPage dynamicControlPage = new DynamicControlPage();
        dynamicControlPage.setCheckbox();
        dynamicControlPage.addRemoveCheckboxButton(true);
        dynamicControlPage.addRemoveCheckboxButton(false);
        dynamicControlPage.getAssertCheckbox();
        dynamicControlPage.setEnabled();
        dynamicControlPage.setDisable();
        dynamicControlPage.getAssertTextField();
    }
}
