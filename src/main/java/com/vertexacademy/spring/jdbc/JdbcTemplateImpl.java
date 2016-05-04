package com.vertexacademy.spring.jdbc;

import com.vertexacademy.spring.jdbc.dto.SimpleEntity;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by Дмитрий on 04.05.2016.
 */
public class JdbcTemplateImpl implements SimpleRepository {

    JdbcTemplate jdbcTemplate;

    JdbcTemplateImpl(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private final String insertSQL = "insert into myTable(id, name, ts) values (?,?,?)";
    private final String selectSQL = "select id, name, ts from myTable where id = ?";

    @Override
    public SimpleEntity save(SimpleEntity entity) {
        jdbcTemplate.update(insertSQL,new Object[] { entity.id, entity.name,entity.ts });
        return entity;
    }

    @Override
    public SimpleEntity get(int id) {
        SimpleEntity simpleEntity = (SimpleEntity) jdbcTemplate.queryForObject(selectSQL,new Object[]{id},new CustomerRowMapper());
        return simpleEntity;
    }
}
