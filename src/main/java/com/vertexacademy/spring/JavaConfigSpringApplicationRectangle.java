package com.vertexacademy.spring;


import com.vertexacademy.spring.config.JavaConfiguration;
import com.vertexacademy.spring.runner.RectangleRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Дмитрий on 26.04.2016.
 */
public class JavaConfigSpringApplicationRectangle {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        RectangleRunner runner = ctx.getBean(RectangleRunner.class);

        new Thread(runner).start();
    }

}
