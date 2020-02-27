/**
 * 
 */
package com.star.sud.restservice.model;

import java.io.Serializable;

/**
 * @author Sudarshan
 *
 */
public class EmployeeDetails implements Cloneable, Serializable {

	// Static Attributes
	////////////////////
	private static final long serialVersionUID = 8187838125969149607L;

	// Attributes
	protected int empId;

	protected String empName;

	protected String empDept;

	protected String empSkill;

	// Constructors
	//////////////////
	public EmployeeDetails() {

	}

	/**
	 * @param empId
	 * @param empName
	 * @param empDept
	 * @param empSkill
	 */
	public EmployeeDetails(int empId, String empName, String empDept, String empSkill) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSkill = empSkill;
	}

	// Properties
	///////////////////
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empDept
	 */
	public String getEmpDept() {
		return empDept;
	}

	/**
	 * @param empDept the empDept to set
	 */
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	/**
	 * @return the empSkill
	 */
	public String getEmpSkill() {
		return empSkill;
	}

	/**
	 * @param empSkill the empSkill to set
	 */
	public void setEmpSkill(String empSkill) {
		this.empSkill = empSkill;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
