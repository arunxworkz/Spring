<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Scholarship</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa; /* Light grey background color */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .form-container {
            background-color: #ffffff; /* White background for the form */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 60%; /* Adjust the width as needed */
            max-width: 800px; /* Optional: set a maximum width */
        }
        h1 {
            color: #dc3545; /* Bootstrap's red color */
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Scholarship Form</h1>
        <form class="form-horizontal" action="scholarship" method="post">
            <div class="form-group">
                <label class="control-label col-sm-2" for="first-name">First Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="first-name" placeholder="Enter first name" name="firstName">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="last-name">Last Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="last-name" placeholder="Enter last name" name="lastName">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="email">Email:</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="phone">Phone Number:</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" id="phone" placeholder="Enter phone number" name="phoneNo">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="otp">OTP:</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" id="otp" placeholder="Enter otp" name="otp">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="password">Password:</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <div class="checkbox">
                        <label><input type="checkbox"> Remember me</label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>
