package com.ogeid.santanderDevWeek2023.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "Available_limit",scale = 2, precision = 13)
    private BigDecimal limit;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getLimit() {
        return limit;
    }
}
