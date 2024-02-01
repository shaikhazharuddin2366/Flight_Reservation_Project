<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <style>
    body {
      padding:20px 0;
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      color: #333;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }
    
    form {
      background-color: #fff;
      border-radius: 8px;
      padding: 20px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
      width:400px;
      max-width:100%;
    }

	form label{
	
		display:block;
	
	}
	
	form input{
	
		width:100%;
	
	}


    h2 {
      color: #007bff; /* Blue color */
    }

    input[type="text"] {
      padding: 5px;
      margin-bottom: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing:border-box;
      height:35px;
    }

    input[type="submit"] {
      padding: 10px 20px;
      background-color: #007bff; /* Blue color */
      color: #fff;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <form action="completeReservation">
    <h2>Complete Reservation</h2>
    Airline: ${flight.operatingAirlines}
    <br /> Departure City: ${flight.departureCity}
    <br /> Arrival City: ${flight.arrivalCity}
    <br />

    <h2>Passenger Details:</h2>
   <label> First Name:</label><input type="text" name="passengerFirstName" />
  <label>  Last Name:</label><input type="text" name="passengerLastName" />
    <label>Email:</label><input type="text" name="passengerEmail" />
   <label> Phone:</label><input type="text" name="passengerPhone" />

    <h2>Card Details:</h2>
    <label>Name on the card:</label><input type="text" name="nameOnTheCard" />
    <label>Card No:</label><input type="text" name="cardNumber" />
    <label>Expiry Date:</label><input type="text" name="expirationDate" />
   <label> Three Digit Sec Code:</label><input type="text" name="securityCode" />

    <input type="hidden" name="flightId" value="${flight.id}" />
    <input type="submit" value="Confirm" />
  </form>
</body>
</html>
