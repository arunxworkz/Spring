<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Password-Reset</title>
    <style>

        body {
            background-color: #f8f9fa;
            font-family: -apple-system, sans-serif;
        }

        .signin-container {
            margin-top: 50px;
        }

        .form-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .form-title {
            text-align: center;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <header class="bg-dark py-3">
        <div class="container d-flex justify-content-left">
            <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Xworkz Logo" height="50">
        </div>
    </header>
    <div class="container mt-5">
        <h3 class="text-center">Update Your Password</h3>
        <form action="updatePassword" method="post">
             <div class="mb-3">
                            <label  class="form-label">Email</label>
                            <input type="text" class="form-control" id="email" name="email" value="${email}" placeholder="Enter your Email" onChange = "checkEmail()">
                            <span id= "displayEmail"></span>
             </div>
            <div class="mb-3">
                <label for="newPassword" class="form-label">New Password</label>
                <input type="password" class="form-control" id="newPassword" name="newPassword" placeholder="Enter your New password" required>
            </div>
            <div class="mb-3">
                <label for="confirmPassword" class="form-label">Confirm Password</label>
                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="" required>
            </div>
            <button type="submit" class="btn btn-success w-100">Update Password</button>
        </form>
    </div>

    <script>
                    function checkEmail(){
                            var checkEmail = document.getElementById('email').value;
                            var emailValue = checkEmail.value;
                            console.log(checkEmail)
                            var xhttp = new XMLHttpRequest();
                            xhttp.open("GET",  "http://localhost:8080/Xworkz_CommonModule_Arun/checkEmail/"+checkEmail);
                            xhttp.send()

                           xhttp.onload = function(){
                                   console.log(this.responseText)
                                   document.getElementById("displayEmail").innerHTML = this.responseText;
                                    }
                        }
    </script>

</body>

</html>
