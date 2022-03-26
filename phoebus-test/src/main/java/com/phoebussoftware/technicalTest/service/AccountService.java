package com.phoebussoftware.technicalTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phoebussoftware.technicalTest.DTO.AccountDTO;
import com.phoebussoftware.technicalTest.mapper.AccountMapper;
import com.phoebussoftware.technicalTest.repository.AccountRepository;


@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public AccountDTO saveAccount(AccountDTO accountDTO) {

		this.accountRepository.save(AccountMapper.toPersist(accountDTO));
		
		return accountDTO;

	}

}
