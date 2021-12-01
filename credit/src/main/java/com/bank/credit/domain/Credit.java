package com.bank.credit.domain;

import lombok.Data;

@Data
public class Credit {

    private String id;
    private String idCreditType;
    private String idClient;
    private Double creditLimit;
    private Double credit;

}
