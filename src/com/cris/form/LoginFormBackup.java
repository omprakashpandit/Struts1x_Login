package com.cris.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginFormBackup extends ActionForm{
	
	private String loginid;
	private String password;

	
	public String getLoginid() {
		return loginid;
	}


	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
				
		ActionErrors ae=new ActionErrors();
		if(loginid.equals(""))
		{
			ae.add("loginid",new ActionMessage("lmsgkey"));
		}
		else if(password.equals(""))
			ae.add("password",new ActionMessage("pmsgkey"));
		
		return ae;
	}  

}
