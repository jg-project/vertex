package com.vertexacademy.pisec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Vasyl on 28/04/2016.
 */
@Configuration
public class ConfMascine {
    @Bean
    WriteMascine writeMascine() {
        return new WriteMascine();
    }

    @Bean
    Writeable writeable() {
        Writeable[] temp = {new Poet(), new Epistolar(), new Prosaic()};
        return temp[ThreadLocalRandom.current().nextInt(3)];
    }
}
