<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Flight</title>
</head>
<body>
	<h1>Register Flight</h1>
	<form action="saveflight">
		<pre>
Flight Number:<input type="text" name="flightNumber" />
Operating Airlines:<input type="text" name="operatingAirlines" />
Departure City:<input type="text" name="departureCity" />
Arrival City:<input type="text" name="arrivalCity" />
DateOf Departure:<input type="text" name="dateOfDeparture" />
Estimated DepartureTime:<input type="text" name="estimatedDepartureTime" />
<input type="submit" value="login" />
</pre>
	</form>
</body>
</head>
</html>