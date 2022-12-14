package com.justimagine.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.justimagine.Entity.Employee;
import com.justimagine.Repo.EmployeRepositroy;
@Service
public class EmployeeServicrImpl implements IEmployeeService {

	
	
	private final EmployeRepositroy repositroy;
	
	
	
	public EmployeeServicrImpl(EmployeRepositroy repositroy) {
		super();
		this.repositroy = repositroy;
	}

	@Override
	public void saveEmp(Employee emp) {
		repositroy.save(emp);
	
			
	}

	@Override
	public void saveAllEmp(List<Employee> emp) {
		repositroy.saveAll(emp);

	}

	@Override
	public Employee getEmpById(Integer id) {
		
		Employee emp = repositroy.findById(id).orElse(null);
		 
		return emp;
	}

	@Override
	public List<Employee> getAllEmp() {
		
		Iterable<Employee> empItr=repositroy.findAll();
		
		List<Employee> list=new ArrayList<Employee>();
		
		empItr.forEach(e1->list.add(e1));
		
		
		return list;
	}

	@Override
	public void UpdateById(Integer id,String name) {
		Employee emp=repositroy.findById(id).orElse(null);
		
		emp.setName(name);
		repositroy.save(emp);

	}

	@Override
	public void deleteEmpById(Integer id) {
		repositroy.deleteById(id);

	}

	@Override
	public void deleteAllEmp() {
		repositroy.deleteAll();

	}

}
