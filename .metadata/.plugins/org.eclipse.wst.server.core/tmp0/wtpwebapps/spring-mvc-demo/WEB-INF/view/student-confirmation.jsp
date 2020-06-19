<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registration confirmation</title>
</head>
<body>
the student is confirmed : ${student.firstName} ${student.lastName}

<br><br>
country: ${student.country}  

<br><br>
Favorite Language: ${student.favoriteLanguage}

<br><br>
OperatingSystems:
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
	 <li>${temp}</li>
	</c:forEach>
	
</ul>

</body>
</html>