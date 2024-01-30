<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><style>
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
<h1>Welcome to Book Registration Page</h1>
</head>
<body>
<form action="Bookservlet" method="post">
 <p>Title: <input type="text" name="title">
 </p>
 <p>Author: <input type="text" name="author">
 </p>
 <p>Year: <input type="text" name="year">
 </p>
<input type="submit" value="Submit" />
</form>
</body>

</body>
</html>