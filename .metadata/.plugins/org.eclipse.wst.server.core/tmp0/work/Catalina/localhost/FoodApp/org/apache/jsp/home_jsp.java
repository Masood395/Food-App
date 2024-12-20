/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-11-20 16:33:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.tap.restaurant.Restaurant;
import com.tap.user.User;
import com.tap.security.Security;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(6);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.tap.user.User");
    _jspx_imports_classes.add("com.tap.restaurant.Restaurant");
    _jspx_imports_classes.add("com.tap.security.Security");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Restaurant Details</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("    href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("/* General Styling */\r\n");
      out.write("body {\r\n");
      out.write("    font-family: 'Arial', sans-serif;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    background: linear-gradient(to right, #ff7e5f, #feb47b);\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: inherit;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Header Styling */\r\n");
      out.write("header {\r\n");
      out.write("    background-color: rgba(44, 62, 80, 0.9);\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header h1 {\r\n");
      out.write("    color: #08eee5;\r\n");
      out.write("    text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);\r\n");
      out.write("    margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav {\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav a {\r\n");
      out.write("    margin: 0 15px;\r\n");
      out.write("    color: #08eee5;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    transition: color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav a:hover {\r\n");
      out.write("    color: #ff5722;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Logout Icon (Left side) */\r\n");
      out.write(".logout {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 20px;\r\n");
      out.write("    left: 20px;\r\n");
      out.write("    color: #ff5722;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: transform 0.3s, color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logout:hover {\r\n");
      out.write("    transform: scale(1.2);\r\n");
      out.write("    color: #e64a19;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Cart Icon (Right side) */\r\n");
      out.write(".cart-icon {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 20px;\r\n");
      out.write("    right: 20px;\r\n");
      out.write("    color: #ff5722;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: transform 0.3s, color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cart-icon:hover {\r\n");
      out.write("    transform: scale(1.2);\r\n");
      out.write("    color: #e64a19;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cart-count {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: -10px;\r\n");
      out.write("    right: -10px;\r\n");
      out.write("    background-color: red;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 5px 10px;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Order History Button */\r\n");
      out.write(".order-history {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 20px;\r\n");
      out.write("    right: 70px;\r\n");
      out.write("    color: #ff5722;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    padding: 5px 10px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    gap: 5px;\r\n");
      out.write("    transition: background 0.3s, color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order-history i {\r\n");
      out.write("    font-size: 20px; /* Adjust the icon size */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order-history:hover {\r\n");
      out.write("    background: #ff5722;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Other Styles (Unchanged) */\r\n");
      out.write("/* Search Bar */\r\n");
      out.write(".search-container {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin: 20px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-container input[type=\"text\"] {\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-container button {\r\n");
      out.write("    padding: 10px 15px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    background-color: #ff5722;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-container button:hover {\r\n");
      out.write("    background-color: #e64a19;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Container and Card Styling */\r\n");
      out.write(".container {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    gap: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card {\r\n");
      out.write("    background-color: #e2b1aa;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    max-width: 300px;\r\n");
      out.write("    box-shadow: 0 4px 15px rgba(0, 0, 0, 0.3);\r\n");
      out.write("    transition: transform 0.3s, box-shadow 0.3s;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card:hover {\r\n");
      out.write("    transform: translateY(-5px);\r\n");
      out.write("    box-shadow: 0 8px 25px rgba(0, 0, 0, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card img {\r\n");
      out.write("    max-width: 100%;\r\n");
      out.write("    height: 200px;\r\n");
      out.write("    object-fit: cover;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card h2 {\r\n");
      out.write("    margin: 10px 0;\r\n");
      out.write("    color: #ff5722;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card p {\r\n");
      out.write("    margin: 5px 0;\r\n");
      out.write("    color: #152d2a;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card p strong {\r\n");
      out.write("    color: #ff5722;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Footer Styling */\r\n");
      out.write("footer {\r\n");
      out.write("    background-color: rgba(44, 62, 80, 0.9);\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer p {\r\n");
      out.write("    margin: 5px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons {\r\n");
      out.write("    margin: 10px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons a {\r\n");
      out.write("    margin: 0 10px;\r\n");
      out.write("    color: #08eee5;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    transition: color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons a:hover {\r\n");
      out.write("    color: #ff5722;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

    List<Restaurant> rList = (List<Restaurant>) session.getAttribute("restaurantList");
    User user = (User) session.getAttribute("loggedInUser");
    Integer cartItemCount = (Integer) session.getAttribute("cartItemCount");
    if (cartItemCount == null) {
        cartItemCount = 0;
    }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("        <h1>\r\n");
      out.write("            Welcome\r\n");
      out.write("            ");
 out.println(Security.decryption(user.getUsername())); 
      out.write("\r\n");
      out.write("        </h1>\r\n");
      out.write("        <div class=\"nav\">\r\n");
      out.write("            <a href=\"#\">Home</a> <a href=\"#\">About</a> <a href=\"#\">Contact</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Logout Icon -->\r\n");
      out.write("        <a href=\"logout\" class=\"logout\"> <i class=\"fas fa-sign-out-alt\"></i>\r\n");
      out.write("            Logout\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- Order History Button -->\r\n");
      out.write("        <a href=\"orderHistory\" class=\"order-history\"> <i\r\n");
      out.write("            class=\"fas fa-history\"></i> <!-- Order History -->\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- Cart Icon -->\r\n");
      out.write("        <a href=\"cart.jsp\" class=\"cart-icon\">\r\n");
      out.write("            <i class=\"fas fa-shopping-cart\"></i>\r\n");
      out.write("            ");
 if (cartItemCount > 0) { 
      out.write("\r\n");
      out.write("                <span class=\"cart-count\">");
      out.print( cartItemCount );
      out.write("</span>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </a>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- Search Bar -->\r\n");
      out.write("    <div class=\"search-container\">\r\n");
      out.write("        <input type=\"text\" id=\"searchInput\"\r\n");
      out.write("            placeholder=\"Search for restaurants...\" onkeyup=\"filterRestaurants()\">\r\n");
      out.write("        <button onclick=\"filterRestaurants()\">Search</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\" id=\"restaurantContainer\">\r\n");
      out.write("        ");
 
        if (rList != null && !rList.isEmpty()) {
            for (Restaurant rst : rList) {
        
      out.write("\r\n");
      out.write("        <a href=\"getmenu?id=");
      out.print( rst.getRid() );
      out.write("\" class=\"card\"\r\n");
      out.write("            data-name=\"");
      out.print( rst.getName().toLowerCase() );
      out.write("\"> <img\r\n");
      out.write("            src=\"");
      out.print( rst.getImage() );
      out.write("\" alt=\"");
      out.print( rst.getName() );
      out.write("\">\r\n");
      out.write("            <h2>");
      out.print( rst.getName() );
      out.write("</h2>\r\n");
      out.write("            <p>\r\n");
      out.write("                <strong>Cuisine Type:</strong>\r\n");
      out.write("                ");
      out.print( rst.getCuisineType() );
      out.write("</p>\r\n");
      out.write("            <p>\r\n");
      out.write("                <strong>Address:</strong>\r\n");
      out.write("                ");
      out.print( rst.getAddress() );
      out.write("</p>\r\n");
      out.write("            <p>\r\n");
      out.write("                <strong>Rating:</strong>\r\n");
      out.write("                ");
      out.print( rst.getRating() );
      out.write("</p>\r\n");
      out.write("            <p>\r\n");
      out.write("                <strong>Delivery Time:</strong>\r\n");
      out.write("                ");
      out.print( rst.getDeliveryTime() );
      out.write("</p>\r\n");
      out.write("            <p>\r\n");
      out.write("                <strong>Active:</strong>\r\n");
      out.write("                ");
      out.print( rst.isActive() ? "Yes" : "No" );
      out.write("</p>\r\n");
      out.write("        </a>\r\n");
      out.write("        ");
 
            }
        } else {
            out.println("<p>No restaurants available.</p>");
        }
        
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <p>&copy; 2024 Your Restaurant App. All rights reserved.</p>\r\n");
      out.write("        <div class=\"social-icons\">\r\n");
      out.write("            <a href=\"#\" class=\"fab fa-facebook-f\"></a> <a href=\"#\"\r\n");
      out.write("                class=\"fab fa-twitter\"></a> <a href=\"#\" class=\"fab fa-instagram\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("function filterRestaurants() {\r\n");
      out.write("    const input = document.getElementById('searchInput').value.toLowerCase();\r\n");
      out.write("    const cards = document.querySelectorAll('.card');\r\n");
      out.write("    cards.forEach(card => {\r\n");
      out.write("        const name = card.getAttribute('data-name');\r\n");
      out.write("        card.style.display = name.includes(input) ? 'block' : 'none';\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
