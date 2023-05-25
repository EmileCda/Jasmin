package fr.jasmin.backingbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="connectionBean")
@SessionScoped

//https://stackoverflow.com/questions/30128395/identifying-and-solving-javax-el-propertynotfoundexception-target-unreachable
public class ConnectionBean implements Serializable{
	
	@ManagedProperty(name = "account", value = "account")
	private String account;
	@ManagedProperty(name = "password", value = "password")
	private String password;
	
	
	public ConnectionBean() {
		this("default account ","default pass");
}
	public ConnectionBean(String account, String password) {
		this.setAccount ( account);
		this.setPassword ( password);
	}
	
	
	public void checkUser() {
		
		System.out.println("public void checkUser() ");
		
	}
	
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("id[%d] user:%s, password:%s", this.getAccount(), this.getPassword());
	}

	

}
