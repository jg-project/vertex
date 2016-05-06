package com.vertexacademy.myJdbcExamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 02.05.2016.
 */
@Configuration
@ComponentScan
public class SomeConfig {
    @Bean
    List<String> myString() {
    return new ArrayList<String>() {
        {
            add("one");
            add("two");

        }

    };
    }
}
