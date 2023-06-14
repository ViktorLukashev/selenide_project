package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PageObject {
    private final SelenideElement usdMOEX = $x("//a[@title='USD MOEX']/span");

    private final SelenideElement eurMOEX = $x("//a[@title='EUR MOEX']/span");
    private final SelenideElement weather = $x("//a[@data-statlog='informers.weather']");


    public String getTextUSD() {
        return usdMOEX.getText();
    }

    public String getTextEUR() {
        return eurMOEX.getText();
    }

    public double parserCurrency(String currency) {

        String numberString = currency.replaceAll("[^\\d.,]", "");
        return Double.parseDouble(numberString.replace(",", "."));
    }

}
