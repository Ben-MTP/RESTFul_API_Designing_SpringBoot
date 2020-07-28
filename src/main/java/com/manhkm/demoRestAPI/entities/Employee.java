package com.manhkm.demoRestAPI.entities;

<<<<<<< HEAD
public class Employee {

	private Long empId;
=======
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
>>>>>>> 7554e42c7938261f807e3fa68aa8f0bf4f72d80e
	private String empNo;
	private String empName;

	public Employee() {
		super();
	}
<<<<<<< HEAD

	public Employee(Long empId, String empNo, String empName) {
=======
	public Employee(Integer empId, String empNo, String empName) {
>>>>>>> 7554e42c7938261f807e3fa68aa8f0bf4f72d80e
		super();
		this.empId = empId;
		this.empNo = empNo;
		this.empName = empName;
	}
<<<<<<< HEAD

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
=======
	
	@Id
	//@GeneratedValue(strategy = IDENTITY)
	@Column(name = "empId", unique = true, nullable = false)
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
>>>>>>> 7554e42c7938261f807e3fa68aa8f0bf4f72d80e
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
