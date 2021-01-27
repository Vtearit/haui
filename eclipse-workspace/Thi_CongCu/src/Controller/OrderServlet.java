package Controller;

import DAO.OrderDAO;
import DAO.Order_detailDAO;
import DAO.SeriDAO;
import Modal.Cart;
import Modal.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.mail.imap.protocol.Item;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

@WebServlet(urlPatterns = "/orderServlet")
public class OrderServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idString = req.getParameter("idCustomer");
		int customerID = Integer.parseInt(idString);
		String phone = req.getParameter("phoneUser");
		String name = req.getParameter("nameUser");
		String address = req.getParameter("addressUser");
		String dateRecieve = req.getParameter("dateRecieve");
		HttpSession session = req.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		int total = cart.totalCart();
		Date d = new Date();
		SimpleDateFormat formatDay = new SimpleDateFormat("yyyy-MM-dd HH:ss");
		String date = formatDay.format(d);
		OrderDAO orderDAO = new OrderDAO();
		SeriDAO seriDAO = new SeriDAO();
		PrintWriter printWriter = resp.getWriter();
		session.setAttribute("orderSession", new Order(customerID, date, total, address, name, dateRecieve, phone));	
		  try { 
			  if(orderDAO.insertOrder(customerID, date, total, address, name,dateRecieve, phone)) { 
				int orderID= orderDAO.OrderbyID(date, customerID);
				Order_detailDAO order_detailDAO= new Order_detailDAO(); 
				for(Entry<String, Modal.Item> list: cart.getCartItems().entrySet()){
			  	String productId=list.getValue().getProduct().getId(); 
			 	int price =list.getValue().getProduct().getPrice(); 
			 	int quantity =list.getValue().getQuantity(); 
			 	int percent_promotion =list.getValue().getProduct().getPercent_promotion(); 
			 	if(percent_promotion>0){
				price-=price*percent_promotion/100; 
			}
			 order_detailDAO.insertOrder_detail(orderID, productId, quantity, price); 
			 int idOrder_detail= order_detailDAO.Order_detailbyID(orderID);
			 seriDAO.UpdateStatusSeri(productId, idOrder_detail, quantity);
			} 
			printWriter.print("success"); resp.getWriter();
			session.removeAttribute("cart");
			}
			
		  else { 
			  	printWriter.print("fail"); resp.getWriter(); 
			  }
		  } catch (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
			  printWriter.print("success");
			  resp.getWriter();

		  }
		}	
	}
