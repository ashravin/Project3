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
<h1>Welcome to Book Search page</h1>


<form action="Searchservlet" method="post">
 <p>Enter Title : <input type="text" name="yourtitle" size="8">
 </p>
 <p>Enter Author: <input type="text" name="yourauthor" size="8">
 </p>
 <p>Enter year: <input type="text" name="youryear" size="8">
 </p>
<input type="submit" value="Search" />
</form>
</head>
<body>

</body>
</html>