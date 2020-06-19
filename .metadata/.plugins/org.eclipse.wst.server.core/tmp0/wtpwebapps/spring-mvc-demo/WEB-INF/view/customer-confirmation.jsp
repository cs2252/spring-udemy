<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
the customer is confirmed : ${customer.firstName}  ${customer.lastName}
<br><br>
 free Passes:  ${customer.freePasses}
<br><br>
 Postal Code:  ${customer.postalCode}  
 <br><br>
 Course Code:  ${customer.courseCode}  
</body>
</html>