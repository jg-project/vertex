package com.vertexacademy.mockito.consumer;

import com.vertexacademy.mockito.resources.ExpensiveResource;

/**
 * Created by Sergii on 23.04.2016.
 */
public class SimpleConsumer {
    private final ExpensiveResource resource;


    public SimpleConsumer(ExpensiveResource resource) {
        this.resource = resource;
    }

    public int processResourceResponse() {
        return resource.getPreciousValue().length();
    }
}

