package com.CIS3368.FinalProject.Models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface OrdersRepo extends CrudRepository<Orders, String>
{
   /* @Query("SELECT new com.CIS3368.FinalProject.OrderResponse(o.orderid, o.orderdate, o.ordertotal) FROM finalProject_db.order_table o JOIN finalProject_db.employee e ON e.employeeid=o.employeeid; ")
    public List<OrderResponse> getJoinOrderInfo();*/

}
