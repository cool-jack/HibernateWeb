<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<td><input type="text" name="mobileNo" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit" /></td>
</table>
</form>
<form action="StudentRegistration" method="get">
<input type="hidden" name="getAll">
<input type="submit" value="View All">
</form>
<form action="StudentRegistration" method="get">
<input type="text" name="id">
<input type="hidden" name="getStudentById">
<input type="submit" value="View Student">
</form>
<form action="StudentRegistration" method="get">
<input type="text" name="id_delete">
<input type="hidden" name="deleteStudentById">
<input type="submit" value="delete Student">
</form>
<form action="StudentRegistration" method="get">
<input type="hidden" name="deleteAll">
<input type="submit" value="Delete All">
</form>
</body>
</html>