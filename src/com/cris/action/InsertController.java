package com.cris.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cris.dao.InsertData;

public class InsertController extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		InsertData insdata=new InsertData();
		insdata.insertdata(request, response);
		return mapping.findForward("dbsuccess");
		/*
		String loginid = request.getParameter("loginid");
		String password = request.getParameter("password");

		if (loginid.equalsIgnoreCase("om")&& password.equalsIgnoreCase("prakash")) {
			return mapping.findForward("loginsuccess");
			
		} 
		else {
			return mapping.findForward("loginfail");
		}*/
		
		
	}
}
