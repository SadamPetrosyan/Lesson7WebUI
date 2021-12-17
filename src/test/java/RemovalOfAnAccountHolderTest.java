import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemovalOfAnAccountHolderTest extends BasicTest {
    @DisplayName("Удаление владельца счета")
    @Description("В этом тесте мы удаляем владельца счёта")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void removalOfAnAccountHolderTest(){
        webDriver.get(URL);
        webDriver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]"))
                .click();//todo переход на страницу с вкладками "Добавить Клиента", "Открыть учетную запись", "Клиенты"
        webDriver.findElement(By.xpath("//button[contains(text(),'Customers')]"))
                .click();//todo переход на страницу "Клиенты"
        webDriver.findElement(By.xpath("//input[@placeholder='Search Customer']"))
                .click();
        assertNull(null, "Failed");//todo ожидаемый результат
        webDriver.findElement(By.xpath("//input[@placeholder='Search Customer']"))
                .sendKeys("Neville");//todo поиск Клиента
        assertEquals("Neville",/*todo ожидаемый результат*/ "Neville","Failed" );//todo фактический результат
        webDriver.findElement(By.xpath("//button[contains(text(),'Delete')]"))
                .click();//todo удаление Клиента
        webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"))
                .click();// todo переход на Главную страницу сайта
    }
}