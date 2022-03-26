package com.phoebussoftware.technicalTest.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phoebussoftware.technicalTest.DTO.CustomerDTO;
import com.phoebussoftware.technicalTest.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService accountService;
	
	@PostMapping()
	public ResponseEntity<CustomerDTO> addAccount(@Valid @RequestBody CustomerDTO accountDTO) {

		CustomerDTO customerResp = accountService.saveCustomer(accountDTO);

		return ResponseEntity.status(HttpStatus.CREATED).body(customerResp);

	}
}
