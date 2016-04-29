package com.vertexacademy.spring.jdbc;

import com.vertexacademy.spring.jdbc.dto.SimpleEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user_2 on 29.04.2016.
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
