package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.varsha.revature.dao.BookDAO;
import com.varsha.revature.model.Book;


@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	String Id=request.getParameter("Id");
		String name=request.getParameter("Name");
		String price=request.getParameter("price");
		String authorName=request.getParameter("AuthorName");
		String publishedDate=request.getParameter("publishedDate");
		
		
	
		
		out.println("name"+name);
		out.println("price"+price);
		out.println("authorName"+authorName);
		out.println("publishedDate"+publishedDate);
		int p=Integer.parseInt(price);
		LocalDate s=LocalDate.parse(publishedDate);
		
		Book book=new Book();
		book.setName(name);
		book.setPrice(p);
		book.setAuthorName(authorName);
		book.setPublishedDate(s);
		out.println(book);
		BookDAO b=new BookDAO();
		try {
			b.addBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
