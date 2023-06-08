package com.App_shop.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App_shop.Dto.CustomerDto;
import com.App_shop.Entity.Customer;
import com.App_shop.Entity.Product;
import com.App_shop.Repository.CustomerRepository;
import com.App_shop.Service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {
	
	
	@Autowired
	private CustomerRepository customerrepo;
	
	


	@Override
	public String saveuser(CustomerDto customerdto) {
		String respone="saved";
		
		try {
		
		
		Customer custentity=new Customer();
		custentity.setId(customerdto.getId());
		custentity.setName(customerdto.getName());
		custentity.setEmail(customerdto.getEmail());
		custentity.setGender(customerdto.getGender());
		List<Product> dtopro=customerdto.getProdect();
		custentity.setProdect(dtopro);
		
		customerrepo.save(custentity);
		
		} catch (Exception e) {
          e.printStackTrace();	
          }
		return respone;

	}






	@Override
	public List<Customer> getUserdata(String name) {
	
		return	customerrepo.findByName(name);
	
	}
	

}
