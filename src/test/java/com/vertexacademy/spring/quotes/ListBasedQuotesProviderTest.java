package com.vertexacademy.spring.quotes;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sergii on 23.04.2016.
 */
public class ListBasedQuotesProviderTest {

    @Test
    public void shouldReturnDefaultMessageWhenBaseIsEmpty() {
        assertEquals(ListBasedQuotesProvider.DEFAULT_MESSAGE, new ListBasedQuotesProvider(Collections.<String>emptyList()).getRandomQuote());
    }

    @Test
    public void shouldReturnDefaultMessageWhenBaseIsNull() {
        assertEquals(ListBasedQuotesProvider.DEFAULT_MESSAGE, new ListBasedQuotesProvider(null).getRandomQuote());
    }

    @Test
    public void shouldReturnMessageFromBase() {
        List<String> base = Arrays.asList(new String[]{"a", "B", "cde" });
        String actualQuote = new ListBasedQuotesProvider(base).getRandomQuote();
        assertTrue(base.contains(actualQuote));
    }

}