package com.justimagine;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.justimagine.Entity.Employee;
import com.justimagine.Service.EmployeeServicrImpl;

@SpringBootApplication
public class SpringBootCrudOperationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCrudOperationApplication.class, args);
		
		EmployeeServicrImpl servicrImpl = context.getBean(EmployeeServicrImpl.class);
		/*
		//save data into database
		Employee emp=new Employee("rohit","pune"); 
		
		servicrImpl.saveEmp(emp);
		System.out.println("one Record Saved Successfully");
		
		
		
		
		
		//Saving List of Employee
		List<Employee> emplist=new ArrayList<Employee>();
		
		
		emplist.add(new Employee("Ganesh","mumbai"));
		emplist.add(new Employee("maruti","Barshi"));
		emplist.add(new Employee("Ram","solapur"));
		emplist.add(new Employee("Dinesh","aakola"));
		servicrImpl.saveAllEmp(emplist);
		System.out.println("All Record List Saved Successfully");
		
		
		//get the Employee by Id
		 
		Employee employee = servicrImpl.getEmpById(1);
		
		System.out.println(employee);
		
		
		//Get All Employee
		
		List<Employee> allEmp = servicrImpl.getAllEmp();
		
		allEmp.forEach(e1->System.out.println(e1));
		
		
		//update Employee Name
		
		
		servicrImpl.UpdateById(1, "sonlali");
		System.out.println("Record Updated successfully");
		
		//Delete RecordById
		
		servicrImpl.deleteEmpById(1);
		
		System.out.println("One Record Deleted successfully");
		*/
		
		//Delete All Record
		
		
		servicrImpl.deleteAllEmp();
		System.out.println("All Records Are Deleted Successfully");
		
		
	}

}
