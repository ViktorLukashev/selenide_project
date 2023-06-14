package base_upgrade;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationSelenideDocker {
    private static final String DEFAULT_URL = "https://ya.ru/";

    private void openPage(String url) {
        // Добавление возможности изменения URL страницы в методе openPage().
        // Например, можно передать URL в качестве параметра:
        Selenide.open(url);
    }

    @BeforeEach
    public void setUp() {
        setUpDriver();
        setUpProperties();
        setUpConfiguration();
        openPage(DEFAULT_URL);
    }

    public void setUpConfiguration() {
        /**
         * Добавление логирования событий в браузере для упрощения отладки тестов:
         */
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        Configuration.browserCapabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities.setCapability("name", "Selenoid Test");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    private void setupChromeDriver() {
        // Инициализация браузера
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
    }

    private void setUpDriver() {
        // ...
        setupChromeDriver();
        // ...
    }

    public void setUpProperties() {
        /**
         * src/test/resources/selenide.properties
         * файл проперти с конфигурацией настройки браузера
         */
        //...
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/test/resources/selenide.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties prop = new Properties();
        try {
            prop.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Configuration.browser = prop.getProperty("browser");
        Configuration.browserSize = prop.getProperty("browserSize");
        Configuration.headless = Boolean.parseBoolean(prop.getProperty("headless"));
        // ...
    }
    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver(); // закрывает браузер.
    }
}
