package com.manhkm.demoRestAPI.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.manhkm.demoRestAPI.entities.Employee;

@Repository
public class EmployeeDao {
	private static final Map<Long, Employee> empMap = new HashMap<Long, Employee>(); //--> import 3 lib
	
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
	
	//function get infomation by empId
	public Employee getEmployee(Long empId) {
		return empMap.get(empId);
	}
	
	//function add new employee in HashMap
	public Employee addEmployee(Employee empForm) {
		Long empId = this.getMaxEmpId() + 1;
		empForm.setEmpId(empId);
		
		empMap.put(empForm.getEmpId(), empForm);
		return empForm;
	}
	
	//function update information employee in HashMap;
	public Employee updateEmployee(Employee empForm) {
		Employee empUpdate = this.getEmployee(empForm.getEmpId());
		if(empUpdate != null) {
			empUpdate.setEmpNo(empForm.getEmpNo());
			empUpdate.setEmpName(empForm.getEmpName());
		}
		return empUpdate;
	}
	
	//function delete employee in HashMap:
	public void deleteEmployee(Long empId) {
		empMap.remove(empId);
	}
	
	//function get AllEmployees():
	public List<Employee> getAllEmployee(){
		Collection<Employee> c = empMap.values();
		List<Employee> list = new ArrayList<Employee>();
		list.addAll(c);
		
		return list;
	}
}
