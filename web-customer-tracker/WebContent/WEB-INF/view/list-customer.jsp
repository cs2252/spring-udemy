<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer</title>
</head>
<body>	
<h2>List customer comming son</h2>

	<div id="wrapper">
		<div id="header">
			<h2>CRM- Customer Relationship Manger</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<!-- add out html table here -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				<c:forEach var="tempCustomer" items="${customers}">
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>