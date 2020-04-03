package com.infosys.anz.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TransactionTable")
public class TransactionsEntity {
	
	
	@Id
	@GeneratedValue
	private int transactionId;
	private String accountNumber;
	private String accountName;
	private String valueDate;
	private String currency;
	private String debitAmount;
	private Double creditAmount;
	private String debitOrCredit;
	private String transactionNarrative = "";
	

	public TransactionsEntity() {
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

	public String getValueDate() {
		return valueDate;
	}


	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}


	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public String getDebitAmount() {
		return debitAmount;
	}



	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}

	public Double getCreditAmount() {
		return creditAmount;
	}



	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}



	public String getTransactionNarrative() {
		return transactionNarrative;
	}



	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}


	public String getDebitOrCredit() {
		return debitOrCredit;
	}


	public void setDebitOrCredit(String debitOrCredit) {
		this.debitOrCredit = debitOrCredit;
	}
	
}
