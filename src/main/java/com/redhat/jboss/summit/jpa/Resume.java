package com.redhat.jboss.summit.jpa;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Entity
@Table( name = "resumes")
public class Resume {
	
	@Id
	@GeneratedValue
    private Long id;
	
	@Column(name="name_first")
	private String firstName;
	
	@Column(name="name_last")
	private String lastName;

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17,37).append(id).append(firstName).append(lastName).toHashCode();
	};
	
	@Override
	public String toString(){
		return new ToStringBuilder(this).append(firstName).append(lastName).toString();
	}
	//----------------------------------------------------------------------------------------
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
	
	
}
