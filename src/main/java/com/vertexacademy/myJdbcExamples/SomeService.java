package com.vertexacademy.myJdbcExamples;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 02.05.2016.
 */
public class SomeService {

    @Autowired
    SimpleRepository repository;

    SimpleEntity get(int id) {
        return repository.get(id);
    }

    void add(SimpleEntity entity) {
        repository.save(entity);
    }
}

