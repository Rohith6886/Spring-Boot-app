package com.testproject.kye.entity;

import java.sql.Date; 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empdetails")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empId;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "password", length = 20)
	private String passoword;

	@Column(name = "first_name", length = 10)
	private String firstName;

	@Column(name = "middle_name", length = 10)
	private String middleName;

	@Column(name = "last_name", length = 10)
	private String lastName;

	@Column(name = "gender", nullable = false, length = 1)
	private int gender;

	@Column(name = "mbl_number", nullable = false, unique = true, length = 10)
	private String  mobileNumber;

	@Column(name = "current_address")
	private String currentAddress;

	private int currentAddressType;

	@Column(name = "permanent_address")
	private String permanentAddress;

	@Column(length = 10)
	private String nationality;

	@Column(length = 10)
	private String religion;
	@Column(nullable = true)
	private Date dob;

	@Column(length = 10)
	private String bloodGroup;

	private int marritalStatus;

	@Column(length = 15)
	private String guardianName;

}
