package com.example.CRUD_Project.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;

    @ManyToOne
    @JoinColumn(name="customerId", nullable = false)
    private Customer customerId;

    private LocalDateTime invoiceDate=LocalDateTime.now();
    private enum status{
            DRAFT, ISSUED, PAID, PARTIAL;
    };
    private double gstPercent;
}
