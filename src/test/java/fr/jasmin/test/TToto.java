package fr.jasmin.test;

import fr.jasmin.enums.Gender;
import fr.jasmin.utils.DataTest;
import fr.jasmin.utils.Utils;

public class TToto {

	public static void main(String[] args) {

		
		Utils.trace("Trave  teee");
		Gender gender = DataTest.gender();
		Utils.trace(gender.getValue());
		Utils.trace(gender.getTitle());
		String firstname = DataTest.firstname(gender);
		String lastname = DataTest.lastname();
		Utils.trace(firstname);
		Utils.trace(lastname);
		
		
		Utils.trace(DataTest.email(firstname,lastname));
		

		
		
	}

}
