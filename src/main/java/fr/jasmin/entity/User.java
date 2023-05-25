package fr.jasmin.entity;

import fr.jasmin.enums.Profile;

public class User  {
	
	private String email;
	private String firstname;


	private Profile profile;
	
	
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
	
	
	
	
	
	
	

	
	
	
	
	
}