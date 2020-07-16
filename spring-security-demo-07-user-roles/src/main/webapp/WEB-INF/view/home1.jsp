<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
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
	<h3>User:<security:authentication property="principal.username" /></h3>
	<h3>Role(s):<security:authentication property="principal.authorities" /></h3>
	<hr/>
	
	<security:authorize access="hasRole('MANAGER')">
	<!-- add a link to point to /leaders  .... this is for managers -->
	<p>
	<a href="${pageContext.request.contextPath }/leaders">LeaderShip Meeting</a>
		(only for manager peeps)
	</p>
	
	<hr/>
	</security:authorize>
	
	<security:authorize access="hasRole('ADMIN')">
	<!-- add a link to point to /systems  .... this is for admins -->
	<p>
	<a href="${pageContext.request.contextPath }/systems">It systems Meeting</a>
		(only for Admins peeps)
	</p>
	
	<hr/>
	</security:authorize>
	<form:form action="${pageContext.request.contextPath}/logout"
				method="POST">
		<input type="submit" value="Logout"/>
		
	</form:form>
	
</body>
</html>