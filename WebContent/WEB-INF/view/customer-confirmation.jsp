<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
	</head>
	<body>
		<h2>Customer Confirmation</h2>
		<p>The Customer is Confirmed: ${customer.firstName} ${customer.lastName}</p>
		<p>Free Passes: ${customer.freePasses}</p>
		<p>Postal Code: ${customer.postalCode}</p>
		
	</body>
</html>