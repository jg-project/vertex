package com.vertexacademy.liquibase;

import liquibase.Contexts;
import liquibase.LabelExpression;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * Created by user on 13.05.16.
 */
public class TestLiquibase {


    public static void main(String[] args) throws Exception {

        DriverManager.registerDriver(new org.h2.Driver());

        Connection connection = DriverManager.getConnection("jdbc:h2:mem:test_db;DB_CLOSE_DELAY=-1"); //your openConnection logic here

        Database database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection
                (connection));

        Liquibase liquibase = new liquibase.Liquibase("liquibase/com/vertex/service/changelog.xml", new ClassLoaderResourceAccessor(), database);

        liquibase.update(new Contexts(), new LabelExpression());


        execute(connection, "select * from users");
        execute(connection, "select * from accounts");
        execute(connection, "select * from DATABASECHANGELOG");


    }

    private static void execute(Connection connection, String query) throws Exception {
        ResultSet rs = connection.createStatement().executeQuery(query);

        ResultSetMetaData md = rs.getMetaData();
        int cc = md.getColumnCount();
        System.out.println("Results for :" + query);
        for (int i = 1; i <= cc; i++) {
            System.out.print(md.getColumnName(i) + ",");
        }
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= cc; i++) {
                System.out.print(rs.getObject(i) + ",");
            }
            System.out.println();
        }
        rs.close();
    }
}
