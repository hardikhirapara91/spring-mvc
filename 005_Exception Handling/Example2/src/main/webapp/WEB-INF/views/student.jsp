<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Spring MVC Internationalization Localization Example</title>
	<link rel="stylesheet" href="<spring:theme code='stylesheet'/>" type="text/css">
</head>
<body>
	<form:form method="POST" action="add" modelAttribute="student">
		<table>
			<tr>
				<td><form:label path="rlno">RollNo</form:label></td>
				<td><form:input path="rlno" /></td>
			</tr>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>