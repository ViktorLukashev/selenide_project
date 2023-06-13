package сonfiguration;

import com.codeborne.selenide.Selenide;

public interface BaseUrlConfig {
    static void baseUrl() {
        /**
         * Базовый URL для вызовов функции open()
         * Может быть настроен либо программно, через файл selenide.properties,
         * либо системным свойством "-Dselenide.baseUrl=http://myhost".
         */
        Selenide.open("https://ya.ru/");
    }
}
