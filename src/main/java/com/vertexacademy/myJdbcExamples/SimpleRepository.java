package com.vertexacademy.myJdbcExamples;

/**
 * Created by user on 02.05.2016.
 */
public interface SimpleRepository {

    SimpleEntity save(SimpleEntity entity);
    SimpleEntity get(int id);
}
