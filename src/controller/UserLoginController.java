package controller;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import model.UserManager;

@ManagedBean
@RequestScoped
public class UserLoginController {
	@ManagedProperty(value = "#{userLoginBean}")
	private UserLoginBean userLoginBean;
	@EJB
	private UserManager userManager;
	
	private static final String USER_NOT_EXIST_MSG = "L'usuari no està registrat a la Base de Dades";
	
	public void setUserLoginBean(UserLoginBean userLoginBean) {
		this.userLoginBean = userLoginBean;
	}
	
	public String verifyUser() {
		String value = "";
		if (userManager.isARegisteredUser(userLoginBean.getLogin(), userLoginBean.getPasswd())) {
			boolean logged = true;
			value = "welcome.xhtml";
			userLoginBean.setLogged(logged);
		}
		else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(USER_NOT_EXIST_MSG));
		}
		return value;
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		userLoginBean.setLogged(false);
		return "index.xhtml?faces-redirect=true";
	}
	
	public static String getUserNotExistMsg() {
		return USER_NOT_EXIST_MSG;
	}

}
