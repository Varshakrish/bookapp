<%@page import="com.varsha.revature.User"%>
<%@page import="com.varsha.revature.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.varsha.revature.OrderDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Orders</title>
</head>
<body>
<h3> MYORDERS </h3>
	<%
	  
	 User user=(User) session.getAttribute("logged_in_user");
	 %>
	
	welcome<%=user.getName() %> !!!

		<% OrderDAO orderDAO = new OrderDAO();
		List<Order> orderList = orderDAO.listorder(user.getId()); %>
		//out.println("books:" + bookList);
	
	<table border="1">
		<thead>
			<tr>
			    <th>userId</th>
				<th>bookId</th>
				<th>quantity</th>
			</tr>
		</thead>
	<%
		for (Order o: orderList) {
			out.println("<tr>");
			out.println("<td>"+o.getUserid() +"</td>");
			out.println("<td>" +o.getBookid() + "</td>");
			out.println("<td>" +o.getQuantity() + "</td>");
			out.println("<td>" +o.getStatus() + "</td>");
			out.println("<td>" +o.getOrderDate() + "</td>");
		
			
			
			out.println("</tr>");
		}
	%>
		</tbody>
		</table>



</body>
</html>