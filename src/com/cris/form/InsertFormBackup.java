package com.cris.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class InsertFormBackup extends ActionForm{
	
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


	
	/*@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		ActionErrors ae=new ActionErrors();
		if(loginid.equals(""))
			ae.add("loginid",new ActionMessage("msgkey"));
		return ae;
	}  */

}
