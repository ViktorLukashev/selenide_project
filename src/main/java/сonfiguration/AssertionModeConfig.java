package сonfiguration;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.AssertionMode.STRICT;

public interface AssertionModeConfig {
    default void assertionMode(String mode) {
        /**
         * Режим утверждения
         */
        switch (mode) {
            case "SOFT":
                Configuration.assertionMode = SOFT; //Тест терпит неудачу только в конце методов.
                break;
            case "STRICT":
                Configuration.assertionMode = STRICT; //Режим по умолчанию — тесты сразу же проваливаются
                break;
        }
    }
}
