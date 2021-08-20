package homework11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin {


    @Test(priority = 1, dataProvider = "data", groups = "login")
    public void testLogin(String userName, String password, String role) {
        System.out.println("Имя пользователя - " + userName);
        System.out.println("Пароль пользователя - " + password);
        System.out.println("Роль пользователя - " + role);

    }

    @DataProvider(name = "data")
    public Object[][] generateTestData() {
        Object[][] result = {{"Artem", "qwerty123", "NG"}};
        return result;
    }

    @Test(priority = 2, dependsOnGroups = "login")
    public void testAfterLogin() {
        System.out.println("Выполнение testAfterLogin происходит только после успешного выполнения  testLogin");

    }

    @Parameters({"card", "amount", "currency"})
    @Test(priority = 3)
    public void testPayment(String card, String amount, String currency) {
        System.out.println("Карта - " + card);
        System.out.println("Сумма - " + amount);
        System.out.println("Валюта - " + currency);

    }

}


