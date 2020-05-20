<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
	function validateform() {

		var name = document.forms[0].loginid.value;
		var password = document.forms[0].password.value;

		if (name == null || name == "") {
			alert("Name can't be blank");
			return false;
		} else if (password.length < 6) {
			alert("Password must be at least 6 characters long.");
			return false;
		}
	}
</script>
<body>
	

	<html:form action="/InsertAction" onsubmit="return validateform()">
	Login ID:-	<html:text property="loginid" />
		<br />
	Password:-	<html:text property="password" />
		<br />
		<html:submit value="SUBMIT" />
		<html:errors />
	</html:form>
<!-- 	<form action="/login" name="myform" onsubmit="return validateform()">
		Login ID:-<input type="text" name="loginid" ><br>
		Password:-<input type="text" name="password"><br/>
		<input type="submit" value="SUBMIT">
		
	</form> -->

</body>
</html>



