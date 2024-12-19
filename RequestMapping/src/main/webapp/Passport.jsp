<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passport Application Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }
        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input,
        .form-group select {
            width: calc(100% - 10px);
            padding: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        .form-group input[type="radio"] {
            width: auto;
            margin-right: 5px;
        }
        .form-group .hint-answer,
        .form-group .captcha {
            width: 100%;
            display: flex;
            align-items: center;
        }
        .form-group .captcha input {
            flex: 1;
        }
        .form-group .captcha img {
            margin-left: 10px;
        }
        .form-group .captcha button {
            background: none;
            border: none;
            cursor: pointer;
        }
        .buttons {
            display: flex;
            justify-content: space-between;
        }
        .buttons button {
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 16px;
        }
        .buttons .register {
            background-color: #007bff;
            color: white;
        }
        .buttons .clear {
            background-color: #dc3545;
            color: white;
        }
        .heading{

        }
    </style>
</head>
<body>

    <div class="container">
        <form action="passport" method="post">

            <div class="form-group">
                <label>Register to apply at *</label>
                <label><input type="radio" name="applyAt" value="CPV Delhi"> CPV Delhi</label>
                <label><input type="radio" name="applyAt" value="Passport Office" checked> Passport Office</label>
            </div>
            <div class="form-group">
                <label for="passportOffice">Passport Office *</label>
                <select id="passportOffice" name="passportOffice">
                    <option value="">---- Select -----</option>
                    <!-- Add options here -->
                </select>
            </div>
            <div class="form-group">
                <label for="givenName">Given Name (Max 45 Characters) *</label>
                <input type="text" id="givenName" name="givenName">
            </div>
            <div class="form-group">
                <label for="surname">Surname (Max 45 Characters) *</label>
                <input type="text" id="surname" name="surname">
            </div>
            <div class="form-group">
                <label for="dob">Date of Birth (DD/MM/YYYY) *</label>
                <input type="text" id="dob" name="dob">
            </div>
            <div class="form-group">
                <label for="email">E-mail Id (Max 35 Characters) *</label>
                <input type="email" id="email" name="email">
            </div>
            <div class="form-group">
                <label>Do you want your Login Id to be same as E-mail Id?</label>
                <label><input type="radio" name="sameEmailId" value="yes"> Yes</label>
                <label><input type="radio" name="sameEmailId" value="no" checked> No</label>
            </div>
            <div class="form-group">
                <label for="loginId">Login Id *</label>
                <input type="text" id="loginId" name="loginId">
                <a href="#" onclick="checkAvailability()">Check Availability</a>
            </div>
            <div class="form-group">
                <label for="password">Password *</label>
                <input type="password" id="password" name="password">
                <a href="#" onclick="passwordPolicy()">Password Policy</a>
            </div>
            <div class="form-group">
                <label for="confirmPassword">Confirm Password *</label>
                <input type="password" id="confirmPassword" name="confirmPassword">
            </div>
            <div class="form-group">
                <label for="hintQuestion">Hint Question *</label>
                <select id="hintQuestion" name="hintQuestion">
                    <option value="">---- Select -----</option>
                    <!-- Add options here -->
                </select>
            </div>
            <div class="form-group">
                <label for="hintAnswer">Hint Answer *</label>
                <input type="text" id="hintAnswer" name="hintAnswer">
            </div>

            <div class="buttons">
                <button type="submit" class="register">Register</button>
                <button type="reset" class="clear">Clear</button>
            </div>
        </form>
    </div>
</body>
</html>
