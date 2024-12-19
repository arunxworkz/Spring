<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Xworkz SignUp</title>
    <link rel = "icon" href = "https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>

        body{
            background-image: url('https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?cs=srgb&dl=pexels-david-bartus-674010.jpg&fm=jpg');
        }
        .form-container {
          border: 1px solid #ddd; /* Light border */
          border-radius: 10px; /* Rounded corners */
          box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow for shading */
          padding: 20px; /* Space inside the form */
          background-color: #f9f9f9; /* Light background color */
          max-width: 500px; /* Limit form width */
          margin: 20px auto; /* Center form on the page */
        }
    </style>
</head>
<body>
<div class="form-container">
    <h3 class="text-center mb-4">Register</h3>
    <form action = "getData" method = "post">
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name = "name"  placeholder="Enter your name">
            <span style = "font-size:12px ;color:red">Enter the name of length 10</span>
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Age</label>
            <input type="number" class="form-control" id="age" name = "age" placeholder="Enter your age">
            <span style = "font-size:12px ;color:red">Enter the age</span>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" class="form-control" id="email" name = "email" placeholder="Enter your email">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password" name = "password" placeholder="Enter your password">
            <span style = "font-size:12px ;color:red">Password: [@#*!%&*][0-9][a-z][A-Z]</span>
        </div>
        <div class="mb-3">
            <label for="confirmPassword" class="form-label">Confirm Password</label>
            <input type="password" class="form-control" id="confirmPassword" name = "confirmPassword" placeholder="Confirm your password">
        </div>
        <div class="mb-3">
            <label for="phno" class="form-label">Phone Number</label>
            <input type="tel" class="form-control" id="phno" name = "phno" placeholder="Enter your phone number">
            <span style = "font-size:12px ;color:red">Mobile: starst with 9</span>
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-primary" onclick = "submit">Register</button>
        </div>
    </form>
</div>
</body>
</html>