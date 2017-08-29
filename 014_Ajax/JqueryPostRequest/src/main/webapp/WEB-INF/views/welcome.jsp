<%@ page session="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<spring:url value="/resources/css/bootstrap.min.css"
	var="bootstrapCss" />
<spring:url value="/resources/js/jquery.1.10.2.min.js"
	var="jqueryJs" />
<spring:url value="/resources/js/script.js"
	var="scriptJs" />
	

<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring MVC 4 + Ajax Hello World</title>

<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>
<body>
	<!-- NAVIGATION -->
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Spring 4 MVC Ajax Hello World</a>
			</div>
		</div>
	</nav>
	
	<!-- CONTAINER -->
	<div class="container" style="min-height: 500px">

		<div class="starter-template">
			<h1>Search Form</h1>
			<br>
			<div id="feedback"></div>

			<form class="form-horizontal" id="search-form">
				<div class="form-group form-group-lg">
					<label class="col-sm-2 control-label">Username</label>
					<div class="col-sm-10">
						<input type=text class="form-control" id="username">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" id="bth-search"
							class="btn btn-primary btn-lg">Search</button>
					</div>
				</div>
			</form>

		</div>

	</div>
	
	<!-- FOOTER -->
	<div class="container">
		<footer>
			<p>&copy; <a href="http://www.mkyong.com">Mkyong.com</a> 2015</p>
		</footer>
	</div>
	
	<script src="${jqueryJs}"></script>
	<script src="${scriptJs}"></script>
	
</body>
</html>