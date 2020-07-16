<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Security home page</title>
</head>
<body>
	<h2>Spring security exercise home page</h2>
	
	<hr/>
	<h3>Your permisssions</h3>
	<hr/>
	
	<form:form action="${pageContext.request.contextPath}/logout"
				method="POST">
		<input type="submit" value="Logout"/>
		
	</form:form>
	
</body>
</html>