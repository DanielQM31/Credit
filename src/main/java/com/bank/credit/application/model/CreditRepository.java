package com.bank.credit.application.model;

import com.bank.credit.domain.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditRepository {

    public Flux<Credit> findAll();
    public Mono<Credit> findById(String id);
    public Mono<Credit> save(Credit credit);
    public Mono<Credit> update(String id, Credit credit);
    public Mono<Void> delete(String id);


}
