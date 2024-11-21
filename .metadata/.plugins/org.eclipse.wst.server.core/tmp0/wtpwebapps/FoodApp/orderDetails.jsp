<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.tap.orderitemdao.OrderItemDAO" %>
<%@ page import="com.tap.orderitemdaoimpl.OrderItemDAOImpl" %>
<%@ page import="com.tap.orderitem.OrderItem" %>
<%@ page import="com.tap.menudao.MenuDAO" %>
<%@ page import="com.tap.menudaoimpl.MenuDaoImpl" %>
<%@ page import="com.tap.menu.Menu" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Order Details</title>

<!-- Bootstrap 5 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">

<style>
    /* Custom Styling */
    body {
        font-family: 'Arial', sans-serif;
        background-color: #f8f9fa;
        color: #333;
    }

    .container {
        max-width: 1200px;
        margin-top: 30px;
    }

    .table {
        border-radius: 10px;
        overflow: hidden;
        background-color: white;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    }

    .table th, .table td {
        padding: 15px;
        text-align: center;
    }

    .table th {
        background-color: #007bff;
        color: white;
    }

    .table td {
        background-color: #f9f9f9;
    }

    .table-hover tbody tr:hover {
        background-color: #f1f1f1;
        transition: background-color 0.3s ease;
    }

    h2 {
        color: #007bff;
        margin-bottom: 20px;
    }

    .order-summary {
        background-color: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    }

    .order-summary h3 {
        color: #333;
    }

    .order-summary p {
        font-size: 1.2em;
    }

    .back-btn {
        margin-top: 20px;
        background-color: #6c757d;
        color: white;
        border: none;
        border-radius: 5px;
        padding: 10px 20px;
        cursor: pointer;
    }

    .back-btn:hover {
        background-color: #5a6268;
    }

    .fade-in {
        animation: fadeIn 1s ease-in-out;
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
        }
        to {
            opacity: 1;
        }
    }
</style>
</head>
<body>

<div class="container fade-in">
    <!-- Order Details Header -->
    <h2>Order Details</h2>

    <!-- Order Item Table -->
    <div class="order-summary">
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>Menu Name</th>
                    <th>Quantity</th>
                    <th>Sub Total</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    String orderIdParam = request.getParameter("orderId");
                    int oid = 0;

                    // Check if the orderID is valid
                    if (orderIdParam != null && !orderIdParam.isEmpty()) {
                        oid = Integer.parseInt(orderIdParam); // Convert to integer
                    }

                    OrderItemDAO oidao = new OrderItemDAOImpl();
                    List<OrderItem> oiList = oidao.getOrderItem(oid);

                    // Loop through the order items and display them
                    for(OrderItem oi : oiList) {
                        MenuDAO mdao = new MenuDaoImpl();
                        Menu m = mdao.getById(oi.getMenuId());
                %>
                <tr>
                    <td><%= m.getMenuName() %></td>
                    <td><%= oi.getQuantity() %></td>
                    <td>$<%= String.format("%.2f", oi.getItemTotal()) %></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>

    <!-- Back to Previous Page Button -->
    <button class="back-btn" onclick="window.history.back();">
        <i class="fas fa-arrow-left"></i> Back to Orders
    </button>
</div>

<!-- Bootstrap 5 JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
