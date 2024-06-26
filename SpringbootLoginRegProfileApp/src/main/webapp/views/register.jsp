<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Register</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css" />
	</head>
	<body>
	<div class="body_div">

	<h3 class="body_text_title" style="color:maroon;">Registration Form</h3>
		
		<form action="regForm" method="post">
			
			<label>Name:</label> <input type="text" name="name1" /><br/><br/>
			<label>Email:</label> <input type="email" name="email1" /><br/><br/>
			<label>Password:</label><input type="password" name="pass1" /><br/><br/>
			<label>Gender:</label><input type="radio" name="gender1" value="Male" />Male<input type="radio" name="gender1" value="Female"/>Female <br/><br/>
			<label>City:</label><select name="city1">
				<option>Select City</option>
				<option value="Agra">Agra</option>
				<option value="Delhi">Delhi</option>
				<option value="Chennai">Chennai</option>
				<option value="Mumbai">Mumbai</option>
				
			
			</select><br/><br/>
			<input type="submit" value="Regsiter" />

		</form>
		
	
	</div>
		
	</body>
</html>


		
		
	
