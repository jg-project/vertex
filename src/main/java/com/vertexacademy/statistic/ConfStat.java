package com.vertexacademy.statistic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vasyl on 24/04/2016.
 */
@Configuration
public class ConfStat {
    @Bean
    MyStatisic myStatisic() {
        return new MyStatisic();
    }
}
