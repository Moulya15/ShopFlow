package com.example.CRUD_Project.Repo;

import com.example.CRUD_Project.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,Long> {
}
