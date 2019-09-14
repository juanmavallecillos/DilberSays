package model;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

@Singleton
public class DilbertSaysDB {
	private List<String>says=new ArrayList<String>();

	public DilbertSaysDB() {
		super();
		says.add("Engineers like to solve problems. If there are no problems handily aviala-\n" + 
				"ble, they will create their own problems.");
		says.add("An optimist is simply a pessimist with no job experience.");
		says.add("When did ignorance become a point of view?");
		says.add("Change is good. You go first.");
		says.add("I get mail; therefore I am.");

	}

	public List<String> getSays() {
		return says;
	}

	public void setSays(List<String> says) {
		this.says = says;
	}
	
	
}
