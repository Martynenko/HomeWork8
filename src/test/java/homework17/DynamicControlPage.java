package homework17;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import homework15.dropdown.DropdownPage;

import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Selenide.$;

public class DynamicControlPage {

    public DynamicControlPage() {
        Configuration.browser = "opera";
        open("https://the-internet.herokuapp.com/dynamic_controls");
    }

    private SelenideElement checkbox = $("#checkbox > input[type=checkbox]");
    private SelenideElement removeCheckboxButton = $("#checkbox-example > button");
    private SelenideElement assertCheckbox = $("#message");

    private SelenideElement textFieldEnabled = $("#input-example > button");
    private SelenideElement textFieldDisable = $("#input-example > button");
    private SelenideElement assertTextField = $("#message");

    public DynamicControlPage setCheckbox() {
        checkbox.shouldBe(Condition.appear).shouldBe(Condition.visible).click();
        return this;
    }

    public DynamicControlPage addRemoveCheckboxButton(boolean remove) {
        removeCheckboxButton.shouldBe(Condition.enabled).click();
        if (remove) {
            checkbox.shouldBe(Condition.disappear);
        } else {
            checkbox.shouldBe(Condition.disappear);
        }
        return this;
    }

    public DynamicControlPage getAssertCheckbox() {
        assertCheckbox.shouldHave(Condition.text("It's back!"));
        return this;
    }

    public DynamicControlPage setEnabled() {
        textFieldEnabled.shouldBe(Condition.appear).shouldBe(Condition.visible).click();
        return this;
    }

    public DynamicControlPage setDisable() {
        textFieldDisable.shouldBe(Condition.appear).shouldBe(Condition.visible).click();
        return this;
    }

    public DynamicControlPage getAssertTextField() {
        assertTextField.shouldHave(Condition.text("It's enabled!"));
        return this;
    }
}
