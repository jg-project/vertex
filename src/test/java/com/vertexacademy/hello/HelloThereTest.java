package com.vertexacademy.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloThereTest {

    @Test
    public void testGetMessage() throws Exception {
        assertEquals(HelloThere.HELLO_MESSAGE, new HelloThere().getMessage());
    }
}