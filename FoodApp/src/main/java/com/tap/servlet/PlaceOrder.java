package com.tap.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.cartitem.CartItem;
import com.tap.order.Order;
import com.tap.orderdao.OrderDAO;
import com.tap.orderdaoimpl.OrderDAOImpl;
import com.tap.orderhistory.OrderHistory;
import com.tap.orderhistorydao.OrderHistoryDAO;
import com.tap.orderhistorydaoimpl.OrderHistoryDAOImpl;
import com.tap.orderitem.OrderItem;
import com.tap.orderitemdao.OrderItemDAO;
import com.tap.orderitemdaoimpl.OrderItemDAOImpl;
import com.tap.user.User;
import com.tap.userdetails.UserDetails;
import com.tap.userdetailsdao.UserDetailsDAO;
import com.tap.userdetailsdaoimpl.UserDetailsDAOImpl;


@WebServlet("/placeOrder")
public class PlaceOrder extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
    	User user = (User) req.getSession().getAttribute("loggedInUser");
		Map<Integer, CartItem> cart = (Map<Integer, CartItem>) req.getSession().getAttribute("cart");
        double totalAmount = Double.parseDouble(req.getParameter("totalAmount"));
		
		String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zip = req.getParameter("zip");
        String paymentMethod = req.getParameter("paymentMethod");
        
        UserDetailsDAO uddao = new UserDetailsDAOImpl();
		UserDetails ud = new UserDetails(firstName,lastName,email,phone,address,city,state,zip);
		uddao.save(ud);
		
		OrderDAO odao = new OrderDAOImpl();
		if (cart != null && !cart.isEmpty()) {
            for (CartItem item1 : cart.values()) {
            	
					Order o = new Order(user.getUid(),item1.getRestaurant(),item1.getItemId(),item1.getQuantity(),totalAmount,paymentMethod, "Success");
					int x = odao.addOrder(o);
					if(x!=0) {
						
						for (CartItem item : cart.values()) {
							
						int oid=odao.getMaxId();
						OrderHistoryDAO ohdao = new OrderHistoryDAOImpl();
						OrderHistory oh = new OrderHistory(oid,user.getUid(),item.getRestaurant(),totalAmount,"Success");
						int y= ohdao.addOrderHistory(oh);
						if(y!=0) {
							
							for (CartItem item2 : cart.values()) {
							OrderItemDAO oidao= new OrderItemDAOImpl();
							double itemTotal = item2.getPrice() * item2.getQuantity();
							OrderItem oi = new OrderItem(oid,item2.getItemId(),item2.getQuantity(),itemTotal);
							oidao.addOrderItem(oi);
							}
						
						}
						else {}
						
							break;
						}
					}
					else {}
					break;
            	}
            }
		
		
		req.getSession().removeAttribute("cart");
		req.getSession().setAttribute("cartItemCount", 0);
    
		resp.sendRedirect("paymentConfirmation.jsp");
	}

}
