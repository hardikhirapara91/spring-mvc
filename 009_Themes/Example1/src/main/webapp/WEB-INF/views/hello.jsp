<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Spring MVC Internationalization Localization Example</title>
	<link rel="stylesheet" href="<spring:theme code='stylesheet'/>" type="text/css">
</head>
<body>
	
	<div>
		<span style="float:left">
			<a href="?lang=en">English</a>
			|
			<a href="?lang=nl">Dutch</a>
		</span>
		<span style="float:right">
			<a href="?theme=green">Green</a>
			|
			<a href="?theme=blue">Blue</a>
		</span>
	</div>
	<br>
	<div class="message"><spring:message code="hello.message"/></div>
</body>
</html>