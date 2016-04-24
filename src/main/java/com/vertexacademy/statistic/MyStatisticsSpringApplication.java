package com.vertexacademy.statistic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Created by Sergii on 23.04.2016.
 */
public class MyStatisticsSpringApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfStat.class);

        MyStatisic myStatisic = ctx.getBean(MyStatisic.class);

        try {
            double average = myStatisic.findAverage(Arrays.asList(new Integer[]{1, 2, 3}));
            System.out.println(average);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
