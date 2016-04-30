package com.vertexacademy.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user_2 on 24.04.2016.
 */
@Configuration
@ComponentScan("com.vertexacademy.spring.autoconfig")
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
