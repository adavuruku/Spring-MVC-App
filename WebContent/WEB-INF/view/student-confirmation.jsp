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
		<h2>Student Confirmation</h2>
		<p>The Student is Confirmed: ${student.firstName} ${student.lastName}</p>
		<p>Country : ${student.country}</p>
		
		<p>Favourite Language : ${student.favoriteLanguage}</p>
		
		<p>Favourite Operating SYstem : </p>
		<ul>
			<c:forEach var="temp" items ="${student.operatingSystem}">
				<li>${temp}</li>
			</c:forEach>
		</ul>
	</body>
</html>