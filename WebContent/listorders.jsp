<%@page import="com.varsha.revature.model.Order"%>
<%@page import="com.varsha.revature.dao.OrderDAO"%>
<%@page import="com.varsha.revature.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Orders</title>
</head>
<body>


<%
	  
	 User user=(User) session.getAttribute("logged_in_user");
	 %>
	
	Welcome <%=user.getName() %> !!!
	
	
	
<h3> LISTORDERS </h3>
	<%
		OrderDAO orderdao = new OrderDAO();
		List<Order> orderList = orderdao.listorder();
		//out.println("books:" + bookList);
	%>
	<table border="1">
		<thead>
			<tr>
			    <th>userid</th>
				<th>bookid</th>
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


<a href="MyOrders.jsp">My Orders</a>


</body>
</html>