package com.example.CRUD_Project.Repo;

import com.example.CRUD_Project.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
    boolean existsByMobile( String mobile);
}
