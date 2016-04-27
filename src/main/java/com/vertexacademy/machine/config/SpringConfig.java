package com.vertexacademy.machine.config;

import com.vertexacademy.machine.Runner;
import com.vertexacademy.machine.writers.Writer;
import com.vertexacademy.machine.writers.WriterImpl;
import com.vertexacademy.machine.WriterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by RASTA on 27.04.2016.
 */
@Configuration
@ComponentScan("com.vertexacademy.machine")
@PropertySource("classpath:app.properties")
public class SpringConfig {

    @Value("${path}")
    private String path;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    @Autowired
    WriterProvider writerProvider(@Value("#{writers}") List<Writer> writers) {
        return new WriterProvider(writers);
    }

    @Bean(name = "writers")
    List<Writer> getWriters() {
        List<Writer> writers = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()) {
            String authorName = scanner.nextLine();
            String opus = "";
            String temp;
            while (scanner.hasNext() && !(temp = scanner.nextLine()).equals("")) {
                opus += temp + "\n";
            }
            Writer writer = new WriterImpl(authorName, opus);
            writers.add(writer);
        }
        return writers;
    }

    @Bean
    Runner runner() {
        return new Runner();
    }
}