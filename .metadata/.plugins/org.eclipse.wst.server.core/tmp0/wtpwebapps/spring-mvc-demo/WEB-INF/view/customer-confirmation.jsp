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
 free Passes:  ${customer.freePass}
<br><br>
 Postal Code:  ${customer.postalCode}  
</body>
</html>