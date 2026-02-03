package com.example.CRUD_Project.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class InvoiceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceItemId;

    @ManyToOne
    @JoinColumn(name="invoiceId", nullable = false)
    private Invoice invoiceId;

    private String description;
    private int qty;
    private double unitPrice;
    private double lineTotal;
}
