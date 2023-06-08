package com.App_shop.Service;

import java.util.List;

import com.App_shop.Dto.CustomerDto;
import com.App_shop.Entity.Customer;

public interface OrderService {

	String saveuser(CustomerDto customerdto);

	List<Customer> getUserdata(String name);


	
}
