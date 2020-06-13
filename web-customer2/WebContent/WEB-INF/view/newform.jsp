<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Data</title>
</head>
<body>
	<form:form action="savedata" modelAttribute="bandForm" method="POST">
		Country Name:
		<form:input path="countery" />
		<br>
		<br>
		
		Band Name:
		<form:input path="bandDetails.bandName" />
		<br></br>
		Band Members:
			<form:input path="bandDetails.bandMembers" />
		<br></br>
		Save:
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>