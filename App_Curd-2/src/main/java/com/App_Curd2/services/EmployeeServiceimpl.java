package com.App_Curd2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App_Curd2.entity.Employee;
import com.App_Curd2.repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		repo.save(employee);

	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> findById = repo.findById(id);
		Employee employee = null;
		if(findById.isPresent()) {
	employee=findById.get();
		}
		else {
	          	throw new RuntimeException(" Employee not found for id ::"+id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
this.repo.deleteById(id);
	}

	

	/**@Override
	public Page<Employee> findPagination(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort=sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name())? Sort.by(sortField).ascending() :
		Sort.by(sortField).descending();
		PageRequest pageable=PageRequest.of(pageNo - 1, pageSize , sort);
		
		return this.repo.findAll(pageable);
	}
*/
}
