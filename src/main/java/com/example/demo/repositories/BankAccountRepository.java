package com.example.demo.repositories;

import com.example.demo.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
