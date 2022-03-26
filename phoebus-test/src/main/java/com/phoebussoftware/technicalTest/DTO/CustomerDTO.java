package com.phoebussoftware.technicalTest.DTO;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {

	private UUID customerId;

	@NotBlank
	String foreName;

	@NotBlank
	String surName;

	@NotBlank
	LocalDate dataOfBirth;

	private List<AccountDTO> accountDTOS;
}
