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
	</head>
	<body>
		<h2>Student Registration Form</h2>
		<form:form action="processForm" modelAttribute="student">
			First Name : <form:input path="firstName"/>
			<br/><br/>
			Last Name : <form:input path="lastName"/>
			<br/><br/>
			Country : <form:select path="country">
			
			<form:options items="${student.countryList}"/>
			
			
				<!-- 
					this if properties is use
					
					<form:options items="${theCountryOptions}" />
					
					// using Java Class
					use this method if using the country list in
					the Student class
					
					<form:options items="${student.countryList}"/>
					
					// Radio Button
					
					this method for pure html
					
				<form:option value="Nigeria" label="Nigeria"/>
				<form:option value="Ghana" label="Ghana"/>
				<form:option value="Togo" label="Togo"/>
				<form:option value="South Africa" label="South Africa"/>
				 -->
			</form:select>
			<br/><br/>
			
			Favorite Language :
			Java <form:radiobutton path="favoriteLanguage" value="Java"/>
			PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
			C# <form:radiobutton path="favoriteLanguage" value="c#"/>
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
			<br/><br/>
			
			Favorite Operating System :
			Linux <form:checkbox path="operatingSystem" value="Linux"/>
			Windows <form:checkbox path="operatingSystem" value="Windows"/>
			MacOs <form:checkbox path="operatingSystem" value="MacOs"/>
			Ubuntu <form:checkbox path="operatingSystem" value="Ubuntu"/>
			<br/><br/>
			<input type="submit" class="btn btn-primary" value="Submit"/>
		</form:form>
		<!--  <form>
		  <div class="form-group">
		    <label for="firstname">Email address</label>
		    <input type="email" class="form-control" id="firstname" placeholder="Enter First Name">
		   </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">Password</label>
		    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
		  </div>
		  <div class="form-check">
		    <input type="checkbox" class="form-check-input" id="exampleCheck1">
		    <label class="form-check-label" for="exampleCheck1">Check me out</label>
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
		-->
	</body>
</html>