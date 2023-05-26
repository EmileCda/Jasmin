package fr.jasmin.backingbean;

import java.util.Date;

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
	private String birthDateString ;
	
	public LoginBean() {
		this(DEFAULT_EMAIL,DEFAULT_PASSWORD);
		this.setBirthDate(DataTest.brithDate());
		this.setFirstname(DEFAULT_FIRSTNAME);
		this.setLastname(DEFAULT_LASTNAME);
		this.setPhoneNumber(DEFAULT_PHONE);
		this.setPass(DataTest.pass(this.getLastname()));
		this.setPasswordRepeat(this.getPass());
		
		

	}
	public LoginBean(int original) {
		this(DEFAULT_EMAIL,DEFAULT_PASSWORD);
		// TODO Auto-generated constructor stub
	}

	public LoginBean(String email, String password) {
		
		this.setEmail ( email);
		this.setPass( password);
		this.setBirthDate(DATE_NOW);	
	}

	
	public void testCreateUser() {
		
		Gender gender = DataTest.gender();
		String firstname = DataTest.firstname(gender );
		String lastname = DataTest.lastname();
				
		this.setFirstname(firstname);
		this.setPass(DataTest.pass(firstname));
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
	public String getBirthDateString() {
		
		return Utils.date2String(getBirthDate(), DATE_FORMAT);
	}
	public void setBirthDateString(String birthDateString) {
		
		this.birthDateString = birthDateString;
		this.setBirthDate(Utils.string2Date(this.birthDateString, DATE_FORMAT));
	}

	

}
