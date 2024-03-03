package com.accounts.Ecommercetranctions.dto;

import java.util.UUID;


public class CustometDto {
	
	public CustometDto(UUID id, String customerName, double amount) {
		super();
		this.id = id;
		CustomerName = customerName;
		this.amount = amount;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	private UUID id;
	private String CustomerName;
	private double amount;
	

}
