<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
	<h1>Add New Customer</h1>
	<form:form action="add" method="post" commandName="customer">
		<table>
			<tr>
				<td><form:label path="firstName">Firstname</form:label></td>
				<td><form:input path="firstName" /> </td>
			</tr>
			<tr>
				<td><form:label path="lastName">Lastname</form:label></td>
				<td><form:input path="lastName" /> </td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Customer"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>