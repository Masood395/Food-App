package com.tap.servlet.orderhistoryservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.orderhistory.OrderHistory;
import com.tap.orderhistorydao.OrderHistoryDAO;
import com.tap.orderhistorydaoimpl.OrderHistoryDAOImpl;
import com.tap.user.User;

@WebServlet("/orderHistory")
public class OrderHistoryServlet extends HttpServlet {
	
	private List<OrderHistory> ohList;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    User user = (User) req.getSession().getAttribute("loggedInUser");
	    
		
		OrderHistoryDAO ohdao = new OrderHistoryDAOImpl();
		ohList= ohdao.getOrderHistory(user.getUid());
		
		req.getSession().setAttribute("ohList", ohList);
		
		resp.sendRedirect("orderhistory.jsp");
		
	}

}
