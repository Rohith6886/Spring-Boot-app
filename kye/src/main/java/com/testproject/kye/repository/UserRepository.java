package com.testproject.kye.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testproject.kye.entity.Employee;
@Repository
public interface UserRepository extends CrudRepository<Employee,Long>{

	//public Employee save(Employee employee);

}
