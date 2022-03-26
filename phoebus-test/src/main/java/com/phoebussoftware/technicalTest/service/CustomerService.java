package com.phoebussoftware.technicalTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoebussoftware.technicalTest.DTO.CustomerDTO;
import com.phoebussoftware.technicalTest.mapper.CustomerMapper;
import com.phoebussoftware.technicalTest.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Transactional
	public CustomerDTO saveCustomer(CustomerDTO customerDTO) {

		this.customerRepository.save(CustomerMapper.toPersist(customerDTO));
		
		return customerDTO;

	}
}
