package com.vertexacademy.spring.runner;

import com.vertexacademy.spring.config.JavaConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Sergii on 23.04.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfiguration.class)
public class QuoteRunnerTest {

    @Autowired
    QuoteRunner quoteRunner;

    @Test
    public void testQuoteRunnerCanStartUp() {
        quoteRunner.run();
    }

}