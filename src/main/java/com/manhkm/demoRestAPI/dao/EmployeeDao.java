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
	
<<<<<<< HEAD
	//started -> call function initEmps alway?
	static {
		initEmps();
	}
	private static void initEmps() {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1L, "CODE001", "ManhKM");
		Employee emp2 = new Employee(2L, "CODE002", "NhanVien01");
		Employee emp3 = new Employee(3L, "CODE003", "NhanVien02");
		
		empMap.put(emp1.getEmpId(), emp1);
		empMap.put(emp2.getEmpId(), emp2);
		empMap.put(emp3.getEmpId(), emp3);
	}
	
	//function getInformation Employee Id max:
	public Long getMaxEmpId() {
		Set<Long> keys = empMap.keySet();
		Long max = 0L;
		for (Long key : keys) {
			if(key > max) {
				max = key;
			}
		}
		return max;
	}
=======
	@Autowired
	private SessionFactory sessionFactory;
>>>>>>> 7554e42c7938261f807e3fa68aa8f0bf4f72d80e
	
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
