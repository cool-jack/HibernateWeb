<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Registration Form</h1>
<form name="registration_form" action="StudentRegistration" method="post">
<table>
<tr>
<td>First Name : </td>
<td><input type="text" name="firstName" /></td>
</tr>
<tr>
<td>Last Name : </td>
<td><input type="text" name="lastName" /></td>
</tr>
<tr>
<td>Email : </td>
<td><input type="email" name="email" /></td>
</tr>
<tr>
<td>Password : </td>
<td><input type="password" name="password" /></td>
</tr>
<tr>
<td>Confirm Password : </td>
<td><input type="password" name="conPassword" /></td>
</tr>
<tr>
<td>Mobile No : </td>
<td><input type="number" name="mobile_no" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit" /></td>
</table>
</form>


</body>
</html>