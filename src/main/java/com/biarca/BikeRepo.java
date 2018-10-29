package com.biarca;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="/bike" ,path="/bike")
public interface BikeRepo extends JpaRepository<Bike,Integer> {
	
	
	
	
}