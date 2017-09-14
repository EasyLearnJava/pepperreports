package com.aa.pepper.pepperreports;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="person")
public interface IPerson extends CrudRepository<Person, Long>{

	
	
}
