package com.accounts.Ecommercetranctions.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.Ecommercetranctions.dto.CustomerMapper;
import com.accounts.Ecommercetranctions.dto.CustometDto;
import com.accounts.Ecommercetranctions.entity.Customer;
import com.accounts.Ecommercetranctions.repositry.CustomerRepository;
import com.accounts.Ecommercetranctions.service.CustomerService;
@Service
public class CustomerServiceImp implements CustomerService {
	
	private CustomerRepository customerrepository;
    @Autowired
	public CustomerServiceImp(CustomerRepository customerrepository) {
		super();
		this.customerrepository = customerrepository;
	}

	@Override
	public CustometDto createCustomer(CustometDto custometDto) {
		Customer customer = CustomerMapper.mapToCustomer(custometDto);
		Customer savedCustomer=customerrepository.save(customer);
		return CustomerMapper.mapToCustometDto(savedCustomer);
	}

}
