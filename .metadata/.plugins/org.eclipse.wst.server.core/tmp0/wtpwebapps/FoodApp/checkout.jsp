<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.tap.cartitem.CartItem" %>
<%@ page import="com.tap.user.User" %>
<%@ page import="com.tap.security.Security" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checkout</title>
    
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">

    <style>
        /* General Styling */
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #f5f7fa, #c3cfe2);
            color: #333;
        }

        /* Header Styling */
        header {
            background: #007bff;
            color: white;
            padding: 20px;
            text-align: center;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }

        header h1 {
            margin: 0;
            font-size: 2.5em;
        }

        /* Container for Checkout */
        .container {
            max-width: 900px;
            margin-top: 30px;
            background: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
        }

        .table td, .table th {
            text-align: center;
        }

        .form-section h2 {
            color: #007bff;
            margin-top: 30px;
        }

        .form-section {
            padding-bottom: 20px;
            border-bottom: 2px solid #007bff;
        }

        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }

        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #0056b3;
        }

        .btn-back {
            background-color: #6c757d;
            border-color: #6c757d;
            color: white;
        }

        .btn-back:hover {
            background-color: #5a6268;
            border-color: #5a6268;
        }

        .payment-method label {
            display: flex;
            align-items: center;
            margin: 10px 0;
        }

        .payment-method input[type="radio"] {
            margin-right: 10px;
        }

        .payment-method i {
            font-size: 1.5em;
            margin-right: 15px;
        }

        /* Animation */
        .fade-in {
            animation: fadeIn 0.5s ease-in-out;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        /* Responsive */
        @media (max-width: 600px) {
            .container {
                padding: 15px;
            }
            header h1 {
                font-size: 2em;
            }
        }
    </style>
</head>
<body>

<header>
    <h1>Checkout</h1>
</header>

<div class="container fade-in">
    <!-- Order Summary -->
    <div class="order-summary">
        <h2>Order Summary</h2>
        <table class="table">
            <thead>
                <tr>
                    <th>Item</th>
                    <th>Quantity</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                <%	
                	User user = (User) session.getAttribute("loggedInUser");
                    Map<Integer, CartItem> cart = (Map<Integer, CartItem>) session.getAttribute("cart");
                    double totalAmount = 0.0;

                    if (cart != null && !cart.isEmpty()) {
                        for (CartItem item : cart.values()) {
                            double itemTotal = item.getPrice() * item.getQuantity();
                            totalAmount += itemTotal;
                %>
                <tr>
                    <td><%= item.getName() %></td>
                    <td><%= item.getQuantity() %></td>
                    <td>$<%= String.format("%.2f", itemTotal) %></td>
                </tr>
                <%
                        }
                    } else {
                %>
                <tr>
                    <td colspan="3">Your cart is empty.</td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <h3>Total Amount: $<%= String.format("%.2f", totalAmount) %></h3>
    </div>

    <!-- Back Button -->
    <div class="mb-3">
        <a href="home.jsp" class="btn btn-back"><i class="fas fa-arrow-left"></i> Back to Shopping</a>
    </div>

    <!-- Shipping Information -->
    <div class="form-section">
        <h2>Shipping Information</h2>
        <form action="placeOrder" method="post">
            <div class="row">
                <div class="col-md-6">
                    <label for="firstName">First Name:</label>
                    <input type="text" id="firstName" name="firstName" class="form-control" required>
                </div>
                <div class="col-md-6">
                    <label for="lastName">Last Name:</label>
                    <input type="text" id="lastName" name="lastName" class="form-control" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" class="form-control" value="<%= Security.decryption(user.getEmail()) %>" required>
                </div>
                <div class="col-md-6">
                    <label for="phone">Phone:</label>
                    <input type="tel" id="phone" name="phone" class="form-control" value="<%= Security.decryption(user.getMobile()) %>" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <label for="address">Address:</label>
                    <input type="text" id="address" name="address" class="form-control" required>
                </div>
                <div class="col-md-6">
                    <label for="city">City:</label>
                    <input type="text" id="city" name="city" class="form-control" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <label for="state">State:</label>
                    <input type="text" id="state" name="state" class="form-control" required>
                </div>
                <div class="col-md-6">
                    <label for="zip">Zip Code:</label>
                    <input type="text" id="zip" name="zip" class="form-control" required>
                </div>
            </div>

            <!-- Payment Method -->
            <h2>Payment Method</h2>
            <div class="payment-method">
                <label>
                    <input type="radio" name="paymentMethod" value="creditCard" required> 
                    <!-- <i class="fab fa-cc-visa"></i> --> <img src="https://w7.pngwing.com/pngs/29/61/png-transparent-visa-logo-visa-credit-card-mastercard-logo-visa-cdr-text-rectangle-thumbnail.png" alt="Paytm" width="40" /> Credit Card
                </label>
                <label>
                    <input type="radio" name="paymentMethod" value="debitCard"> 
                    <!-- <i class="fab fa-cc-mastercard"></i> --> <img src="https://w7.pngwing.com/pngs/648/903/png-transparent-mastercard-logo-logo-payment-visa-mastercard-paypal-mastercard-icon-text-service-mobile-payment-thumbnail.png" alt="Paytm" width="40" /> Debit Card
                </label>
                <label>
                    <input type="radio" name="paymentMethod" value="paypal"> 
                    <!-- <i class="fab fa-paypal"></i> --> <img src="https://w7.pngwing.com/pngs/201/983/png-transparent-paypal-android-aptoide-paypal-thumbnail.png" alt="Paytm" width="40" /> PayPal
                </label>
                <label>
                    <input type="radio" name="paymentMethod" value="upi"> 
                    <img src="https://uxwing.com/wp-content/themes/uxwing/download/brands-and-social-media/upi-icon.png" alt="UPI" width="40" /> UPI (Google Pay, PhonePe, Paytm)
                </label>
                <label>
                    <input type="radio" name="paymentMethod" value="razorpay"> 
                    <img src="https://w7.pngwing.com/pngs/586/552/png-transparent-razorpay-hd-logo-thumbnail.png" alt="Razorpay" width="40" />   Razorpay
                </label>
                <label>
                    <input type="radio" name="paymentMethod" value="paytm"> 
                    <img src="https://w7.pngwing.com/pngs/110/280/png-transparent-paytm-standalone-hd-logo-thumbnail.png" alt="Paytm" width="40" />   Paytm
                </label>
            </div>

            <input type="hidden" name="totalAmount" value="<%= String.format("%.2f", totalAmount) %>">
            <button type="submit" class="btn btn-primary btn-lg">Place Order</button>
        </form>
    </div>
</div>

<!-- Bootstrap 5 JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
