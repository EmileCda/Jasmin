package fr.jasmin.model.dao.interfaces;

import java.util.List;

import fr.jasmin.entity.User;

public interface IUserDao {
	
	

	User get(String email) throws Exception ;
	User get(int id) throws Exception ;

	User addStorekeeper(User user) throws Exception ;
	User getStorekeeper(Integer id) throws Exception;
	void updateStorekeeper(User user) throws Exception;
	void removeStorekeeper(Integer id) throws Exception;
	List<User> getStorekeepers();	
	void removeStorekeeper(User user) throws Exception;
	

}