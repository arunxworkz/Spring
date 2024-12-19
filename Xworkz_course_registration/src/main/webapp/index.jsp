<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Xworkz.com</title>
  <link rel = "icon" href = "https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<style>
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
                gap:2rem;
            }
</style>
<body>

  <!-- Logo Section -->
  <div class="d-flex align-items-center ms-3">
    <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" width="140" height="70" alt="Xworkz" class="logo-img">
  </div>

  <!-- Login Button -->
  <ul class="nav nav-pills me-3" style = "gap: 1rem">
    <li class="nav-item">
      <button class="btn btn-primary rounded-pill px-3" type="submit" onClick = "signUp()">Sign Up</button>
    </li>
     <li class="nav-item">
       <button class="btn btn-primary rounded-pill px-3" type="submit" onClick = "login()">Login</button>
     </li>
  </ul>

<script>
    function signUp(){
        window.location.href = "signup.jsp";
    }

    function login(){
        window.location.href = "login.jsp";
    }
</script>

</body>
</html>
