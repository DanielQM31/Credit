package com.bank.credit.application.impl;

import com.bank.credit.application.CreditOperations;
import com.bank.credit.application.model.CreditRepository;
import com.bank.credit.domain.Credit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreditOperationsImpl implements CreditOperations {

    private final CreditRepository repository;

    @Override
    public Flux<Credit> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Credit> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Credit> save(Credit credit) {
        return repository.save(credit);
    }

    @Override
    public Mono<Credit> update(String id, Credit credit) {
        return repository.update(id, credit);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.delete(id);
    }
}
