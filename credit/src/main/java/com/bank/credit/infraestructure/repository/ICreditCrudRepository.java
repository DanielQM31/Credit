package com.bank.credit.infraestructure.repository;

import com.bank.credit.infraestructure.model.dao.CreditDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ICreditCrudRepository extends ReactiveCrudRepository<CreditDao, String> {
}
