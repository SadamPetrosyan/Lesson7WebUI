import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatingANewOwnerTest extends BasicTest {
    @DisplayName("Создание нового владельца счета в банке")
    @Description("В этом тесте мы создаём страницу нового Клиента")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void creatingANewOwnerTest(){
        webDriver.get(URL);
        webDriver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]")).
                click();//todo переход на страницу с вкладками "Добавить Клиента", "Открыть учетную запись", "Клиенты"
        webDriver.findElement(By.xpath("//button[contains(text(),'Add Customer')]"))
                .click();//todo переход на страницу "Добавить Клиента"
        webDriver.findElement(By.xpath("//input[@placeholder='First Name']"))
                .sendKeys("Tom");//todo заполнение поля Имени Клиента
        assertEquals("Tom",/*todo ожидаемый результат*/ "Tom","Failed" );//todo фактический результат
        webDriver.findElement(By.xpath("//input[@placeholder='Last Name']"))
                .sendKeys("Marvolo");//todo заполнение поля Фамилии Клиента
        assertEquals("Marvolo",/*todo ожидаемый результат*/ "Marvolo","Failed" );//todo фактический результат
        webDriver.findElement(By.xpath("//input[@placeholder='Post Code']"))
                .sendKeys("A1ML0RD");//todo заполнение поля Почтового индекса Клиента
        assertEquals("AIML0RD",/*todo ожидаемый результат*/ "A1ML0RD","Failed" );//todo фактический результат
        webDriver.findElement(By.xpath("//button[@type='submit']"))
                .click();//todo кнопка сохранения пользователя в системе
    }
}