package com.ogeid.santanderDevWeek2023.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String accountNumber;

    private String accountAgency;

    @Column(scale = 2, precision = 13 )
    private BigDecimal accountBalance;

    @Column(name = "additional_limit",scale = 2, precision = 13 )
    private BigDecimal accountLimit;

    public void setId(Long id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountAgency(String accountAgency) {
        this.accountAgency = accountAgency;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountLimit(BigDecimal accountLimit) {
        this.accountLimit = accountLimit;
    }

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountAgency() {
        return accountAgency;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public BigDecimal getAccountLimit() {
        return accountLimit;
    }
}
