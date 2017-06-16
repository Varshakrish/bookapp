package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.varsha.revature.Book;
import com.varsha.revature.BookDAO;

/**
 * Servlet implementation class AddBookServlet
 */
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
		String author_name=request.getParameter("Author_Name");
		String published_date=request.getParameter("published_Date");
		
		
	
		
		out.println("name"+name);
		out.println("price"+price);
		out.println("author_name"+author_name);
		out.println("published_date"+published_date);
		int p=Integer.parseInt(price);
		LocalDate s=LocalDate.parse(published_date);
		
		Book book=new Book();
		book.setName(name);
		book.setPrice(p);
		book.setAuthor_name(author_name);
		book.setPublished_date(s);
		out.println(book);
		BookDAO b=new BookDAO();
		try {
			b.addBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
