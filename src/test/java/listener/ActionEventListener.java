package listener;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.util.function.ToDoubleBiFunction;


public class ActionEventListener extends AbstractWebDriverEventListener {
    private static final Logger logger = LoggerFactory.getLogger("Action Logger");

    //TODO Мне к сожаление не удалось реализовать данный класс, так как изначально сделал все тесты одним методом(


    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        Allure.addAttachment("ScreenShot", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }
}