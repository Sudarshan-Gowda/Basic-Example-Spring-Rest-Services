package com.star.sud.restservice.model;

import java.util.List;

public class EmployeeResponse {

	// Static Attributes
	//////////////////////
	private List<EmployeeDetails> employeeDetails;

	protected Message message;

	// Constructors
	/////////////////
	public EmployeeResponse() {
	}

	// Properties
	////////////////////
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	/**
	 * @return the employeeDetails
	 */
	public List<EmployeeDetails> getEmployeeDetails() {
		return employeeDetails;
	}

	/**
	 * @param employeeDetails the employeeDetails to set
	 */
	public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

}
