package model;

import java.util.Hashtable;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class UserManager {
	@EJB
	private UserDB userDB;
	
	public boolean isARegisteredUser(String user, String password) {
		boolean value = false;
		Hashtable<String,String> authorizedUsers = userDB.getAuthorizedUsers();
		if (authorizedUsers.containsKey(user) && (authorizedUsers.get(user).equals(password))) {
			value = true;
		}
		return value;
	}

}
