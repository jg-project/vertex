package com.vertexacademy.spring.autoconfig;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by user_2 on 24.04.2016.
 */
@Component
public class SomeClass {

    @Resource(name = "myString")
    private List<String> myString;

    public void doIt() {
        System.out.println(myString);
    }
}
