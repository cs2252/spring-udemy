<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Login Page</title>
<style type="text/css">
	.failed{
	color : red;
	}
</style>
</head>
<body>
	<h2>My Custom Login Page</h2>
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser"
	 method="POST">
	 
	 	<c:if test="${param.error!=null}">
	 		<i class="failed">Sorry! you entered a wrong username/password</i>
	 	</c:if>
	 	<p>
	 		User Name: <input type="text" name="username" />
	 	</p>
	 	<p>
	 		Password: <input type="password" name="password" />
	 	</p>
	 	
	 	<input type="submit" value="Login"/>
	
	</form:form>
</body>
</html>