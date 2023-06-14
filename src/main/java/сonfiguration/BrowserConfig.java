package сonfiguration;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Configuration;

public interface BrowserConfig {
    Browser browser = new Browser("chrome", true);


    default void browser(String browser) {
// browser (e.g. "chrome", "ie", "firefox")
        switch (browser) {
            case "chrome":
                Configuration.browser = "chrome";
                break;
            case "ie":
                Configuration.browser = "ie";
                break;
            case "firefox":
                Configuration.browser = "firefox";
                break;
        }
    }

}
