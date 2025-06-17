package com.pluralsight.restforthewicked.employees;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class EmployeeDao {
    BasicDataSource dataSource = new BasicDataSource();

    public EmployeeDao(
            String url,
            String username) {
        dataSource.setUrl(url);
        dataSource.setUsername(username);
    }


}
