package com.loan_management.entity;

import javax.persistence.*;

@Entity
@Table(name = "borrower_info")
public class BorrowerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_id", unique = true)
    private String clientId;

    @Column(name = "income")
    private double income;

    @Column(name = "financial_situation")
    private boolean financialSituation;

    public Long getId() {
        return id;
    }

    public String getClientId() {
        return clientId;
    }

    public double getIncome() {
        return income;
    }

    public boolean getFinancialSituation() {
        return financialSituation;
    }
}