package com.bank.credit.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("credit")
public class CreditDao {

    @Id
    private String id;
    private String idCreditType;
    private String idClient;
    private Double creditLimit;
    private Double credit;

}
