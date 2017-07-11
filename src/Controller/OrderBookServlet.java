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
import com.varsha.revature.dao.OrderDAO;
import com.varsha.revature.model.Order;

/**
 * Servlet implementation class OrderBookServlet
 */
@WebServlet("/OrderBookServlet")
public class OrderBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param orderDate 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("OrderBookServlet");
		String userid=request.getParameter("userid");
			String bookid=request.getParameter("bookid");
			String quantity=request.getParameter("quantity");
		
			out.println("userid"+userid);
			out.println("bookid"+bookid);
			out.println("quantity"+quantity);
			
			int i=Integer.parseInt(bookid);
			int j=Integer.parseInt(userid);
			int l=Integer.parseInt(quantity);

			Order order=new Order();
			order.setUserId(j);
			order.setBookid(i);
			order.setQuantity(l);
			
			
			OrderDAO o=new OrderDAO();
			try {
				o.bookOrder(order);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			response.sendRedirect("listorders.jsp");
		}
	}
