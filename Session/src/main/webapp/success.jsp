<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
You have successfully registered.<br>
<%
String username=null, sessionid=null;
if(request.getSession().getAttribute("username")==null){
	response.sendRedirect("index.jsp");
}
else{
	username= request.getSession().getAttribute("username").toString();
	sessionid= request.getSession().getId();
}
%>
Username: <%= username %><br>
SessionId: <%= sessionid %>
<form action="<%= request.getContextPath() %>/session_file" method="post">
<input type="hidden" name="action" value="destroy"/>
<input type="submit" value="logout">
</form>
</body>
</html>