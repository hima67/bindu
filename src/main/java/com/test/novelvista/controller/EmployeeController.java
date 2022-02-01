package com.test.novelvista.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.test.novelvista.entity.Employee;
import com.test.novelvista.repo.EmployeeRepo;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepo emprepo;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/add")
	public String insert() {
		return "insert";
	}

	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}

	@GetMapping("/update")
	public String update() {
		return "update";
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Employee> select() {
		return emprepo.findAll();
	}

	@GetMapping("/added")
	public @ResponseBody String inserted(
			@RequestParam Long empid, 
			String ename, 
			String department,
			String date_of_joining,
			String address,
			String state_and_city) throws ParseException {
		Employee emp = new Employee();
		emp.setEmpid(empid);
		emp.setEname(ename);
		emp.setDepartment(department);
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(date_of_joining);  
		emp.setDate_of_joining(date);
		emp.setAddress(address);
		emp.setState_and_city(state_and_city);
		emprepo.save(emp);
		return "Successfully Operated..";
	}

	@GetMapping(path = "/deleted")
	public @ResponseBody String deleted(@RequestParam Long empid) {
		emprepo.deleteById(empid);
		return "Successfully Deleted..";
	}
}