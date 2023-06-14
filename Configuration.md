## Configuration

`static AssertionMode`
assertionMode   Режим утверждения   static String
---
`baseUrl`
Базовый URL для вызовов функции open() Может быть настроен либо программно, через файл selenide.properties, либо системным свойством "-Dselenide.baseUrl=http://myhost".
static String
---
`browser`
Какой браузер использовать. static String
---
`browserBinary`
Устанавливает путь к исполняемому файлу браузера.
static org.openqa.selenium.MutableCapabilities
---
`browserCapabilities`
Возможности браузера.
static String
---
`browserPosition`
Положение окна браузера на экране.
static String
---
`browserSize`
Размер окна браузера.
static String
---
`browserVersion`
Какую версию браузера использовать (для Internet Explorer).
static boolean
---
`clickViaJs`
ВНИМАНИЕ! Автоматическое ожидание WebDriver после клика не работает в случае использования этой функции.
static String
---
`downloadsFolder`
Папка для хранения загруженных файлов.
static boolean
---
`driverManagerEnabled`
Управляет интеграцией Selenide и WebDriverManager.
static boolean
---
`fastSetValue`
Если установлено значение true, значение устанавливается с помощью javascript вместо использования встроенной в Selenium функции «sendKey» (это довольно медленно, поскольку отправляет каждый символ отдельно).
static FileDownloadMode
---
`fileDownload`
Определяет, загружаются ли файлы через прямой HTTP или встроенный прокси-сервер vie selenide. Может быть настроен либо программно, через файл selenide.properties, либо с помощью системного свойства "-Dselenide.fileDownload=PROXY" Поумолчанию: HTTPGET
static boolean
---
`headless`
Включает возможность запуска браузера в автономном режиме.
static boolean
---
`holdBrowserOpen`
Если для HoldBrowserOpen установлено значение true, окно браузера остается открытым после выполнения тестов.
static String
---
`pageLoadStrategy`
Должен ли веб-драйвер ждать полной загрузки страницы.
static long
---
`pageLoadTimeout`
Время ожидания загрузки веб-страницы (в миллисекундах).
static long
---
`pollingInterval`
Интервал в миллисекундах при проверке появления одного элемента или элементов коллекции Может быть настроен программно, через файл selenide.properties или системным свойством "-Dselenide.pollingInterval=50" Значение по умолчанию: 200 (миллисекунд)
static boolean
---
`proxyEnabled`
Если Selenide должен запускать браузер через собственный прокси-сервер.
static String
---
`proxyHost`
Хост прокси-сервера Selenide.
static int
---
`proxyPort`
Порт прокси-сервера Selenide.
static String
---
`remote`
URL удаленного веб-драйвера (в случае использования Selenium Grid).
static long
---
`remoteConnectionTimeout`
Устанавливает время ожидания соединения в миллисекундах для удаленных подключений браузера.
static long
---
`remoteReadTimeout`
Устанавливает время ожидания чтения в миллисекундах для удаленных подключений браузера.
static boolean
---
`reopenBrowserOnFail`
Должен ли Selenide перезапускать браузер, если он пропал (завис, сломался, неожиданно закрылся).
static String
---
`reportsFolder`
Папка для хранения скриншотов.
static String
---
`reportsUrl`
Необязательно: URL-адрес сервера CI, на котором публикуются отчеты.
static boolean
---
`savePageSource`
Определяет, сохраняет ли Selenide исходный код страницы при неудачных тестах.
static boolean
---
`screenshots`
Определяет, будет ли Selenide делать скриншоты при неудачных тестах.
static SelectorMode
---
`selectorMode`
Выберите, как Selenide будет извлекать веб-элементы: используя CSS по умолчанию или Sizzle (CSS3).
static TextCheck
---
`textCheck`
Определите поведение $.shouldHave(text): полный текст или частичный текст.
static long
---
`timeout`
Тайм-аут в миллисекундах для провала теста, если условия все еще не выполнены Может быть настроено либо программно, через файл selenide.properties, либо системным свойством "-Dselenide.timeout=10000"Значение по умолчанию: 4000 (миллисекунд)
static boolean
---
`webdriverLogsEnabled`
Должны ли быть включены журналы веб-драйвера.
---

