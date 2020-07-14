package com.manhkm.demoRestAPI.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manhkm.demoRestAPI.dao.EmployeeDao;
import com.manhkm.demoRestAPI.entities.Employee;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDAO;
	
	//function get information employee by id:
	public Employee getEmployee(Integer empId) {
		return employeeDAO.getEmployee(empId);
	}
	
	//function add information employee
	public Employee addEmployee(Employee empForm) {
		return employeeDAO.addEmployee(empForm);
	}
	
	//function update information employee in list current:
	public Employee updateEmployee(Employee empForm) {
		return employeeDAO.updateEmployee(empForm);
	}
	
	//function delete information employee by id:
	public void deleteEmployee(Integer empId) {
		employeeDAO.deleteEmployee(empId);
	}
	
	//function get all List Information employee:
	public List<Employee> getAllEmployees(){
		return employeeDAO.getAllEmployee();
	}
	
}
