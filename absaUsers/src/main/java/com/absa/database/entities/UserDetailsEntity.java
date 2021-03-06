package com.absa.database.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "UserDetails")
public class UserDetailsEntity extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private  String firstName,LastName,username,password,customer,role,email,cellNumber,testType;

	public  String getFirstaName() {
		return firstName;
	}

	public  void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public  String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public  String getUserName() {
		return username;
	}

	public  void setUsername(String username) {
		this.username = username;
	}

	public  String getPassword() {
		return password;
	}

	public  void setPassword(String password) {
		this.password = password;
	}

	public  String getCustomer() {
		return customer;
	}

	public  void setCustomer(String customer) {
		this.customer = customer;
	}

	public  String getRole() {
		return role;
	}

	public  void setRole(String role) {
		this.role = role;
	}

	public  String getEmail() {
		return email;
	}

	public  void setEmail(String email) {
		this.email = email;
	}

	public  String getCellNumber() {
		return cellNumber;
	}

	public  void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public  String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}
	
	
}
