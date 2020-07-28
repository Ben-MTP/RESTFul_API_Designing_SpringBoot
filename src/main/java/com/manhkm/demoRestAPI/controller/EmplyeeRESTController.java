package com.manhkm.demoRestAPI.controller;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.manhkm.demoRestAPI.service.EmployeeService;
import com.manhkm.demoRestAPI.entities.Employee;

@RestController
@RequestMapping("/rest")
public class EmplyeeRESTController {
	
	@Autowired
	private EmployeeService employeeService;

	/*
	 * List all of employees
	 */
<<<<<<< HEAD
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
=======
	@RequestMapping(value = "/employees",
			method = RequestMethod.GET,
			produces = {
					MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE}
	)
	
>>>>>>> 7554e42c7938261f807e3fa68aa8f0bf4f72d80e
	@ResponseBody
	public List<Employee> getEmployees() {
		List<Employee> list = employeeService.getAllEmployees();
		return list;
	}

	/*
	 * Get detail of employee
	 * 
	 * @param empId
	 * 
	 * @return:
	 */
	@RequestMapping(value = "/employees/{empId}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public Employee getEmployee(@PathVariable("empId") Integer empId) {
		return employeeService.getEmployee(empId);
	}

	/*
	 * Add new e employee to list:
	 * 
	 * @param: empNo, empName
	 * 
	 * @return: status, update list current
	 */
	@RequestMapping(value = "/employees", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public Employee addEmployee(@RequestBody Employee empForm) {
		System.out.println("(Service Side) Creating employee with empNo: " + empForm.getEmpNo());
		return employeeService.addEmployee(empForm);
	}

	/*
	 * Update a current employee in List
	 * 
	 * @param: imformation about employee: id, no, name
	 * 
	 * @return: update fild about...
	 */
	@RequestMapping(value = "/employees", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public Employee updateEmployee(@RequestBody Employee empForm) {
		System.out.println("(Service Side) Update employee with empId: " + empForm.getEmpId());
		return employeeService.updateEmployee(empForm);
	}

	/*
	 * method delete employee in List:
	 * 
	 * @param: empId
	 * 
	 * @return:...
	 */
	@RequestMapping(value = "/employees/{empId}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public String deleteEmpoyee(@PathVariable("empId") Integer empId) {
		System.out.println("(Service side) Deleting employee with id: " + empId);
		employeeService.deleteEmployee(empId);
		return "delete employee successful";
	}
}
