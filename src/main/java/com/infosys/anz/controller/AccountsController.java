package com.infosys.anz.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.infosys.anz.entity.AccountsEntity;
import com.infosys.anz.service.AccountsService;

@CrossOrigin
@RestController
public class AccountsController {
	
	@Autowired
	private AccountsService accountsService;
	
	@GetMapping(value="/accounts", produces= {"application/json"})
	public List<AccountsEntity> viewAccountList(){
		return accountsService.viewAccountList();
	}
		  
}
