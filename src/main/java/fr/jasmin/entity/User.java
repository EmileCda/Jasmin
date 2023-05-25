package fr.jasmin.entity;

import java.util.Date;

import fr.jasmin.enums.Gender;
import fr.jasmin.enums.Profile;

public class User  {
	
	private int id ; 
	private String email;
	private String firstname;
	private String lastname;
	private Gender gender;
	private String pass;
	private Profile profile;
	private Date 	birthDate;
	private String 	phoneNumber;
	
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public String getEmail() {
		return email;
	}

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setEmail(String email) {
		this.email = email;
	}




	public Profile getProfile() {
		return profile;
	}


	public void setProfile(Profile profile) {
		this.profile = profile;
	}


	@Override
	public String toString() {
		return String.format("email=%s, Name %s, profile=%s]", getEmail(), getFirstname(), getProfile().getName());
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
	

	
	
	
	
	
}