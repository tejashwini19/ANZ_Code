package com.infosys.anz.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.anz.entity.AccountsEntity;

@Repository
public interface AccountsRepository extends JpaRepository<AccountsEntity, String> {
	

}
