package com.justimagine.Service;

import java.util.List;

import com.justimagine.Entity.Employee;

public interface IEmployeeService {
	
	
	public void saveEmp(Employee emp);
	public void saveAllEmp(List<Employee> emp);
	
	
	public Employee getEmpById(Integer id);
	public List<Employee> getAllEmp();
	
	
	public void UpdateById(Integer id,String name);
	
	public void deleteEmpById(Integer id);
	public void deleteAllEmp();
	
	
	
	
	
	
	

}
