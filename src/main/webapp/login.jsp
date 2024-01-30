<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta name="viewport" content="width=device-width, initial-scale=1.0">    
<!DOCTYPE html>
<html>
<head>
<style>
body {background-color: powderblue;}
h1   {color: blue;}
p    {color: red;}
.city {
  background-color: tomato;
  color: white;
  border: 2px solid black;
  margin: 20px;
  padding: 20px;
}
</style>
<meta charset="ISO-8859-1">
<h1>Welcome to login page</h1>


<form action="Loginservlet" method="post">
 <p>Enter your username: <input type="text" name="yourName" size="8">
 </p>
 <p>Enter your password: <input type="text" name="yourpass" size="8">
 </p>
 <p>Please click here to <a href="Adminregistration.jsp"> register </a>. </p>
 <input type="submit" value="Login" />
</form>

</head>
<body>

</body>
</html>