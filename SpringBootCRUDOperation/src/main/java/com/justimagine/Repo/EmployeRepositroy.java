package com.justimagine.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.justimagine.Entity.Employee;
@Repository
public interface EmployeRepositroy extends CrudRepository<Employee, Integer> {

}