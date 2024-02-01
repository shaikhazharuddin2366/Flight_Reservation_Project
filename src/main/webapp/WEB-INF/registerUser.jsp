<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>User Register</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f1f1f1;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .container {
      background-color: #fff;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
      width: 400px;
    }

    h1 {
      color: #3498db;
      text-align: center;
    }

    form {
      display: flex;
      flex-direction: column;
    }

    label {
      margin-bottom: 5px;
    }

    input[type="text"],
    input[type="password"] {
      padding: 10px;
      margin-bottom: 15px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }

    input[type="submit"] {
      background-color: #3498db;
      color: #fff;
      padding: 10px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #2184d9;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>User Register</h1>
    <form action="registerUser">
      <label for="firstName">First Name:</label>
      <input type="text" name="firstName" id="firstName" required/>

      <label for="lastName">Last Name:</label>
      <input type="text" name="lastName" id="lastName" required/>

      <label for="email">User Email:</label>
      <input type="text" name="email" id="email" required/>

      <label for="password">Password:</label>
      <input type="password" name="password" id="password" required/>

      <label for="confirmpassword">Confirm Password:</label>
      <input type="password" name="confirmpassword" id="confirmpassword" required/>

      <input type="submit" value="Register" />
    </form>
  </div>
</body>
</html>
