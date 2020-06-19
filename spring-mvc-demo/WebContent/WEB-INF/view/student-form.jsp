<%@ 
    taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
	<br><br>
	Last name: <form:input path="lastName" />
	<br><br>
	
	<form:select path="country">
		<form:options items="${theCountryOptions}"/>
			
	</form:select>
	
	<br><br>
	Favorite Language:
	Java <form:radiobutton path="favoriteLanguage" value="java" />
	C# <form:radiobutton path="favoriteLanguage" value="C#" />
	PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
	Ruby <form:radiobutton path="favoriteLanguage" value="RUBY" />
	
	<br><br>
	Operating Systems<br>
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	mac <form:checkbox path="operatingSystems" value="mac"/>
	win <form:checkbox path="operatingSystems" value="win"/>
	<br><br>
	<input type="submit" value="submit" />
	</form:form>
	
	
	
</body>
</html>