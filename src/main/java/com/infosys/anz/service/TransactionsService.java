package com.infosys.anz.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.anz.entity.TransactionsEntity;
import com.infosys.anz.repository.TransactionsRepository;

@Service
public class TransactionsService {
	
	@Autowired
	private TransactionsRepository transactionsRepository;

	public List<TransactionsEntity> viewAccountTransactions(String accountNumber) {
		
		List<TransactionsEntity> transactions = new ArrayList<>();
		transactionsRepository.findByAccountNumber(accountNumber)
		.forEach(transactions::add);
		return transactions;
		
	}

}
