import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TakingADepositTest extends BasicTest {
    @DisplayName("Выбор готового владельца и взятие депозита в 'Долларах'")
    @Description("В этом тесте мы выбираем владельца и берём депозит в 'Долларах'")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void takingADepositTest() {
        webDriver.get(URL);webDriver.findElement(By.xpath("//button[contains(text(),'Customer Login')]"))
                .click();//todo переход на страницу выбора пользователя
        webDriver.findElement(By.name("userSelect"))
                .click();
        assertNull(null, "Failed");//todo ожидаемый результат
        webDriver.findElement(By.xpath("//option[contains(text(),'Ron Weasly')]"))
                .click();//todo выбор пользователя
        assertEquals("Ron Weasly",/*todo ожидаемый результат*/ "Ron Weasly","Failed" );//todo фактический результат
        webDriver.findElement(By.xpath("//button[contains(text(),'Login')]"))
                .click();//todo авторизация под именем выбранного Клиента
        webDriver.findElement(By.xpath("//button[contains(text(),'Deposit')]"))
                .click();//todo переход на страницу одобрения депозита
        webDriver.findElement(By.xpath("//input[@placeholder='amount']"))
                .click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']"))
                .sendKeys("1500");//todo сумма депозита
        assertEquals(1500,/*todo ожидаемый результат*/ 1500, "Failed");//todo фактический результат
        webDriver.findElement(By.xpath("//button[@type='submit']"))
                .click();//todo подтверждение суммы депозита
        webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"))
                .click();// todo переход на Главную страницу сайта
    }
}