package com.vertexacademy.machine;

import com.vertexacademy.machine.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by RASTA on 27.04.2016.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Runner runner = context.getBean(Runner.class);
        runner.start();

    }
}
