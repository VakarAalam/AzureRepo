package com.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lkm.bean.Employee;
@Repository
public class EmployeeDao {
	
	public List<Employee> getAllEmployee(){
		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(101, "Jhon", "Trainer", 20000.0));
		list.add(new Employee(102, "Mark", "Developer", 25000.0));
		list.add(new Employee(103, "Den", "Scrum", 3000.0));
		return list;
	}
}
