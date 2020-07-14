package com.manhkm.demoRestAPI.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manhkm.demoRestAPI.entities.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	//function get infomation by empId
	public Employee getEmployee(Integer empId) {
		Session session = sessionFactory.getCurrentSession();
		Employee emp = (Employee) session.get(Employee.class, empId);
		return emp;
	}
	
	//function add new employee in HashMap
	public Employee addEmployee(Employee empForm) {
		Session session = sessionFactory.getCurrentSession();
		session.save(empForm);
		return empForm;
	}
	
	//function update information employee in HashMap;
	public Employee updateEmployee(Employee form) {
		Session session = sessionFactory.getCurrentSession();
		Employee emp = (Employee) session.get(Employee.class,  form.getEmpId());
		emp.setEmpName(form.getEmpName());
		emp.setEmpNo(form.getEmpNo());
		session.update(emp);
		
		return emp;
	}
	
	//function delete employee in HashMap:
	public void deleteEmployee(Integer empId) {
		Session session = sessionFactory.getCurrentSession();
		Employee emp = (Employee) session.get(Employee.class, empId);
		session.delete(emp);
	}
	
	//function get AllEmployees():
	public List<Employee> getAllEmployee(){
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Employee> listEmployee = (List<Employee>) session.createQuery(" FORM " + Employee.class.getName()).list();
		return listEmployee;
	}
}
