package com.star.sud.restservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.star.sud.restservice.model.EmployeeRequest;
import com.star.sud.restservice.model.EmployeeResponse;
import com.star.sud.restservice.util.EmployeeUtil;

@Controller
public class RestController {

	@RequestMapping(value = "/list-employees", method = RequestMethod.GET)
	public @ResponseBody EmployeeResponse getListOfEmployees() {
		return EmployeeUtil.getEmployees();
	}

	@RequestMapping(value = "/save-emp", method = RequestMethod.POST)
	public @ResponseBody EmployeeResponse getExistingProducts(@RequestBody EmployeeRequest request) {
		return EmployeeUtil.setEmployees(request);
	}

}
