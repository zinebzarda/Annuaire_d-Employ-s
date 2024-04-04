<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
<form action="login" method="post"> 
<table>
 <tr>
  <td>User name</td>
  <td><input type="text" name="login" required></td>
 </tr>
 <tr>
  <td>Password</td>
  <td><input type="password" name="pw" required></td>
 </tr>
 <tr>
  <td><input type="submit" value="Se Connecter"></td>
 </tr>
</table>
</form>

</body>
</html>