package com.ogeid.santanderDevWeek2023.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String Number;

    private String Agency;

    @Column(scale = 2, precision = 13 )
    private BigDecimal accountBalance;

    @Column(name = "additional_limit",scale = 2, precision = 13 )
    private BigDecimal limit;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String accountNumber) {
        this.Number = accountNumber;
    }

    public void setAgency(String accountAgency) {
        this.Agency = accountAgency;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setLimit(BigDecimal accountLimit) {
        this.limit = accountLimit;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return Number;
    }

    public String getAgency() {
        return Agency;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public BigDecimal getLimit() {
        return limit;
    }
}
