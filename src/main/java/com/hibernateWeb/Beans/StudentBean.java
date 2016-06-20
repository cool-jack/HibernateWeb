package com.hibernateWeb.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.catalina.core.StandardEngine;

import com.hibernateWeb.TableConstants.StudentBeanConstants;

@Entity
@Table(name = StudentBeanConstants.TABLE_NAME)
public class StudentBean {
	
	@Id
	@GeneratedValue
	@Column(name = StudentBeanConstants.ID)
	private int id;
	
	@Column(name = StudentBeanConstants.FIRST_NAME)
	private String firstName;
	
	@Column(name = StudentBeanConstants.LAST_NAME)
	private String lastName;
	
	@Column(name = StudentBeanConstants.EMAIL)
	private String email;
	
	@Column(name = StudentBeanConstants.MOBILE_NO)
	private String mobileNo;
	
	@Column(name = StudentBeanConstants.PASSWORD)
	private String password;
	
	@Column(name = StudentBeanConstants.CON_PASSWORD)
	private String conPassword;
	
	private int age;
	
	private String sex; 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConPassword() {
		return conPassword;
	}
	public void setConPassword(String conPassword) {
		this.conPassword = conPassword;
	}
}
