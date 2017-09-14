package com.aa.pepper.pepperreports;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class Person {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Setter(AccessLevel.PROTECTED)
	private Integer personId;
	
	private String loginId;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailId;
		
	
}
