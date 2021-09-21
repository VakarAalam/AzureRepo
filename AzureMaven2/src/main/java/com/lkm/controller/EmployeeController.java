package com.lkm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lkm.bean.Employee;
import com.lkm.dao.EmployeeDao;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping(value="employee/getAllEmpoyee", method=RequestMethod.GET)
	public ModelAndView getALLEmployee() {
		ModelAndView mv= new ModelAndView();
		List<Employee> list=dao.getAllEmployee();
		mv.addObject("list", list);
		mv.setViewName("details");
		
		return mv;
	}
	
}
