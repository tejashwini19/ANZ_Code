package com.infosys.anz.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AccountsTable")
public class AccountsEntity {
	
	@Id
	private String accountNumber;
	private String accountName;
	private String accountType;
	private String balanceDate;
	private String currency;
	private Double avalBalance;
	
	public AccountsEntity() {
		//default constructor
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAvalBalance() {
		return avalBalance;
	}
	public void setAvalBalance(Double avalBalance) {
		this.avalBalance = avalBalance;
	}
	
}
