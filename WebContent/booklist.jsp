<!docType HTML>
<%@page import="com.varsha.revature.User"%>
<%@page import="com.varsha.revature.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.varsha.revature.BookDAO"%>
<html>
<head>
<title>BookApp_register</title>
</head>
<body>

<%
	  
	 User user=(User) session.getAttribute("logged_in_user");
	 %>
	
	welcome<%=user.getName() %>
	
	<h3>list of books</h3>
	<%
		BookDAO bookdao = new BookDAO();
		List<Book> booklist = bookdao.listbook();
		//out.println("books:" + bookList);
	%>
	<table border="1">
		<thead>
			<tr>
			    <th>id</th>
				<th>name</th>
				<th>author_name</th>
				<th>price</th>
				<th>published_date</th>
			</tr>
		</thead>
		
	<%
		for (Book a: booklist) {
			out.println("<tr>");
			out.println("<td>"+a.getId() +"</td>");
			out.println("<td>" + a.getAuthor_name() + "</td>");
			out.println("<td>" + a.getName() + "</td>");
			out.println("<td>" + a.getPrice() + "</td>");
			out.println("<td>" + a.getPublished_date() + "</td>");
			out.println("</tr>");
		}
	%>
		</tbody>
		</table>


		</body>
</html>