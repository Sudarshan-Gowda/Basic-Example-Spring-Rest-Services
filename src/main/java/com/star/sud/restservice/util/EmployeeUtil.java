package com.star.sud.restservice.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.star.sud.restservice.model.EmployeeDetails;
import com.star.sud.restservice.model.EmployeeRequest;
import com.star.sud.restservice.model.EmployeeResponse;
import com.star.sud.restservice.model.Message;

public class EmployeeUtil {

	private static LinkedHashMap<String, EmployeeDetails> empDetailsMap = new LinkedHashMap<String, EmployeeDetails>();

	private static Integer count = 1;

	static {
		addDefaultValues();
	}

	public static void addDefaultValues() {

		empDetailsMap.put(String.valueOf(System.nanoTime()), new EmployeeDetails(count, "Sudarshan", "PD", "Java"));
		empDetailsMap.put(String.valueOf(System.nanoTime()), new EmployeeDetails(++count, "John", "IT", "Networking"));
	}

	public static EmployeeResponse getEmployees() {
		EmployeeResponse response = new EmployeeResponse();

		try {
			List<EmployeeDetails> empDetails = new ArrayList<EmployeeDetails>();
			for (String key : empDetailsMap.keySet())
				empDetails.add(empDetailsMap.get(key));

			response.setEmployeeDetails(empDetails);
			response.setMessage(new Message("Success", Boolean.TRUE));

		} catch (Exception e) {
			response.setMessage(new Message("Failed", Boolean.FALSE, "ERROR_RESPONSE_100", e.getMessage()));
		}

		return response;

	}

	public static EmployeeResponse setEmployees(EmployeeRequest request) {

		EmployeeResponse response = new EmployeeResponse();
		try {

			EmployeeDetails emDetails = request.getEmployeeDetails();
			if (null == emDetails)
				throw new Exception("emDetails param is null or empty");

			emDetails.setEmpId(++count);

			empDetailsMap.put(String.valueOf(System.nanoTime()), emDetails);

			response.setEmployeeDetails(getEmployees().getEmployeeDetails());
			response.setMessage(new Message("Success", Boolean.TRUE));

		} catch (Exception e) {
			response.setMessage(new Message("Failed", Boolean.FALSE, "ERROR_RESPONSE_102", e.getMessage()));
		}
		return response;

	}

}
