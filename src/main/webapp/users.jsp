<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h3>Register a user</h3>
   <form action="/shop/createuser.html" method = "POST">
		<table>
			<tr>
				<td>Name:</td> <td><input type = "text" name = "userName"></td>
			</tr>
			
			<tr>
				<td>E-mail:</td> <td><input type = "text" name = "userEmail"></td>
			</tr>
		</table>
		<input type = "submit" value = "Register">
	</form>
   
    <p>
	<h3>View a user</h3>
	<form action="/shop/finduser.html" method = "POST">
 		<table>
			<tr>
				<td>User id:</td> <td><input type = "text" name = "userId"></td>
				<td><input type = "submit" value = "View"></td>
			</tr>
		</table> 
	</form>
	
	<p>
	<h3>Delete a user</h3>
	<form action="/shop/deleteuser.html" method = "POST">
 		<table>
			<tr>
				<td>User id:</td> <td><input type = "text" name = "userId"></td>
				<td><input type = "submit" value = "Delete"></td>
			</tr>
		</table> 
	</form>
	
	<p>
	<h3>Update a user</h3>
	<form action="/shop/updateuser.html" method = "POST">
 		<table>
			<tr>
				<td>User id:</td> <td><input type = "text" name = "userId"></td>
			</tr>
			
			<tr>
				<td>Name:</td> <td><input type = "text" name = "userName"></td>
			</tr>
			
			<tr>
				<td>E-mail:</td> <td><input type = "text" name = "userEmail"></td>
			</tr>
		</table> 
		<input type = "submit" value = "Update">
	</form>

</body>
</html>