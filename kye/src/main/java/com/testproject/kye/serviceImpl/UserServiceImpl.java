package com.testproject.kye.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testproject.kye.dto.RegistrationRequest;
import com.testproject.kye.entity.Employee;
import com.testproject.kye.repository.UserRepository;
import com.testproject.kye.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	UserRepository userRepository;

	@Override
	public RegistrationRequest registerEmployee(RegistrationRequest req) {
		Employee emp = Employee.build(Long.MIN_VALUE,req.getEmail(),req.getPassoword(),req.getFirstName(),req.getMiddleName(),req.getLastName(),
				req.getGender(),req.getMobileNumber(),req.getCurrentAddress(),req.getCurrentAddressType(),req.getPermanentAddress(),
				req.getNationality(),req.getReligion(),req.getDob(),req.getBloodGroup(),
				req.getMarritalStatus(),req.getGuardianName());
		      Employee cretedEmp =userRepository.save(emp);
		      
				return modelMapper.map(cretedEmp,RegistrationRequest.class);
	

}
}
