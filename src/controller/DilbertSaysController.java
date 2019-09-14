package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import model.DilbertSaysManager;

@ManagedBean
public class DilbertSaysController {
	@ManagedProperty(value = "#{userLoginBean}")
	private UserLoginBean userLoginBean;
	
	@EJB
	private DilbertSaysManager dilbertSaysManager;
	
	public DilbertSaysController() {}
	public void setUserLoginBean(UserLoginBean userLoginBean) {
		this.userLoginBean = userLoginBean;
	}
	public String getRandomSay() {
		return dilbertSaysManager.getRandomSay();
	}
}
