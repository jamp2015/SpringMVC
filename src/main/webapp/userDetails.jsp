<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Info</title>
</head>
	<body>
	<h3>User Info</h3>
		<table>
			<tr>
				<td>User id:</td>
				<td>${user.userId}</td>
			</tr>
		
			<tr>
				<td>User name:</td>
				<td>${user.name}</td>
			</tr>
			
			<tr>
				<td>User email:</td>
				<td>${user.email}</td>
			</tr>
		</table>
	
	</body>
</html>