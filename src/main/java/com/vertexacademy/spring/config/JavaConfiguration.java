package com.vertexacademy.spring.config;

import com.vertexacademy.spring.quotes.ListBasedQuotesProvider;
import com.vertexacademy.spring.quotes.QuotesProvider;
import com.vertexacademy.spring.runner.QuoteRunner;
import com.vertexacademy.spring.runner.RectangleRunner;
import com.vertexacademy.spring.studySpring.IRectangle;
import com.vertexacademy.spring.studySpring.Point;
import com.vertexacademy.spring.studySpring.Rectangle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sergii on 23.04.2016.
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:app.properties")
public class JavaConfiguration {

    @Bean
    SimpleAspect simpleAspect() {
        return new SimpleAspect();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Value("${attemptsNumber:5}")
    int attemptsNumber;

    @Bean
    List<String> quotes() {
        return Arrays.asList(new String[]{
                "Imagination is more important than knowledge. \n\tAlbert Einstein",
                "If music be the food of love, play on. \n\tShakespeare",
                "The way to get started is to quit talking and begin doing. \n\tWalt Disney",
                "Obstacles are those frightful things you see when you take your eyes off the goal. \n\tHenry Ford",
                "I skate where the puck is going to be, not where it has been. \n\tWayne Gretzky",
                "When you come to a fork in the road, take it. \n\tYogi Berra",
                "We may affirm absolutely that nothing great in the world has been accomplished without passion. \n\tHegel",
                "The life which is unexamined is not worth living. \n\tSocrates",
                "Live as if you were to die tomorrow. Learn as if you were to live forever. \n\tM.K. Gandhi",
                "What you get by achieving your goals is not as important as what you become by achieving your goals. \n\tZig Ziglar" });
    }

    @Bean
    int attemptsNumber() {
        return attemptsNumber;
    }

    @Bean
    QuotesProvider quotesProvider() {
        return new ListBasedQuotesProvider(quotes());
    }

    @Bean
    QuoteRunner quoteRunner() {
        return new QuoteRunner();
    }

    @Bean
    Point point1 () {
        return new Point(5,6);
    }

    @Bean
    Point point2 () {
        return new Point(7,8);
    }

    @Bean
    RectangleRunner rectangleRunner(){
        return new RectangleRunner();
    }

    @Bean
    IRectangle rectangle(){
        return new Rectangle(point1(),point2());
    }


}
