<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Xworkz Login</title>
    <link rel = "icon" href = "https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png">
    <style>
        /* Overall page styling */
        body {
            background-image: url('https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?cs=srgb&dl=pexels-david-bartus-674010.jpg&fm=jpg');
            font-family: Arial, sans-serif;
            back /* Gradient background */
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        /* Form container styling */
        .form-container {
            background-color: #ffffff; /* White form background */
            border-radius: 15px; /* Rounded corners */
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2); /* Subtle shadow for depth */
            padding: 30px 20px; /* Padding inside the form */
            width: 300px; /* Form width */
        }

        /* Form input styling */
        input[type="text"],
        input[type="password"],
        input[type="submit"] {
            width: 100%;
            padding: 10px; /* Add padding inside inputs */
            margin: 10px 0; /* Space between inputs */
            border: 1px solid #ccc; /* Light border for inputs */
            border-radius: 5px; /* Rounded corners */
            box-sizing: border-box; /* Include padding in width calculation */
            font-size: 14px; /* Font size */
        }

        input[type="submit"] {
            background-color: #4caf50; /* Green button */
            color: white; /* White text */
            font-weight: bold; /* Bold text for button */
            border: none; /* Remove border */
            cursor: pointer; /* Pointer cursor on hover */
            transition: background-color 0.3s; /* Smooth hover effect */
        }

        input[type="submit"]:hover {
            background-color: #45a049; /* Darker green on hover */
        }

        /* Message styling */
        p {
            color: red; /* Error or status message in red */
            font-size: 12px; /* Smaller font size */
            text-align: center; /* Centered message */
        }
    </style>
</head>
<body>
    <div class="form-container">
        <form action="getNameByEmailAndPassword" method="post">
            <input type="text" placeholder="Enter your email" name="email" />
            <input type="text" placeholder="Enter your password" name="password" />
            <input type="submit" value="Submit" />
            <p style = "color: red">${name}</p>
        </form>
    </div>
</body>
</html>
