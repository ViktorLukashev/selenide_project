package сonfiguration;

interface WebDriverRunnerConfig {
    /**
     * Этот класс содержит некоторые функции, относящиеся к браузеру :
     *
     * isChrome()
     * isFirefox()
     * isHeadless()
     * url() - возвращает текущий url
     * source() - возвращает исходный HTML текущего окна
     * getWebDriver() - возвращает обьект WebDriver (созданный Selenide автоматически или установленный пользователем), таким образом отдавая "чистый" интерфейс к Selenium, если нужно
     * setWebDriver(WebDriver) - указывает Selenide использовать драйвер, созданный пользователем. С этого момента пользователь сам ответственен за закрытие драйвера.
     *
     * Метод	Описание
     * addListener(org.openqa.selenium.support.events.WebDriverListener listener)	Используйте этот метод ДО открытия браузера, чтобы добавить пользовательские прослушиватели событий в веб-драйвер.
     * clearBrowserCache()	Удалить все куки браузера
     * closeWebDriver()	Закройте браузер, если он открыт.
     * closeWindow()	Закрыть текущее окно, выйдя из браузера, если это последнее открытое окно.
     * currentFrameUrl()	Возвращает: URL текущего кадра
     * driver()
     * getAndCheckWebDriver()	Получите базовый экземпляр Selenium WebDriver и подтвердите, что он все еще жив.
     * getBrowserDownloadsFolder()
     * getSelenideProxy()	Получите селенидный прокси.
     * getWebDriver()	Получите базовый экземпляр Selenium WebDriver.
     * hasWebDriverStarted()	true, если экземпляр Selenium WebDriver запускается в текущем потоке
     * isChrome()	Selenide настроен на использование браузера Chrome
     * isEdge()	Selenide настроен на использование браузера Microsoft EDGE
     * isFirefox()	Selenide настроен на использование браузера Firefox
     * isHeadless()	Selenide настроен на использование безголового браузера
     * isIE()	Selenide настроен на использование браузера Internet Explorer
     * removeListener(org.openqa.selenium.support.events.WebDriverListener listener)
     * setProxy(org.openqa.selenium.Proxy webProxy)	Устанавливает экземпляр Selenium Proxy
     * setWebDriver(org.openqa.selenium.WebDriver webDriver)	Скажите Selenide использовать предоставленный вами экземпляр WebDriver.
     * setWebDriver(org.openqa.selenium.WebDriver webDriver, SelenideProxyServer selenideProxy)
     * setWebDriver(org.openqa.selenium.WebDriver webDriver, SelenideProxyServer selenideProxy, DownloadsFolder browserDownloadsFolder)
     * source()	Возвращает: источник (HTML) текущей страницы
     * supportsJavascript()	Поддерживает ли этот браузер javascript?
     * url()	Возвращает: URL текущей страницы.
     */
}
