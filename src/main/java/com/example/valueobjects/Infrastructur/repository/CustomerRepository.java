package com.example.valueobjects.Infrastructur.repository;

import com.example.valueobjects.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID>{
    Optional<Customer> findById(UUID id);
    Optional<Customer> findCustomerByPhoneNumber(String phoneNummer);

}
