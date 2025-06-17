package com.pluralsight.restforthewicked.employees;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDao implements EmployeeDaoInterface {
    BasicDataSource dataSource = new BasicDataSource();

    public EmployeeDao(@Value("${spring.datasource.url}") String url,
                       @Value("${spring.datasource.username}") String username) {
        dataSource.setUrl(url);
        dataSource.setUsername(username);
    }


    @Override
    public List<Employee> getEmployees() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "select * from employees;";
        ResultSet resultSet = statement.executeQuery(sql);

        List<Employee> employees = new ArrayList<>();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            employees.add(new Employee(name));
        }

        return employees;
    }

}
