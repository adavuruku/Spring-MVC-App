<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    <meta name="description" content="">
	    <meta name="author" content="Faisal Yahya">
	    <meta name="generator" content="Jekyll v4.1.1">
	    <title>Spring MVC App</title>
	    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
	<style>
		:error{color:red;}
	</style>
	</head>
	<body>
		<h2>Customer Registration Form</h2>
		<i>Fill the Form. Asterick (*) mean is required</i>
		<form:form action="processForm" modelAttribute="customer">
			First Name : <form:input path="firstName"/>
			<br/><br/>
			Last Name (*) : <form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"/>
			<br/><br/>
			Free Pays (*) : <form:input path="freePasses"/>
			<form:errors path="freePasses" cssClass="error"/>
			<br/><br/>
			Postal Code (*) : <form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error"/>
			<br/><br/>
			<input type="submit" class="btn btn-primary" value="Submit"/>
		</form:form>
		
	</body>
</html>