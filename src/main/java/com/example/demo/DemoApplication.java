package com.example.demo;

import com.example.demo.entities.BankAccount;
import com.example.demo.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository){
        return args -> {
            for (int i=1;i<10;i++){
                BankAccount bankAccount= BankAccount.builder().id(UUID.randomUUID().toString()).type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
                        .balance(Math.random()*90000).dateCreation(new Date()).currency("MAD")
                        .build();
                bankAccountRepository.save(bankAccount);
            }
        };
    }

}
