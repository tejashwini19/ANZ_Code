package com.infosys.anz.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.anz.entity.TransactionsEntity;
import com.infosys.anz.service.TransactionsService;

@RestController
public class TransactionsController {
	
	@Autowired
	private TransactionsService transactionsService;
	
	// Fetches transaction details of a specific account
	
	@RequestMapping(value = "/accounts/{accountNumber}/transactions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TransactionsEntity> viewAccountTransactions(@PathVariable String accountNumber) {
		return transactionsService.viewAccountTransactions(accountNumber);
	}
	

}
