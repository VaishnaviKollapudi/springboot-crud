package com.example.springbootcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootcrud.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	public List<Employee> findAllByOrderByLastNameAsc();

}
