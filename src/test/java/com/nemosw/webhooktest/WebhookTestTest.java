package com.nemosw.webhooktest;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author Nemo
 */
public class WebhookTestTest
{
    @Test
    public void test()
    {
        WebhookTest test = new WebhookTest();
        assertEquals(test.getHelloMessage(), "Hello World!");
    }
}
