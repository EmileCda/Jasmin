package fr.jasmin.model.dao.impl;


import java.util.List;

import javax.persistence.NamedQuery;
import javax.persistence.RollbackException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import fr.jasmin.entity.User;
import fr.jasmin.enums.Profile;
import fr.jasmin.model.dao.interfaces.IUserDao;
import fr.jasmin.utils.DataTest;
//* test* test* test* test* test * test * test * test * test * test * test * test * test * test * test 
public class UserDao implements IUserDao {
	
	public UserDao() {
		
	}

	@Override
	public User get(String email) throws Exception {
		
		Profile  profile = Profile.CLIENT ;
//		Profile  profile = Profile.MANAGER ;
//		Profile  profile = Profile.STORE_KEEPER ;
//		Profile  profile = Profile.OTHER;

		
		User  user = new User();
		user.setEmail(email);
		user.setFirstname(email);
		user.setProfile(profile);
		return user;
	}


	
	@Override
	public User addStorekeeper(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getStorekeeper(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStorekeeper(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStorekeeper(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getStorekeepers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStorekeeper(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) throws Exception {

		User UserReturn = null;
				
		UserReturn = new User();
		UserReturn.setFirstname(DataTest.firstname());
		UserReturn.setEmail(DataTest.firstname());
		UserReturn.setProfile(Profile.MANAGER);
		
		return UserReturn;
	}
	
	
	


	

	
}