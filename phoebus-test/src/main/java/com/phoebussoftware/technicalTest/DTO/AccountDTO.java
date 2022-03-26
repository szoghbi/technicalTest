package com.phoebussoftware.technicalTest.DTO;

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
public class AccountDTO {

	private UUID accountId;

	@NotBlank
	private CustomerDTO customerDTO;

	@NotBlank
	private Integer accountNumber;
}
