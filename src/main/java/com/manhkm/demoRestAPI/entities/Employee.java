package com.manhkm.demoRestAPI.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //support identification is Entity
@Table(name="employees")
public class Employee implements java.io.Serializable{
	private static final GenerationType IDENTITY = null;
	private Integer empId;
	private String empNo;
	private String empName;
	
	public Employee() {
		super();
	}
	public Employee(Integer empId, String empNo, String empName) {
		super();
		this.empId = empId;
		this.empNo = empNo;
		this.empName = empName;
	}
	
	@Id
	//@GeneratedValue(strategy = IDENTITY)
	@Column(name = "empId", unique = true, nullable = false)
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
