package io.pivotal.directory.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Directory {

	public Directory() {

	}

	public Directory(String companyCode, List<Person> people) {
		this.companyCode = companyCode;
		this.people = people;

	}

	public String getCompnayCode() {
		return companyCode;
	}

	public void setCompnayCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public Long getId() {
		return id;
	}

	public Directory(String companyCode, String directoryName, List<Person> people) {
		super();
		this.companyCode = companyCode;
		this.directoryName = directoryName;
		this.people = people;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}

	private String companyCode;
	@Id
	@GeneratedValue
	private Long id;
	
	@Column ()
	private String directoryName;

	public String getDirectoryName() {
		return directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Person> people;

}
