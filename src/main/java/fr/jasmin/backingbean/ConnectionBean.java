package fr.jasmin.backingbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.jasmin.entity.User;
import fr.jasmin.enums.Profile;
import fr.jasmin.model.dao.impl.UserDao;
import fr.jasmin.model.dao.interfaces.IUserDao;
import fr.jasmin.utils.DataTest;
import fr.jasmin.utils.Utils;

@ManagedBean(name ="connectionBean")
@SessionScoped

//https://stackoverflow.com/questions/30128395/identifying-and-solving-javax-el-propertynotfoundexception-target-unreachable
public class ConnectionBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@ManagedProperty(name = "account", value = "account")
	private String account;
	@ManagedProperty(name = "password", value = "password")
	private String password;
	private User user;
	
	public ConnectionBean() {
		this("default account ","default pass");
}
	public ConnectionBean(String account, String password) {
		this.setAccount ( account);
		this.setPassword ( password);
	}
	
	
	public String checkUser() throws Exception {
		Utils.trace("ici-2");
				
		IUserDao userDao = new UserDao();
		String firstname  = DataTest.firstname();
		String lastname  = DataTest.lastname();
		
		String email = DataTest.email(firstname, lastname);

//		this.getUser().setFirstname(this.getAccount());
		this.setUser(userDao.get(email));

		Utils.trace(user.toString());
		this.setAccount(user.getEmail());
		
		
		switch (user.getProfile()) {
		case CLIENT : return  "procurement-management?faces-redirect=true&includeViewParams=true";
		case MANAGER : return "admin-management?faces-redirect=true&includeViewParams=true\";"; 
		case STORE_KEEPER : return  "item-management.xhtml";
		default: return "home.xhtlm";
		} 
		
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	

}
