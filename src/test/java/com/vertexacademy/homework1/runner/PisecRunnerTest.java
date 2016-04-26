package com.vertexacademy.homework1.runner;

import com.vertexacademy.homework1.config.JavaConfigPisec;
import com.vertexacademy.spring.config.JavaConfiguration;
import com.vertexacademy.spring.runner.RectangleRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Дмитрий on 26.04.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfigPisec.class)

public class PisecRunnerTest {

        @Autowired
        PisecRunner pisecRunner;

        @Test
        public void testPisecRunnerCanStartUp() {
            pisecRunner.run();

        }
}
