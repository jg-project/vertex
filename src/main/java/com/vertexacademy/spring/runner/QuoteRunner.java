package com.vertexacademy.spring.runner;

import com.vertexacademy.spring.quotes.QuotesProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Sergii on 23.04.2016.
 */
public class QuoteRunner implements Runnable {

    @Autowired
    private QuotesProvider quotesProvider;

    @Autowired
    private int attemptsNumber;


    @Override
    public void run() {
        int attemptCounter = 0;

        while (attemptCounter++ < attemptsNumber) {
            System.out.println(quotesProvider.getRandomQuote());
        }
    }
}
