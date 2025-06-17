package com.pluralsight.restforthewicked.employees;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDaoInterface {
    List<Employee> getEmployees() throws SQLException;
}
