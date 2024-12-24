    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Xworkz SignUp</title>
    <link rel="icon" href="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?cs=srgb&dl=pexels-david-bartus-674010.jpg&fm=jpg');
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            position: relative;
            font-family: 'Arial', sans-serif;
            margin: 0;
        }
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
        .form-container {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 20px;
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            width: 100%;
            max-width: 400px;
            text-align: center;
            animation: fadeInScale 1s ease-in-out;
        }
        @keyframes fadeInScale {
            0% {
                opacity: 0;
                transform: scale(0.9);
            }
            100% {
                opacity: 1;
                transform: scale(1);
            }
        }
        h3 {
            color: #333;
            font-weight: bold;
            margin-bottom: 20px;
        }
        .input-group {
            position: relative;
        }
        .input-group i {
            position: absolute;
            left: 10px;
            top: 50%;
            transform: translateY(-50%);
            color: #888;
        }
        .form-control {
            padding-left: 35px;
            border-radius: 5px;
            padding: 10px;
        }
        .form-control:focus {
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
        }
        span {
            display: block;
            font-size: 12px;
            color: red;
            margin-top: 5px;
        }
        .btn {
            background-color: #007bff;
            color: #fff;
            font-size: 16px;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            transition: transform 0.3s ease, background-color 0.3s ease;
        }
        .btn:hover {
            background-color: #0056b3;
            transform: scale(1.05);
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h3>Register</h3>
        <form method="POST" action="register">
            <div class="mb-3 input-group">
                <span class="input-group-text"><i class="fa-solid fa-user"></i></span>
                <input type="text" class="form-control" id="name" name="name" placeholder="Enter your name" required onchange="checkUserName()">
                <span id="displayName"></span>
            </div>
            <div class="mb-3 input-group">
                <span class="input-group-text"><i class="fa-solid fa-envelope"></i></span>
                <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email" required onchange="checkEmail()">
                <span id="displayEmail"></span>
            </div>
            <div class="mb-3 input-group">
                <span class="input-group-text"><i class="fa-solid fa-envelope-open"></i></span>
                <input type="email" class="form-control" id="alEmail" name="alternateEmail" placeholder="Enter the alternate email" required onchange="duplicate()">
                <span id="duplicateEmail"></span>
            </div>
            <div class="mb-3 input-group">
                <span class="input-group-text"><i class="fa-solid fa-phone"></i></span>
                <input type="tel" class="form-control" id="phNo" name="phNo" placeholder="Enter the phone number" required onchange="checkPhno()">
                <span id="displayPhno"></span>
            </div>
            <div class="mb-3 input-group">
                <span class="input-group-text"><i class="fa-solid fa-phone-flip"></i></span>
                <input type="tel" class="form-control" id="alPhNo" name="alPhNo" placeholder="Enter the alternate phone number" required>
            </div>
            <div class="mb-3 input-group">
                <span class="input-group-text"><i class="fa-solid fa-location-dot"></i></span>
                <input type="text" class="form-control" id="location" name="location" placeholder="Enter the location" required>
            </div>
            <div class="text-center">
                <button type="submit" class="btn">Register</button>
            </div>
        </form>

    </div>

    <script>

            function checkUserName(){
                var checkUserName = document.getElementById('name');
                var userNameValue = checkUserName.value;
                var xhttp = new XMLHttpRequest();
                xhttp.open("GET", "http://localhost:8080/Xworkz_CommonModule_Arun/userNameValue/"+userNameValue)
                xhttp.send()
                xhttp.onload = function(){
                    console.log(this.responseText)
                    document.getElementById("displayName").innerHTML = this.responseText;
                }
            }

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

            function checkPhno(){
                var checkPhno = document.getElementById('phNo');
                var phNovalue = checkPhno.value;
                console.log(checkPhno)
                var xhttp = new XMLHttpRequest();
                xhttp.open("GET", "http://localhost:8080/Xworkz_CommonModule_Arun/chaeckPhno"+phNovalue);
                xhhtp.send();
                xhttp.onload = function(){
                    console.log(this.responseText)
                    document.getElementById("displayPhno").innerHTML = this.responseText;
                }
            }


            function duplicate(){
                var email = document.getElementById("email").value;
                var alEmail = document.getElementById("alEmail").value;

                if(email === alEmail){
                    duplicateEmail.textContent = "Email shoud be different";
                }else{
                    duplicateEmail.textContent = "";
                }
            }

    </script>
</body>
</html>
