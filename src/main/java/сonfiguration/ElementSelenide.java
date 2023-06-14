package сonfiguration;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

interface ElementSelenide {
    private void selenide() {
        SelenideElement cssSelector = $("String cssSelector"); // – возвращает объект типа SelenideElement, который представляет первый найденный по CSS селектору элемент на странице
        SelenideElement xpath = $x("String xpath"); // – возвращает объект типа SelenideElement, который представляет первый найденный по CSS селектору элемент на странице
        ElementsCollection cssSelectorCollection = $$("String cssSelector"); // –возвращает объект типа ElementsCollection, коллекцию всех элементов
        ElementsCollection xpathCollection = $$x("String cssSelector"); // –возвращает объект типа ElementsCollection, коллекцию всех элементов
        ElementsCollection className = $$(By.className("")); // –возвращает "коллекцию элементов" по локатору типа By


        //SelenideElement byCssSelector = $(By.cssSelector("")); // –возвращает "первый SelenideElement" по локатору типа By


        $(byXpath("//*[@id='search-results']//a[contains(text(),'selenide.org')]"));
        SelenideElement byName = $(byName("password"));
        $(By.xpath("//div[text()='Login']")).shouldBe(visible); // можно использовать любой org.openqa.selenium.By.* селектор
        $(byXpath("//div[text()='Login']")).shouldBe(visible); // или его аналог из Selectors
    }
}
