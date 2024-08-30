package com.testproject.kye.service;

import com.testproject.kye.dto.RegistrationRequest;
import com.testproject.kye.entity.Employee;

public interface UserService {

	public RegistrationRequest registerEmployee(RegistrationRequest registrationRequest);
}
