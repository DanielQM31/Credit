package com.bank.credit.infraestructure.repository;

import com.bank.credit.application.model.CreditRepository;
import com.bank.credit.domain.Credit;
import com.bank.credit.infraestructure.model.dao.CreditDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CreditCrudRepository implements CreditRepository {

    @Autowired
    ICreditCrudRepository repository;

    @Override
    public Flux<Credit> findAll() {
        return repository.findAll()
                .map(this::mapCreditDaoToCredit);
    }

    @Override
    public Mono<Credit> findById(String id) {
        return repository.findById(id)
                .map(this::mapCreditDaoToCredit);
    }

    @Override
    public Mono<Credit> save(Credit credit) {
        return repository.save(mapCreditToCreditDao(credit))
                .map(this::mapCreditDaoToCredit);
    }

    @Override
    public Mono<Credit> update(String id, Credit credit) {
        return repository.save(mapCreditToCreditDao(credit))
                .map(this::mapCreditDaoToCredit);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    private Credit mapCreditDaoToCredit(CreditDao creditDao){
        Credit credit = new Credit();
        BeanUtils.copyProperties(creditDao, credit);
        return credit;
    }

    private CreditDao mapCreditToCreditDao(Credit credit){
        CreditDao creditDao = new CreditDao();
        BeanUtils.copyProperties(credit, creditDao);
        return creditDao;
    }

}
