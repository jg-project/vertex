package com.vertexacademy.spring.jdbc;

import com.vertexacademy.spring.jdbc.dto.SimpleEntity;

/**
 * Created by user_2 on 29.04.2016.
 */
public interface SimpleRepository {
    SimpleEntity save(SimpleEntity entity);

    SimpleEntity get(int id);
}
