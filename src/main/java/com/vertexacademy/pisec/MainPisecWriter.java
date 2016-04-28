package com.vertexacademy.pisec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Vasyl on 28/04/2016.
 */
public class MainPisecWriter {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfMascine.class);
        WriteMascine writeMascine = ctx.getBean(WriteMascine.class);
        writeMascine.writeText();
    }
}
