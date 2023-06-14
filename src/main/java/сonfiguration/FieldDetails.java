package сonfiguration;

import com.codeborne.selenide.DownloadsFolder;
import com.codeborne.selenide.impl.WebDriverContainer;
import com.codeborne.selenide.proxy.SelenideProxyServer;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverListener;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

interface FieldDetails {
    /*
    Сведения о поле
     */
    WebDriverContainer  webdriverContainer = new WebDriverContainer() {
        @Override
        public void addListener(WebDriverEventListener webDriverEventListener) {

        }

        @Override
        public void addListener(WebDriverListener webDriverListener) {

        }

        @Override
        public void removeListener(WebDriverEventListener webDriverEventListener) {

        }

        @Override
        public void removeListener(WebDriverListener webDriverListener) {

        }

        @Override
        public void setWebDriver(WebDriver webDriver) {

        }

        @Override
        public void setWebDriver(WebDriver webDriver, @Nullable SelenideProxyServer selenideProxyServer) {

        }

        @Override
        public void setWebDriver(WebDriver webDriver, @Nullable SelenideProxyServer selenideProxyServer, DownloadsFolder downloadsFolder) {

        }

        @Override
        public void resetWebDriver() {

        }

        @Nonnull
        @Override
        public WebDriver getWebDriver() {
            return null;
        }

        @Nullable
        @Override
        public SelenideProxyServer getProxyServer() {
            return null;
        }

        @Override
        public void setProxy(@Nullable Proxy proxy) {

        }

        @Nonnull
        @Override
        public WebDriver getAndCheckWebDriver() {
            return null;
        }

        @Nullable
        @Override
        public DownloadsFolder getBrowserDownloadsFolder() {
            return null;
        }

        @Override
        public void closeWindow() {

        }

        @Override
        public void closeWebDriver() {

        }

        @Override
        public boolean hasWebDriverStarted() {
            return false;
        }

        @Override
        public void using(WebDriver webDriver, @Nullable SelenideProxyServer selenideProxyServer, @Nullable DownloadsFolder downloadsFolder, Runnable runnable) {

        }

        @Override
        public void inNewBrowser(Runnable runnable) {

        }

        @Override
        public void clearBrowserCache() {

        }

        @Nonnull
        @Override
        public String getPageSource() {
            return null;
        }

        @Nonnull
        @Override
        public String getCurrentUrl() {
            return null;
        }

        @Nonnull
        @Override
        public String getCurrentFrameUrl() {
            return null;
        }
    };
}
