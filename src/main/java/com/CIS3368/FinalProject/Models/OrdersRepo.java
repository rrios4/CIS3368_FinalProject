package com.CIS3368.FinalProject.Models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrdersRepo extends CrudRepository<Orders, String>
{

}
