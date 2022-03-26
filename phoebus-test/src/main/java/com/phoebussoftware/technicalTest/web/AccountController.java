package com.phoebussoftware.technicalTest.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.phoebussoftware.technicalTest.DTO.AccountDTO;
import com.phoebussoftware.technicalTest.service.AccountService;

@RestController
@RequestMapping("/account")
@ControllerAdvice
public class AccountController {
	

	@Autowired
	private AccountService accountService;

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AccountDTO> addAccount(@RequestBody @Valid AccountDTO accountDTO) {

		AccountDTO accountResp = accountService.saveAccount(accountDTO);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(accountResp);

	}
}