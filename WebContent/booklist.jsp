<!docType HTML>
<%@page import="com.varsha.revature.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.varsha.revature.BookDAO"%>
<html>
<head>
<title>BookApp_register</title>
</head>
<body>
	<h3>list of books</h3>
	<%
		BookDAO bookdao = new BookDAO();
		List<Book> bookList = bookdao.listbook();
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
		for (Book b : bookList) {
			out.println("<tr>");
			out.println("<td>"+b.getId() +"</td>");
			out.println("<td>" + b.getAuthor_name() + "</td>");
			out.println("<td>" + b.getName() + "</td>");
			out.println("<td>" + b.getPrice() + "</td>");
			out.println("<td>" + b.getPublished_date() + "</td>");
			out.println("</tr>");
		}
	%>
		</tbody>
		</table>


		</body>
</html>