package model;

import java.util.Random;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DilbertSaysManager {
	@EJB
	private DilbertSaysDB dilbertSaysDB;
	
	public String getRandomSay() {
		Random rand = new Random();
		int index = rand.nextInt(5);
		return dilbertSaysDB.getSays().get(index);
	}
	
	public DilbertSaysManager() {
		super();
	}

}
