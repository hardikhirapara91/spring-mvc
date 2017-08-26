<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Spring MVC Internationalization Localization Example</title>
</head>
<body>
	
	<div>
		<a href="?lang=en">English</a>
		|
		<a href="?lang=nl">Dutch</a>
	</div>
	<br>
	<div><spring:message code="hello.message"/></div>
</body>
</html>