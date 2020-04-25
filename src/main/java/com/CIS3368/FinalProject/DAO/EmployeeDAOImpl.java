package com.CIS3368.FinalProject.DAO;

import com.CIS3368.FinalProject.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDao {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void insertEmployee(Employee employee) {
        String sql = "INSERT INTO employee " + "(employeeid, employeefirstname,employeelastname) VALUES (?,?)";
        getJdbcTemplate().update(sql, new Object[]{employee.getEmployeeId(),employee.getEmployeeFirstName(),employee.getEmployeeLastName()});
    }

    @Override
    public void deleteEmployeeById(String employeeId) {

    }
}
