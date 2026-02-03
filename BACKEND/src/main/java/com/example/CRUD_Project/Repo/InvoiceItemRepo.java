package com.example.CRUD_Project.Repo;

import com.example.CRUD_Project.Entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemRepo extends JpaRepository<InvoiceItem,Long> {
}
