package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseConfigurationSelenide {
    private static final String URL = "https://ya.ru/";

    private void openPage() {
        Selenide.open(URL);
    }
    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.webdriverLogsEnabled = true;
        openPage();
    }



    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
