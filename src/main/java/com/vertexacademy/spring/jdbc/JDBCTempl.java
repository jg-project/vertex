package com.vertexacademy.spring.jdbc;

import com.vertexacademy.spring.jdbc.dto.SimpleEntity;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by RASTA on 03.05.2016.
 */
public class JDBCTempl implements SimpleRepository {
    private JdbcTemplate template;

    private static final String INSERT_SQL = "insert into myTable(id, name, ts) values(?, ?, ?)";
    private static final String SELECT_SQL = "select * from myTable where id = ?";

    public JDBCTempl(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public SimpleEntity save(SimpleEntity entity) {
        template.update(INSERT_SQL, new Object[]{entity.id, entity.name, entity.ts});
        return entity;
    }

    @Override
    public SimpleEntity get(int id) {
        SimpleEntity simpleEntity = (SimpleEntity) template.queryForObject(SELECT_SQL, new Object[]{id}, new CustomRowMapper());
        return simpleEntity;
    }
}
