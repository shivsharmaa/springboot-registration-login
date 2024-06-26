<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h2 style="color: red">${model_message} </h2>
	<jsp:include page="${model_pagename}.jsp" />
</body>
</html>