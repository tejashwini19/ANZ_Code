package com.infosys.anz.repository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infosys.anz.entity.TransactionsEntity;

@Repository
public interface TransactionsRepository extends JpaRepository<TransactionsEntity,String> {
	
	public List<TransactionsEntity> findByAccountNumber(String accountNumber);

}
