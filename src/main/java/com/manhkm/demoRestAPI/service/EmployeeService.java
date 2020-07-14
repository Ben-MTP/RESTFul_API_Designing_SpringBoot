package com.manhkm.demoRestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manhkm.demoRestAPI.dao.EmployeeDao;
import com.manhkm.demoRestAPI.entities.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDAO;
	
	//function get information employee by id:
	public Employee getEmployee(Long empId) {
		Employee temp = employeeDAO.getEmployee(empId);
		return temp;
	}
	
	//function add information employee
	public Employee addEmployee(Employee empForm) {
		Employee temp = employeeDAO.addEmployee(empForm);
		return temp;
	}
	
	//function update information employee in list current:
	public Employee updateEmployee(Employee empForm) {
		Employee temp = employeeDAO.updateEmployee(empForm);
		return temp;
	}
	
	//function delete information employee by id:
	public void deleteEmployee(Long empId) {
		employeeDAO.deleteEmployee(empId);
	}
	
	//function get all List Information employee:
	public List<Employee> getAllEmployees(){
		//Employee temp = employeeDAO.getAllEmployee();
		return employeeDAO.getAllEmployee();
	}
	
}
