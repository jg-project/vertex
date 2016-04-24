package com.vertexacademy.spring;

import com.vertexacademy.spring.runner.QuoteRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sergii on 23.04.2016.
 */
public class XmlSpringApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        QuoteRunner runner = ctx.getBean(QuoteRunner.class);

        new Thread(runner).start();


    }
}
