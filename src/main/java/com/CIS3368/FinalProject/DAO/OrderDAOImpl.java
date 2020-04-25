package com.CIS3368.FinalProject.DAO;

import com.CIS3368.FinalProject.Models.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class OrderDAOImpl extends JdbcDaoSupport implements OrderDAO {

    @Autowired
    DataSource dataSource;
    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    /*@Override
    public void registerOrderInfo(Orders order) {
        String sql = "INSERT INTO order_table " + "(orderid, employeeid, customerid, orderdate, ordertotal) VALUES (?,?,?,?,?)";
        getJdbcTemplate().update(sql,
                new Object[]{ order.getOrderId(), order.getEmployeeId(), order.getCustomerId(), order.getOrderDate(), order.getOrderTotal() });
    }*/

    @Override
    public void deleteOrderInfo(String orderId) {
        String sql = "DELETE FROM order_table WHERE orderid = ?";
        getJdbcTemplate().update(sql, new Object[]{orderId});

    }
    /*
    @Override
    public void joinOrder(Orders join) {
        String sql = "SELECT (o.orderid, o.orderdate, o.ordertotal) FROM order_table o JOIN employee e ON e.employeeid= o.employeeid";
        getJdbcTemplate().update(sql,
                new Object[]{join.getOrderDate(), join.getOrderTotal(), join.get});
    }*/

    @Override
    public void registerOrderInfo(Orders order) {
        String sql = "INSERT INTO order_table " + "(orderid, employeeid, customerid, orderdate, ordertotal) VALUES (?,?,?,?,?)";
        getJdbcTemplate().update(sql,
                new Object[]{ order.getOrderId(), order.getEmployeeId(), order.getCustomerId(), order.getOrderDate(), order.getOrderTotal() });
    }
}
