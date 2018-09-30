package io.pivotal.directory.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	
	public Person(String firstName, String lastName, String funcGroup) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.funcGroup = funcGroup;
	}
	
	public Person() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFuncGroup() {
		return funcGroup;
	}
	public void setFuncGroup(String funcGroup) {
		this.funcGroup = funcGroup;
	}
	
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String funcGroup;

}
