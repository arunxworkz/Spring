<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Back User - Birthday Blaster</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #1a1a1a;
            color: #ffffff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            overflow: hidden;
        }

        .success-container {
            text-align: center;
            animation: fadeIn 2s ease-in-out;
        }

        .success-message {
            font-size: 2.5rem;
            color: #4caf50;
            text-shadow: 0 0 10px #4caf50;
            animation: pulse 1.5s infinite;
        }

        .checkmark {
            font-size: 4rem;
            color: #4caf50;
            margin-bottom: 1rem;
            animation: scaleUp 1s ease-in-out;
        }

        .back-link {
            display: inline-block;
            margin-top: 1.5rem;
            padding: 0.8rem 1.5rem;
            font-size: 1rem;
            color: #1a1a1a;
            background-color: #ffffff;
            border-radius: 5px;
            text-decoration: none;
            transition: transform 0.3s, box-shadow 0.3s;
        }

        .back-link:hover {
            transform: scale(1.1);
            box-shadow: 0 4px 15px rgba(255, 255, 255, 0.3);
        }

        @keyframes fadeIn {
            0% { opacity: 0; transform: translateY(-20px); }
            100% { opacity: 1; transform: translateY(0); }
        }

        @keyframes pulse {
            0%, 100% { text-shadow: 0 0 10px #4caf50; }
            50% { text-shadow: 0 0 20px #4caf50; }
        }

        @keyframes scaleUp {
            0% { transform: scale(0.5); opacity: 0; }
            100% { transform: scale(1); opacity: 1; }
        }
    </style>
</head>
<body>
    <div class="success-container">
        <div class="checkmark">&#10003;</div>
        <p class="success-message">Welcome Back, User! 🎉</p>
    </div>
</body>
</html>
