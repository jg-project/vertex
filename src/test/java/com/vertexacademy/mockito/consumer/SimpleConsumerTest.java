package com.vertexacademy.mockito.consumer;

import com.vertexacademy.mockito.resources.ExpensiveResource;
import com.vertexacademy.mockito.resources.ExpensiveResourceImpl;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Created by Sergii on 23.04.2016.
 */
public class SimpleConsumerTest {

    ExpensiveResource resource;

    SimpleConsumer consumer;

    @Before
    public void setUp() {
        resource = mock(ExpensiveResource.class);

        consumer = new SimpleConsumer(resource);
    }

    @Test
    public void shouldProcessNonEmptyResponse() throws Exception {
        when(resource.getPreciousValue()).thenReturn("100500");

        int actual = consumer.processResourceResponse();

        assertEquals(6, actual);
        verify(resource,times(1)).getPreciousValue();
    }

    @Test
    public void slowTestWithRealObject() throws Exception {
        consumer = new SimpleConsumer(new ExpensiveResourceImpl());

        int actual = consumer.processResourceResponse();

        assertTrue(6 < actual);
    }
}