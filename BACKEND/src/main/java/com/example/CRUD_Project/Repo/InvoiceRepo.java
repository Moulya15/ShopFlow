package com.example.CRUD_Project.Repo;

import com.example.CRUD_Project.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepo extends JpaRepository<Invoice,Long> {
}
