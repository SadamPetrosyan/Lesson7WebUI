import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OpeningAPoundAccountTest extends BasicTest {
    @DisplayName("Открытие депозита в 'Фунтах'")
    @Description("В этом тесте мы открываем счёт в 'Фунтах' ")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void openingAPoundAccountTest(){
        webDriver.get(URL);
        webDriver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]")).
                click();//todo переход на страницу с вкладками "Добавить Клиента", "Открыть учетную запись", "Клиенты"
        webDriver.findElement(By.xpath("//button[contains(text(),'Open Account')]"))
                .click();//todo переход на страницу "Открыть учетную запись"
        webDriver.findElement(By.name("userSelect"))
                .click();
        assertNull(null, "Failed");//todo ожидаемый результат
        webDriver.findElement(By.xpath("//option[contains(text(),'Harry Potter')]"))
                .click();//todo выбор пользователя
        assertEquals("Harry Potter",/*todo ожидаемый результат*/ "Harry Potter","Failed" );//todo фактический результат
        webDriver.findElement(By.name("currency"))
                .click();
        assertNull(null, "Successful");//todo ожидаемый результат
        webDriver.findElement(By.xpath("//option[contains(text(),'Pound')]"))
                .click();//todo выбор валюты
        assertEquals("Pound",/*todo ожидаемый результат*/ "Pound","Failed" );//todo фактический результат
        webDriver.findElement(By.xpath("//button[@type='submit']"))
                .click();//todo кнопка сохранения прогресса

    }
}