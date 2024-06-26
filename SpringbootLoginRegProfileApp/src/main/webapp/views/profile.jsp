<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>
	<div class="body_div">
	<br/>
	<span class="body_text_title" style="color: teal;" >Welcome: ${session_name}</span>
	<h3>Email: ${session_email}</h3>
	<h3>gender: ${session_gender}</h3>
	<h3>City: ${session_city}</h3>

	</div>
</body>
</html>