package com.luxoft;
import org.junit.Assert;
import org.junit.Test;
public class ExchangeControllerTest {

    private ExchangeController exchangeController = new ExchangeController();

    @Test
    public void usdCurrency() {
        // given
        String currency = "usd";

        // when
        String result = exchangeController.exchangeRate(currency);

        // then
        Assert.assertEquals("1.00", result);
    }

}
