package com.vertexacademy.spring.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Sergii on 23.04.2016.
 */
@Aspect
public class SimpleAspect {

    @Before("execution(**com.vertexacademy.spring.quotes.QuotesProvider.getRandomQuote(..))")
    public void doWeirdStuff() {
        System.out.println("Simon says:");
    }
}
