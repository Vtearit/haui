package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.LoginDAO;
import Modal.Cart;
import Modal.Customer;
import Modal.CustomerSession;
import Tool.CookieService;

@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emaillogin = request.getParameter("email");
		String passwordlogin = request.getParameter("pass");
		PrintWriter printWriter = response.getWriter();
		LoginDAO loginDAO = new LoginDAO();
		try {
			if (loginDAO.checkLogin(emaillogin, passwordlogin) == 1) {
				printWriter.print("wrong");
				response.getWriter();
			} else if (loginDAO.checkLogin(emaillogin, passwordlogin) == 0) {
				HttpSession session = request.getSession();
				CustomerSession customerSession = null;
				session.setAttribute("customerSession", new Customer(CustomerSession.id, CustomerSession.name,
						CustomerSession.phone, CustomerSession.email, CustomerSession.address));

				printWriter.print("success");
				response.getWriter();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
