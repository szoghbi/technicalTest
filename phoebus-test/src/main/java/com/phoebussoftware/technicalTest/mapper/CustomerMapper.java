package com.phoebussoftware.technicalTest.mapper;


import com.phoebussoftware.technicalTest.DTO.CustomerDTO;
import com.phoebussoftware.technicalTest.model.CustomerEntity;

public class CustomerMapper {

	public static CustomerEntity toPersist(CustomerDTO accountDTO){

		return CustomerEntity.builder()
				.foreName(accountDTO.getForeName())
				.surName(accountDTO.getSurName())
				.dataOfBirth(accountDTO.getDataOfBirth())
				.build();
	}
}