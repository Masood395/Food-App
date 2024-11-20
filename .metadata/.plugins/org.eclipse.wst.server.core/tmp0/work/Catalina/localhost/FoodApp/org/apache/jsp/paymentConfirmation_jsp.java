/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-11-20 09:03:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paymentConfirmation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- <!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Payment Confirmation</title>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        /* General Styling */\r\n");
      out.write("        body {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            background: linear-gradient(135deg, #84fab0, #8fd3f4);\r\n");
      out.write("            font-family: 'Roboto', sans-serif;\r\n");
      out.write("            animation: fadeIn 1s ease-in-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes fadeIn {\r\n");
      out.write("            from { opacity: 0; }\r\n");
      out.write("            to { opacity: 1; }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Confirmation Container */\r\n");
      out.write("        .confirmation-container {\r\n");
      out.write("            background: #ffffff;\r\n");
      out.write("            padding: 40px;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.2);\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            max-width: 500px;\r\n");
      out.write("            width: 90%;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            animation: slideIn 0.8s ease-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes slideIn {\r\n");
      out.write("            from { transform: scale(0.9); opacity: 0; }\r\n");
      out.write("            to { transform: scale(1); opacity: 1; }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Success Icon */\r\n");
      out.write("        .success-icon {\r\n");
      out.write("            width: 80px;\r\n");
      out.write("            height: 80px;\r\n");
      out.write("            margin: 0 auto 20px;\r\n");
      out.write("            background: radial-gradient(circle, #4CAF50 60%, #388E3C);\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);\r\n");
      out.write("            animation: pop 0.8s ease-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes pop {\r\n");
      out.write("            0% { transform: scale(0); }\r\n");
      out.write("            70% { transform: scale(1.2); }\r\n");
      out.write("            100% { transform: scale(1); }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .success-icon svg {\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            stroke: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Confirmation Message */\r\n");
      out.write("        .confirmation-container h2 {\r\n");
      out.write("            color: #28a745;\r\n");
      out.write("            font-size: 2.5em;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            animation: fadeInText 0.6s ease-in-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes fadeInText {\r\n");
      out.write("            from { opacity: 0; transform: translateY(10px); }\r\n");
      out.write("            to { opacity: 1; transform: translateY(0); }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .confirmation-container p {\r\n");
      out.write("            font-size: 1.2em;\r\n");
      out.write("            margin: 20px 0;\r\n");
      out.write("            color: #555;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Transaction Summary */\r\n");
      out.write("        .transaction-summary {\r\n");
      out.write("            background: #f9f9f9;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            margin: 20px 0;\r\n");
      out.write("            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            animation: fadeInText 0.8s ease-in-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .transaction-summary h3 {\r\n");
      out.write("            margin: 0 0 10px;\r\n");
      out.write("            color: #007bff;\r\n");
      out.write("            font-size: 1.5em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .transaction-summary p {\r\n");
      out.write("            margin: 5px 0;\r\n");
      out.write("            font-size: 1em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Back Button */\r\n");
      out.write("        .confirmation-container .back-button {\r\n");
      out.write("            background: linear-gradient(to right, #007bff, #0056b3);\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 12px 25px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 50px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size: 1.1em;\r\n");
      out.write("            transition: transform 0.3s ease, background 0.3s ease;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .confirmation-container .back-button:hover {\r\n");
      out.write("            background: linear-gradient(to right, #0056b3, #004494);\r\n");
      out.write("            transform: scale(1.05);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Responsive Design */\r\n");
      out.write("        @media (max-width: 600px) {\r\n");
      out.write("            .confirmation-container {\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .confirmation-container h2 {\r\n");
      out.write("                font-size: 2em;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .transaction-summary h3 {\r\n");
      out.write("                font-size: 1.3em;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"confirmation-container\">\r\n");
      out.write("    Success Icon\r\n");
      out.write("    <div class=\"success-icon\">\r\n");
      out.write("        <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\" fill=\"none\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("            <path d=\"M20 6L9 17l-5-5\"></path>\r\n");
      out.write("        </svg>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <h2>Payment Successful!</h2>\r\n");
      out.write("    <p>Thank you for your purchase. Your payment has been processed successfully.</p>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"transaction-summary\">\r\n");
      out.write("        <h3>Transaction Summary</h3>\r\n");
      out.write("        <p><strong>Transaction ID:</strong> 123456789</p>\r\n");
      out.write("        <p><strong>Amount:</strong> â¹1,499.00</p>\r\n");
      out.write("        <p><strong>Date:</strong> November 19, 2024</p>\r\n");
      out.write("        <p><strong>Payment Method:</strong> UPI</p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <a href=\"javascript:history.back();\" class=\"back-button\">Back to Previous Page</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write(" -->\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" <!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Payment Confirmation</title>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        /* General Styling */\r\n");
      out.write("        body {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            background: linear-gradient(135deg, #84fab0, #8fd3f4);\r\n");
      out.write("            font-family: 'Roboto', sans-serif;\r\n");
      out.write("            animation: fadeIn 1s ease-in-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes fadeIn {\r\n");
      out.write("            from { opacity: 0; }\r\n");
      out.write("            to { opacity: 1; }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Confirmation Container */\r\n");
      out.write("        .confirmation-container {\r\n");
      out.write("            background: #ffffff;\r\n");
      out.write("            padding: 40px;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.2);\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            max-width: 500px;\r\n");
      out.write("            width: 90%;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            animation: slideIn 0.8s ease-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes slideIn {\r\n");
      out.write("            from { transform: scale(0.9); opacity: 0; }\r\n");
      out.write("            to { transform: scale(1); opacity: 1; }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Success Icon */\r\n");
      out.write("        .success-icon {\r\n");
      out.write("            width: 80px;\r\n");
      out.write("            height: 80px;\r\n");
      out.write("            margin: 0 auto 20px;\r\n");
      out.write("            background: radial-gradient(circle, #4CAF50 60%, #388E3C);\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);\r\n");
      out.write("            animation: pop 0.8s ease-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes pop {\r\n");
      out.write("            0% { transform: scale(0); }\r\n");
      out.write("            70% { transform: scale(1.2); }\r\n");
      out.write("            100% { transform: scale(1); }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .success-icon svg {\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            stroke: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Confirmation Message */\r\n");
      out.write("        .confirmation-container h2 {\r\n");
      out.write("            color: #28a745;\r\n");
      out.write("            font-size: 2.5em;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            animation: fadeInText 0.6s ease-in-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes fadeInText {\r\n");
      out.write("            from { opacity: 0; transform: translateY(10px); }\r\n");
      out.write("            to { opacity: 1; transform: translateY(0); }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .confirmation-container p {\r\n");
      out.write("            font-size: 1.2em;\r\n");
      out.write("            margin: 20px 0;\r\n");
      out.write("            color: #555;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Back Button */\r\n");
      out.write("        .confirmation-container .back-button {\r\n");
      out.write("            background: linear-gradient(to right, #007bff, #0056b3);\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 12px 25px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 50px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size: 1.1em;\r\n");
      out.write("            transition: transform 0.3s ease, background 0.3s ease;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .confirmation-container .back-button:hover {\r\n");
      out.write("            background: linear-gradient(to right, #0056b3, #004494);\r\n");
      out.write("            transform: scale(1.05);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Responsive Design */\r\n");
      out.write("        @media (max-width: 600px) {\r\n");
      out.write("            .confirmation-container {\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .confirmation-container h2 {\r\n");
      out.write("                font-size: 2em;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"confirmation-container\">\r\n");
      out.write("    <!-- Success Icon -->\r\n");
      out.write("    <div class=\"success-icon\">\r\n");
      out.write("        <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\" fill=\"none\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("            <path d=\"M20 6L9 17l-5-5\"></path>\r\n");
      out.write("        </svg>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <h2>Payment Successful!</h2>\r\n");
      out.write("    <p>Thank you for your purchase. Your payment has been processed successfully.</p>\r\n");
      out.write("\r\n");
      out.write("    <a href=\"home.jsp\" class=\"back-button\">Back to Home</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write(" ");
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
