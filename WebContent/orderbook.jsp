<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ORDER BOOKS</title>
</head>
<body>
<h3> ORDER BOOKS </h3>
<form action="OrderBookServlet">
userId: <input type="number" name="userid" required />
<br/>
select book:
<select name="bookid" required>
<option value="1"> core java </option>
<option value="2"> MYSQL </option>
</select>
<br/>
Quantity:<input type="number" name="quantity" min="1" required />


<br/>
<button type="submit"> submit </button>
</form>
</body>
</html>