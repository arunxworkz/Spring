<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Xworkz Login</title>
    <link rel="icon" href="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png">
    <style>
        /* Overall page styling */
        body {
            background-image: url('https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?cs=srgb&dl=pexels-david-bartus-674010.jpg&fm=jpg');
            background-size: cover;
            background-position: center;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            position: relative;
        }

        /* Overlay for better contrast */
        body::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, 0.6);
            z-index: -1;
        }

        /* Form container styling */
        .form-container {
            background-color: #ffffff;
            border-radius: 15px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            padding: 30px 20px;
            width: 280px;
            animation: fadeIn 1s ease-in-out;
        }

        /* Keyframes for fade-in animation */
        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(-20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        /* Form input styling */
        input[type="text"],
        input[type="password"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 14px;
        }

        /* Submit button specific styling */
        input[type="submit"] {
            background-color: #4caf50;
            color: white;
            font-weight: bold;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.2s ease;
            font-size: 14px; /* Slightly smaller font size */
            padding: 8px 10px; /* Reduced button padding */
        }

        input[type="submit"]:hover {
            background-color: #45a049;
            transform: scale(1.05); /* Slight scaling effect */
        }

        /* Message styling */
        p {
            color: red;
            font-size: 12px;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <form action="logIn" method="post">
            <input type="text" placeholder="Enter your email" name="email" />
            <input type="password" placeholder="Enter your password" name="password" />
            <input type="submit" value="Submit" />
            <p>${name}</p>
        </form>
    </div>
</body>
</html>
