package com.example.CRUD_Project.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name="invoiceId",nullable = false)
    private Invoice invoiceId;

    private LocalDateTime paymentDate;
    private double amount;
    private enum mode{
        CASH, UPI, BANK
    }


}
