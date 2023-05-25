package fr.jasmin.backingbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.jasmin.common.IConstant;
import fr.jasmin.entity.User;
import fr.jasmin.enums.Gender;
import fr.jasmin.model.dao.impl.UserDao;
import fr.jasmin.model.dao.interfaces.IUserDao;
import fr.jasmin.utils.DataTest;
import fr.jasmin.utils.Utils;

@ManagedBean(name ="loginBean")
@SessionScoped
public class LoginBean extends User implements IConstant{
	
	private String passwordRepeat ;
	
	public LoginBean() {
		this(DEFAULT_EMAIL,DEFAULT_PASSWORD);
		// TODO Auto-generated constructor stub
	}

	public LoginBean(String email, String password) {
		
		this.setEmail ( email);
		this.setPass( password);
	}

	
	public void testCreateUser() {
		
		Gender gender = DataTest.gender();
		String firstname = DataTest.firstname(gender );
		String lastname = DataTest.lastname();
				
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setGender(gender);
		this.setProfile(DataTest.profile());
		this.setEmail(DataTest.email(firstname, lastname));
		this.setEmail(DataTest.email(firstname, lastname));
		
		Utils.trace(this.toString());
	}

	
	public void checkMail() {
		
		IUserDao userDao = new UserDao();
		User user = null;
		try {
			user = userDao.get(this.getEmail());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if (user == null) { // user do not exist yet 
			user = new User();
			user.setFirstname (this.getFirstname());
		}
		

		

		
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}
	
	

}
