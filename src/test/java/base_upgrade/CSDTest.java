package base_upgrade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.PageObject;

public class CSDTest extends ConfigurationSelenideDocker {
    @Test
    public void checkCurrencyTest() {
        PageObject po = new PageObject();
        double usd = po.parserCurrency(po.getTextUSD());
        double eur = po.parserCurrency(po.getTextEUR());

        Assertions.assertNotEquals(usd, eur, "USD < EUR");

        System.out.println(usd);
        System.out.println(eur);
    }
}
