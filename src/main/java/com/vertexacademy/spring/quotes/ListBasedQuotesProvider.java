package com.vertexacademy.spring.quotes;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Sergii on 23.04.2016.
 */
public class ListBasedQuotesProvider implements QuotesProvider {

    public static final String DEFAULT_MESSAGE = "To code or not to code!";
    private final List<String> quotesBase;

    public ListBasedQuotesProvider(List<String> quotesBase) {
        this.quotesBase = quotesBase;
    }


    @Override
    public String getRandomQuote() {
        return (quotesBase == null || quotesBase.size() == 0) ? DEFAULT_MESSAGE : quotesBase.get(ThreadLocalRandom.current().nextInt(quotesBase.size()));
    }
}
