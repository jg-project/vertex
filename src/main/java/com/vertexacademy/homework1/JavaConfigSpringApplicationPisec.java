package com.vertexacademy.homework1;

import com.vertexacademy.homework1.config.JavaConfigPisec;
import com.vertexacademy.homework1.runner.PisecRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Дмитрий on 26.04.2016.
 */
public class JavaConfigSpringApplicationPisec {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigPisec.class);

        PisecRunner runner = ctx.getBean(PisecRunner.class);

        new Thread(runner).start();
    }

}
