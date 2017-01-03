package com.greenfox;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Rita on 2016.12.22..
 */
public interface OrderRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(Customer customer);
}
