package com.vertexacademy.spring;

import com.vertexacademy.spring.autoconfig.SomeClass;
import com.vertexacademy.spring.config.SomeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sergii on 23.04.2016.
 */
public class JavaConfigSpringApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SomeConfig.class);

        SomeClass someClass = ctx.getBean(SomeClass.class);

        someClass.doIt();


    }
}
