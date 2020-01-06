<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<% String encode= response.encodeURL(request.getContextPath()); %>
<form action="<%= encode %>/session" method="post">
Username: <input type="text" name="username" placeholder="Enter Username"/><br>
Password: <input type="password" name="password" placeholder="Enter Password"/><br>
<input type="hidden" name="action" value="logging">
<input type="submit" value="Submit"/>
</form>
</body>
</html>