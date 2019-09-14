package model;


import java.util.Hashtable;

import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class UserDB {
	
	private Hashtable<String,String> authorizedUsers = new Hashtable<String, String>();

	public UserDB() {
		super();
		init();
	}
	
	private void init() {
		authorizedUsers.put("user1", "pass1");
	}
	
	public void setAuthorizedUsers(Hashtable<String, String> authorizedUsers) {
		this.authorizedUsers = authorizedUsers;
	}

	public Hashtable<String,String> getAuthorizedUsers(){
		return authorizedUsers;
		
	}
	
	

}
