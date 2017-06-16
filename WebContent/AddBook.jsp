<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADDBOOK</title>
</head>
<body>
<h3>ADD BOOK</h3>
	
	<form action="AddBookServlet">
	
		<br>Name:<input type="Name" name="Name" required />
		 <br>Price:<input type="price" name="price" required /> 
		 	 <br>Author_Name:<input type="text" name="Author_Name" required /> 
		  <br>Published_Date:<input type="date" name="published_Date" required /> 
		 <br> <button type=submit>Login</button>
	</form>
</body>
</html>