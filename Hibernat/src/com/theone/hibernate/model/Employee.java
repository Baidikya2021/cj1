package com.theone.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity// it present your class as an entity  class  which is going  to map a table 
@Data
public class Employee {
	@Id
	private int id;
	private String name;
	
	
	
}
