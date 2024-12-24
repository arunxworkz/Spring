<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Xworkz.com</title>
  <link rel="icon" href="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <style>
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
    body::before {
      content: '';
      position: absolute;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      background: rgba(0, 0, 0, 0.6); /* Dark overlay */
      z-index: -1;
    }
    .container {
      background: rgba(255, 255, 255, 0.8); /* Semi-transparent white */
      border-radius: 15px;
      padding: 2rem;
      text-align: center;
      box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.2);
    }
    .logo-img {
      width: 160px;
      height: auto;
    }
    .btn {
      font-size: 1rem;
      padding: 0.7rem 2rem;
      transition: transform 0.3s ease, background-color 0.3s ease;
    }
    .btn:hover {
      transform: scale(1.05);
      background-color: #004085; /* Darker blue */
    }
    .gap-2 {
      gap: 1rem;
    }
    h1 {
      font-size: 2.5rem;
      color: white;
      text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7);
      margin-bottom: 2rem;
      animation: fadeInMove 2s ease-in-out;
    }
    @keyframes fadeInMove {
      0% {
        opacity: 0;
        transform: translateY(-50px);
      }
      100% {
        opacity: 1;
        transform: translateY(0);
      }
    }
  </style>
</head>
<body>
  <div class="container">
    <!-- Title Section -->
    <h1>Welcome to Xworkz</h1>
    <!-- Logo Section -->
    <div class="mb-4">
      <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Xworkz Logo" class="logo-img">
    </div>
    <!-- Buttons -->
    <div class="d-flex justify-content-center gap-2">
      <button class="btn btn-primary rounded-pill" type="button" onClick="signUp()">Sign Up</button>
      <button class="btn btn-primary rounded-pill" type="button" onClick="login()">Login</button>
    </div>
  </div>

  <script>
    function signUp() {
      window.location.href = "Signup.jsp";
    }
    function login() {
      window.location.href = "Signin.jsp";
    }

    function getData(){
         window.location.href = "Details.jsp";
    }
  </script>
</body>
</html>
