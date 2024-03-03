package com.accounts.Ecommercetranctions.repositry;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accounts.Ecommercetranctions.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}
