<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomerList</title>
</head>
<body>
	<table border="1">
		<tr>
			
			<td>Band Name </td>
			<td>Band Members</td>
		
		</tr>
		<c:forEach var="tempBandDetails" items="${bandDetails}">
		<tr>
			<td> ${tempBandDetails.bandName}</td>
			<td>${tempBandDetails.bandMembers}</td>
		
			
		</tr>
		</c:forEach>
	
	</table>

</body>
</html>