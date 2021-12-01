package com.bank.credit.infraestructure.spring.config;

import com.bank.credit.application.model.CreditRepository;
import com.bank.credit.domain.Credit;
import com.bank.credit.infraestructure.repository.CreditCrudRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public CreditRepository repository() {
        return new CreditCrudRepository();
    }

}
