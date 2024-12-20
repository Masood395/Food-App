<!-- <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Payment Confirmation</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <style>
        /* General Styling */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background: linear-gradient(135deg, #84fab0, #8fd3f4);
            font-family: 'Roboto', sans-serif;
            animation: fadeIn 1s ease-in-out;
        }

        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }

        /* Confirmation Container */
        .confirmation-container {
            background: #ffffff;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.2);
            text-align: center;
            max-width: 500px;
            width: 90%;
            position: relative;
            animation: slideIn 0.8s ease-out;
        }

        @keyframes slideIn {
            from { transform: scale(0.9); opacity: 0; }
            to { transform: scale(1); opacity: 1; }
        }

        /* Success Icon */
        .success-icon {
            width: 80px;
            height: 80px;
            margin: 0 auto 20px;
            background: radial-gradient(circle, #4CAF50 60%, #388E3C);
            border-radius: 50%;
            display: flex;
            justify-content: center;
            align-items: center;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            animation: pop 0.8s ease-out;
        }

        @keyframes pop {
            0% { transform: scale(0); }
            70% { transform: scale(1.2); }
            100% { transform: scale(1); }
        }

        .success-icon svg {
            width: 50px;
            height: 50px;
            stroke: #ffffff;
        }

        /* Confirmation Message */
        .confirmation-container h2 {
            color: #28a745;
            font-size: 2.5em;
            margin-bottom: 10px;
            animation: fadeInText 0.6s ease-in-out;
        }

        @keyframes fadeInText {
            from { opacity: 0; transform: translateY(10px); }
            to { opacity: 1; transform: translateY(0); }
        }

        .confirmation-container p {
            font-size: 1.2em;
            margin: 20px 0;
            color: #555;
        }

        /* Transaction Summary */
        .transaction-summary {
            background: #f9f9f9;
            border-radius: 10px;
            padding: 20px;
            margin: 20px 0;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            text-align: left;
            animation: fadeInText 0.8s ease-in-out;
        }

        .transaction-summary h3 {
            margin: 0 0 10px;
            color: #007bff;
            font-size: 1.5em;
        }

        .transaction-summary p {
            margin: 5px 0;
            font-size: 1em;
        }

        /* Back Button */
        .confirmation-container .back-button {
            background: linear-gradient(to right, #007bff, #0056b3);
            color: white;
            padding: 12px 25px;
            border: none;
            border-radius: 50px;
            cursor: pointer;
            text-decoration: none;
            font-size: 1.1em;
            transition: transform 0.3s ease, background 0.3s ease;
            display: inline-block;
        }

        .confirmation-container .back-button:hover {
            background: linear-gradient(to right, #0056b3, #004494);
            transform: scale(1.05);
        }

        /* Responsive Design */
        @media (max-width: 600px) {
            .confirmation-container {
                padding: 20px;
            }

            .confirmation-container h2 {
                font-size: 2em;
            }

            .transaction-summary h3 {
                font-size: 1.3em;
            }
        }
    </style>
</head>
<body>

<div class="confirmation-container">
    Success Icon
    <div class="success-icon">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="none" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
            <path d="M20 6L9 17l-5-5"></path>
        </svg>
    </div>

    <h2>Payment Successful!</h2>
    <p>Thank you for your purchase. Your payment has been processed successfully.</p>

    <div class="transaction-summary">
        <h3>Transaction Summary</h3>
        <p><strong>Transaction ID:</strong> 123456789</p>
        <p><strong>Amount:</strong> ₹1,499.00</p>
        <p><strong>Date:</strong> November 19, 2024</p>
        <p><strong>Payment Method:</strong> UPI</p>
    </div>

    <a href="javascript:history.back();" class="back-button">Back to Previous Page</a>
</div>

</body>
</html>
 -->
 
 
 
 
 
 
 
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Payment Confirmation</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <style>
        /* General Styling */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background: linear-gradient(135deg, #84fab0, #8fd3f4);
            font-family: 'Roboto', sans-serif;
            animation: fadeIn 1s ease-in-out;
        }

        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }

        /* Confirmation Container */
        .confirmation-container {
            background: #ffffff;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.2);
            text-align: center;
            max-width: 500px;
            width: 90%;
            position: relative;
            animation: slideIn 0.8s ease-out;
        }

        @keyframes slideIn {
            from { transform: scale(0.9); opacity: 0; }
            to { transform: scale(1); opacity: 1; }
        }

        /* Success Icon */
        .success-icon {
            width: 80px;
            height: 80px;
            margin: 0 auto 20px;
            background: radial-gradient(circle, #4CAF50 60%, #388E3C);
            border-radius: 50%;
            display: flex;
            justify-content: center;
            align-items: center;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            animation: pop 0.8s ease-out;
        }

        @keyframes pop {
            0% { transform: scale(0); }
            70% { transform: scale(1.2); }
            100% { transform: scale(1); }
        }

        .success-icon svg {
            width: 50px;
            height: 50px;
            stroke: #ffffff;
        }

        /* Confirmation Message */
        .confirmation-container h2 {
            color: #28a745;
            font-size: 2.5em;
            margin-bottom: 10px;
            animation: fadeInText 0.6s ease-in-out;
        }

        @keyframes fadeInText {
            from { opacity: 0; transform: translateY(10px); }
            to { opacity: 1; transform: translateY(0); }
        }

        .confirmation-container p {
            font-size: 1.2em;
            margin: 20px 0;
            color: #555;
        }

        /* Back Button */
        .confirmation-container .back-button {
            background: linear-gradient(to right, #007bff, #0056b3);
            color: white;
            padding: 12px 25px;
            border: none;
            border-radius: 50px;
            cursor: pointer;
            text-decoration: none;
            font-size: 1.1em;
            transition: transform 0.3s ease, background 0.3s ease;
            display: inline-block;
        }

        .confirmation-container .back-button:hover {
            background: linear-gradient(to right, #0056b3, #004494);
            transform: scale(1.05);
        }

        /* Responsive Design */
        @media (max-width: 600px) {
            .confirmation-container {
                padding: 20px;
            }

            .confirmation-container h2 {
                font-size: 2em;
            }
        }
    </style>
</head>
<body>

<div class="confirmation-container">
    <!-- Success Icon -->
    <div class="success-icon">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="none" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
            <path d="M20 6L9 17l-5-5"></path>
        </svg>
    </div>

    <h2>Payment Successful!</h2>
    <p>Thank you for your purchase. Your payment has been processed successfully.</p>

    <a href="home.jsp" class="back-button">Back to Home</a>
</div>

</body>
</html>
 