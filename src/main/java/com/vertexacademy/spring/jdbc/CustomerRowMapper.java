package com.vertexacademy.spring.jdbc;

import com.vertexacademy.spring.jdbc.dto.SimpleEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Дмитрий on 04.05.2016.
 */
public class CustomerRowMapper implements RowMapper {


    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        long ts = rs.getLong("ts");
        return new SimpleEntity(id, name, ts);
    }
}