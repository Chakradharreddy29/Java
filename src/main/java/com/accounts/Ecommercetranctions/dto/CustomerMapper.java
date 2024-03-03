package com.accounts.Ecommercetranctions.dto;

import com.accounts.Ecommercetranctions.entity.Customer;

public class CustomerMapper {
	public static Customer mapToCustomer(CustometDto customerDto)
	{
		Customer customer = new Customer(
				customerDto.getId(),
				customerDto.getCustomerName(),
				customerDto.getAmount()
				);
		return customer;
	}
	public static CustometDto mapToCustometDto(Customer customer)
	{
		CustometDto custometDto = new CustometDto(
				customer.getId(),
				customer.getCustomerName(),
				customer.getAmount()
				);
		return custometDto;
	}
}
