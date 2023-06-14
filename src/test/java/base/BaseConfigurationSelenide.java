package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.AssertionMode.SOFT;

public class BaseConfigurationSelenide {
    /**
     * Добавление параметров браузера через Configuration: например,
     * добавление опции "disable-extensions" для отключения расширений браузера или
     * опции "disable-infobars" для отключения баннеров Chrome.
     * <p>
     * Использование переменной URL как параметра в методе openPage(),
     * чтобы можно было открывать разные страницы в зависимости от теста.
     * <p>
     * Добавление логирования уровня INFO для отображения информации о текущей странице и действиях пользователя.
     * <p>
     * Добавление возможности использования разных браузеров для тестирования – не только Chrome, но и Firefox, Edge, Safari и т. д.
     * <p>
     * Использование аннотации @BeforeAll вместо @BeforeEach для оптимизации запуска тестов – таким образом метод setUp будет вызываться только один раз перед всеми тестами, а не перед каждым тестом.
     * <p>
     * Добавление возможности указания дополнительных параметров при запуске тестов через командную строку (например, выбор браузера, headless-режим и т. д.).
     * <p>
     * Использование параметров из внешнего конфигурационного файла для настройки браузера и Selenide в целом – это позволит упростить многократное использование одинаковых настроек для разных тестовых классов.
     */
    private static final String URL = "https://ya.ru/";

    public void openPage(String url) { // используется для открытия страницы по заданному URL
        Selenide.open(url);
    }

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // загрузка и установка драйвера Chrome

        Configuration.driverManagerEnabled = true; // включение использования DriverManager для управления драйвером
        Configuration.browserSize = "1920x1080"; // задание размера окна браузера
        Configuration.headless = false; // отключение headless-режима (браузер не будет работать в фоновом режиме)
        Configuration.webdriverLogsEnabled = true; // true – включение логирования действий WebDriver
        Configuration.assertionMode = SOFT; // //Тест терпит неудачу только в конце методов.
        WebDriverRunner.clearBrowserCache(); // Удалить все куки браузера
        openPage(URL);
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver(); // закрывает браузер.
    }
}
