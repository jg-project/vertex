package com.vertexacademy.mymachine;

import static org.junit.Assert.*;

/**
 * Created by user on 27.04.2016.
 */
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MyMachineConfig.class)

public class MyMachineTest {



    @Autowired
    private Genius talker;
    @Test
    public void talkerShouldNotBeNull() {
        assertNotNull(talker);
    }

    @Test
    public void Say() {
        talker.say();
        assertEquals("To be or not to be. That is the question",
                talker.getPhrase());
    }

    }



