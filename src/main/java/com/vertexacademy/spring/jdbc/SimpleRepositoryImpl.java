package com.vertexacademy.spring.jdbc;

import com.vertexacademy.spring.jdbc.dto.SimpleEntity;

import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by user_2 on 29.04.2016.
 */
public class SimpleRepositoryImpl implements SimpleRepository {

    private final DataSource dataSource;

    public SimpleRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public SimpleEntity save(SimpleEntity entity) {
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("insert into myTable(id, name, ts) values (?,?,?)");
            preparedStatement.setInt(1, entity.id);
            preparedStatement.setString(2, entity.name);
            preparedStatement.setLong(3, entity.ts);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entity;
    }

    @Override
    public SimpleEntity get(int id) {
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("select id, name, ts from myTable where id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int entityId = resultSet.getInt("id");
                String name = resultSet.getString("name");
                long ts = resultSet.getLong("ts");
                return new SimpleEntity(id, name, ts);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
