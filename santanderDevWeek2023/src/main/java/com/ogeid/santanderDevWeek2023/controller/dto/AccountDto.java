package com.ogeid.santanderDevWeek2023.controller.dto;

import com.ogeid.santanderDevWeek2023.domain.model.Account;

import java.math.BigDecimal;

public record AccountDto(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {

    public AccountDto(Account model) {
        this(model.getId(), model.getNumber(), model.getAgency(), model.getAccountBalance(), model.getLimit());
    }

    public Account toModel() {
        Account model = new Account();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setAgency(this.agency);
        model.setAccountBalance(this.balance);
        model.setLimit(this.limit);
        return model;
    }
}
