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
public class Reports {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Setter(AccessLevel.PROTECTED)
	private Long id;
	
	private String location;
	
	
	
	
	
	
}
