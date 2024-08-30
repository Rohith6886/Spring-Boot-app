package com.testproject.kye.dto;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class RegistrationRequest {
	// private long empId;

	@NotNull(message = "email shouldn't be null")
	// @Email
	@Pattern(regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "please check your email")
	private String email;
	@NotBlank(message = "password can't be empty")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=])(?=\\S+$).{8,20}$"
			,message ="password must contain the folowing"+"\n"
			+"minimum 8 and atmost 20 characters"+"\n"
			+"atleast one lowercase & one UPPERCASE alphabet"+"\n"
			+"atleast one special character which includes !@#$%&*()-+=^."+"\n"
			+"atleast one digit"
			+"doesn't contain whitespaces")
	private String passoword;
	@NotBlank(message = "plese mention your first name")
	private String firstName;
	private String middleName;
	@NotBlank(message = " please mention your last name/surname")
	private String lastName;
	@NotNull(message = "please specify your gender")
	private int gender;
	@NotNull(message="please enter your 10 digit mobile number")
	@Pattern(regexp = "^[0-9]{10}$", message = " mobile number must contain 10 digits")
	private String mobileNumber;
	@NotBlank(message = "current address can't be empty")
	private String currentAddress;
	@NotNull(message = "please specify your current address type")
	private int currentAddressType;
	private String permanentAddress;
	private String nationality;
	@NotEmpty
	private String religion;
	@Past
	private Date dob;
	private String bloodGroup;
	@NotNull(message = "please mentioin your marrital status")
	private int marritalStatus;
	@NotBlank(message = "please metioin legal guardian name(Father/spouse)")
	private String guardianName;

}
