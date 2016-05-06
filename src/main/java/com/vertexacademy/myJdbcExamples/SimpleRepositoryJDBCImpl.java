package com.vertexacademy.myJdbcExamples;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by user on 06.05.2016.
 */
public class SimpleRepositoryJDBCImpl implements SimpleRepository {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public SimpleRepositoryJDBCImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public SimpleEntity save(SimpleEntity entity) {
        String s = "insert into myTable(id, name, ts) values (?,?,?)";
        jdbcTemplate.update(s, entity.getId(), entity.getName(), entity.getTs());
        System.out.println(entity.getId() + " " + entity.getName() + " " + entity.getTs());

        return entity;
    }

    @Override
    public SimpleEntity get(int id) {
        String s = "select id, name, ts from myTable where id = ?";
        return jdbcTemplate.queryForObject(s, new SimpleEntityRowMapper(), id);

    }

    class SimpleEntityRowMapper implements RowMapper<SimpleEntity> {


        public SimpleEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

            SimpleEntity ent = new SimpleEntity();
            ent.setId(rs.getInt("id"));
            ent.setName(rs.getString("name"));
            ent.setTs(rs.getLong("ts"));
            return ent;
        }

    }
}
