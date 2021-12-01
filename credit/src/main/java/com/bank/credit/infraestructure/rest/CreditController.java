package com.bank.credit.infraestructure.rest;

import com.bank.credit.application.CreditOperations;
import com.bank.credit.domain.Credit;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/credits")
@RequiredArgsConstructor
public class CreditController {

    private final CreditOperations creditOperations;

    @GetMapping
    public Flux<Credit> get() {
        return  creditOperations.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Credit> getId(@PathVariable String id){
        return creditOperations.findById(id);
    }

    @PostMapping("/add")
    public Mono<Credit> post(@RequestBody Credit credit){
        return creditOperations.save(credit);
    }

    @PutMapping("/{id}")
    public Mono<Credit> put(@PathVariable String id, @RequestBody Credit credit){
        return creditOperations.update(id, credit);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return creditOperations.delete(id);
    }

}
