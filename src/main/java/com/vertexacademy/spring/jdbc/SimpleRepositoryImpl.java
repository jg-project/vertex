package com.vertexacademy.spring.jdbc;

import com.vertexacademy.spring.jdbc.dto.SimpleEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//import javax.sql.DataSource;

/**
 * Created by user_2 on 29.04.2016.
 */
public class SimpleRepositoryImpl implements SimpleRepository {

    private final JdbcTemplate myRepo;


    public SimpleRepositoryImpl(JdbcTemplate myRepo) {
        this.myRepo = myRepo;
    }

//    private final DataSource dataSource;

//    public SimpleRepositoryImpl(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }


    @Override
    public SimpleEntity save(SimpleEntity entity) {
        String query = "insert into myTable(id, name, ts) values (?,?,?)";
        myRepo.update(query,
                entity.getId(),
                entity.getName(),
                entity.getTs());
        return entity;
    }

//    @Override
//    public SimpleEntity save(SimpleEntity entity) {
//        try {
//            Connection conn = dataSource.getConnection();
//            PreparedStatement preparedStatement = conn.prepareStatement("insert into myTable(id, name, ts) values (?,?,?)");
//            preparedStatement.setInt(1, entity.id);
//            preparedStatement.setString(2, entity.name);
//            preparedStatement.setLong(3, entity.ts);
//            preparedStatement.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return entity;
//    }

    @Override
    public SimpleEntity get(int id) {
        String query = "select id, name, ts from myTable where id = ?";
        RowMapper<SimpleEntity> mapper = new RowMapper<SimpleEntity>() {
            @Override
            public SimpleEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                long ts = rs.getLong("ts");
                SimpleEntity entity = new SimpleEntity(id, name, ts);
                return entity;
            }
        };
        return myRepo.queryForObject(query, mapper, id);
    }
}
//    @Override
//    public SimpleEntity get(int id) {
//        try {
//            Connection conn = dataSource.getConnection();
//            PreparedStatement preparedStatement = conn.prepareStatement("select id, name, ts from myTable where id = ?");
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                int entityId = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                long ts = resultSet.getLong("ts");
//                return new SimpleEntity(entityId, name, ts);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
