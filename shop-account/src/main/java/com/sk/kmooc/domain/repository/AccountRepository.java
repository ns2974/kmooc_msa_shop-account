package com.sk.kmooc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.kmooc.domain.model.Account;

@RepositoryRestResource
public interface AccountRepository extends JpaRepository<Account, Long> {
	
	Account findByName(@Param("name") String name);
}
