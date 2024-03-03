package com.accounts.Ecommercetranctions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.Ecommercetranctions.dto.CustometDto;
import com.accounts.Ecommercetranctions.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	// add customer Rest APi
	@PostMapping

	public ResponseEntity<CustometDto> addCustomer(@RequestBody CustometDto custometDto) {
		return new ResponseEntity<>(customerService.createCustomer(custometDto), HttpStatus.CREATED);
	}

}
