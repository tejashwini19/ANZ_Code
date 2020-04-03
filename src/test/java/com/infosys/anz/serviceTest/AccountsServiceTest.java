package com.infosys.anz.serviceTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import com.infosys.anz.entity.AccountsEntity;
import com.infosys.anz.repository.AccountsRepository;
import com.infosys.anz.service.AccountsService;


@RunWith(SpringRunner.class)
public class AccountsServiceTest {
	
	@InjectMocks
	private AccountsService accountsService;
	
	@Mock
	private AccountsRepository accountsRepo;
	
	 @Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	 
	
	@Test
	public void viewAccountListTest_Pass() throws Exception {
		
		List<AccountsEntity> list = new ArrayList<AccountsEntity>();
		AccountsEntity account1 = new AccountsEntity();
		account1.setAccountNumber("585309209");
		account1.setAccountName("SGSAvings726");
		account1.setAccountType("Savings");
		account1.setBalanceDate("08/11/2018");
		account1.setAvalBalance(84327.51);
		account1.setCurrency("SGD");
		
		AccountsEntity account2 = new AccountsEntity();
		account2.setAccountNumber("791066619");
		account2.setAccountName("AUSavings933");
		account2.setAccountType("Savings");
		account2.setBalanceDate("08/11/2018");
		account2.setAvalBalance(88005.93);
		account2.setCurrency("AUD");
		
		AccountsEntity account3 = new AccountsEntity();
		account3.setAccountNumber("321143048");
		account3.setAccountName("AUCurrent433");
		account3.setAccountType("Current");
		account3.setBalanceDate("08/11/2018");
		account3.setAvalBalance(38010.62);
		account3.setCurrency("AUD");
			 
		list.add(account1);
		list.add(account2);
		list.add(account3);
		
		when(accountsRepo.findAll()).thenReturn(list);
		
		List<AccountsEntity> accList = accountsService.viewAccountList();
		
		assertEquals(3,accList.size());
		
		verify(accountsRepo,times(1)).findAll();
				
	}
	
	@Test
	void viewAccountListTest_Fail() throws Exception {
		
		List<AccountsEntity> list = new ArrayList<AccountsEntity>();
		AccountsEntity account1 = new AccountsEntity();
		account1.setAccountNumber("585309210");
		account1.setAccountName("SGSAvings726");
		account1.setAccountType("Savings");
		account1.setBalanceDate("08/11/2018");
		account1.setAvalBalance(84327.51);
		account1.setCurrency("SGD");
		
		AccountsEntity account2 = new AccountsEntity();
		account2.setAccountNumber("791063819");
		account2.setAccountName("AUSavings933");
		account2.setAccountType("Savings");
		account2.setBalanceDate("08/11/2018");
		account2.setAvalBalance(88005.93);
		account2.setCurrency("AUD");
		
		list.add(account1);
		list.add(account2);
		
		when(accountsRepo.findAll()).thenReturn(list);
		
		List<AccountsEntity> accList = accountsService.viewAccountList();
		
		assertNotEquals(2,accList.size());
		
		verify(accountsRepo,times(1)).findAll();
	}

}
