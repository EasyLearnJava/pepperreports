package com.aa.pepper.pepperreports;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="userReports")
public interface IReports extends CrudRepository<Reports, Long>{

	
	
}
