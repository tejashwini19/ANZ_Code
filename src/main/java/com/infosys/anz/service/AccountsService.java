package com.infosys.anz.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.anz.entity.AccountsEntity;
import com.infosys.anz.repository.AccountsRepository;

@Service
public class AccountsService {
	
	@Autowired
	private AccountsRepository accountsRepository;

	public List<AccountsEntity> viewAccountList() {
		return accountsRepository.findAll();
	}



}
