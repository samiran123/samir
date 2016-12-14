package com.pupu.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class PersonDTO implements Serializable{
@Id
@Column(name="id")
	private int id;
@Column(name="name")
	private String name;
@Column(name="email")
	private String email;
@Column(name="age")
	private int age;
	
	public PersonDTO()
	{
		System.out.println("personDTO created...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
