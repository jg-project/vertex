package com.vertexacademy.myJdbcExamples;


import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by user on 02.05.2016.
 */
@Component
public class SomeClass {
    @Resource(name = "myString")
    private List<String> myString;

    public void doIt() {
        System.out.println(myString);
          }

}
