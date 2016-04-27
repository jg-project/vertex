package com.vertexacademy.homework1.config;

import com.vertexacademy.homework1.pisec.*;
import com.vertexacademy.homework1.runner.PisecRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Дмитрий on 26.04.2016.
 */

@Configuration
public class JavaConfigPisec {

    @Bean
    PisecRunner pisecRunner(){
        return new PisecRunner();
    }


   Genius genius(){
       return new Pisec().getRandomGenius();
   }

    @Bean
    Pisec pisec(){
        return new Pisec(genius());
    }

    @Bean
    Poet poet(){
        return new Poet();
    }

    @Bean
    ProverbWriter proverbWriter(){
        return new ProverbWriter();
    }

    @Bean
    Songwriter songwriter(){
        return new Songwriter();
    }



}
