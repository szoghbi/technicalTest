package com.phoebussoftware.technicalTest.mapper;


import com.phoebussoftware.technicalTest.DTO.AccountDTO;
import com.phoebussoftware.technicalTest.DTO.CustomerDTO;
import com.phoebussoftware.technicalTest.model.AccountEntity;
import com.phoebussoftware.technicalTest.model.CustomerEntity;

public class AccountMapper {

	public static AccountEntity toPersist(AccountDTO accountDTO){
    	
    	return AccountEntity.builder()
    			.accountNumber(accountDTO.getAccountNumber())
    			.customerEntity(CustomerEntity.builder()
    					.foreName(accountDTO.getCustomerDTO().getForeName())
    					.surName(accountDTO.getCustomerDTO().getSurName())
    					.dataOfBirth(accountDTO.getCustomerDTO().getDataOfBirth())
    					.build())
    			.build();
    }
}