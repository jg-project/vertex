package com.vertexacademy.spring;

import com.vertexacademy.spring.config.JavaConfiguration;
import com.vertexacademy.spring.runner.QuoteRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sergii on 23.04.2016.
 */
public class JavaConfigSpringApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        QuoteRunner runner = ctx.getBean(QuoteRunner.class);

        new Thread(runner).start();


    }
}
