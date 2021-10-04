package homework19;

import org.testng.annotations.Test;

public class DynamicControlTest {
    @Test
    public void dynControlTest(){

        DynamicControlPage dynamicControlPage = new DynamicControlPage();
        dynamicControlPage.setCheckbox();
        dynamicControlPage.addRemoveCheckboxButton(true);
        dynamicControlPage.addRemoveCheckboxButton(false);
        dynamicControlPage.getAssertCheckbox();
        dynamicControlPage.setEnabled();
        dynamicControlPage.setDisable();
        dynamicControlPage.getAssertTextField();
    }
}
