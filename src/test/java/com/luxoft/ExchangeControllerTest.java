package com.luxoft;
import org.junit.Assert;
import org.junit.Test;
public class ExchangeControllerTest {

    private ExchangeController exchangeController = new ExchangeController();

    @Test
    public void testMessage(){
        Assert.assertEquals("not equal","heLLo Name",exchangeController.hello("Name"));
    }

}
