package com.vertexacademy.spring.jdbc;

import com.vertexacademy.spring.jdbc.dto.SimpleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import static org.junit.Assert.*;

/**
 * Created by user_2 on 29.04.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SomeServiceTest.Conf.class)
public class SomeServiceTest {

    @Autowired
    SomeService someService;

    @Configuration
    public static class Conf {

        @Bean
        SomeService someService() {
            return new SomeService();
        }

        @Bean
        SimpleRepository simpleRepository(DataSource dataSource) {
            return new JdbcTemplateImpl(dataSource);
        }

        @Bean
        DataSource dataSource() {
            return new EmbeddedDatabaseBuilder()
                    .setType(EmbeddedDatabaseType.HSQL)
                    .addScript("classpath:create.sql")
                    .addScript("classpath:insert.sql")
                    .build();
        }
    }

    @Test
    public void get() throws Exception {
        SimpleEntity expected = new SimpleEntity(1, "one", 100);
        SimpleEntity actual = someService.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void add() throws Exception {
        SimpleEntity expected = new SimpleEntity(4, "four", 400000);
        someService.add(expected);
        assertEquals(expected, someService.get(expected.id));
    }

}