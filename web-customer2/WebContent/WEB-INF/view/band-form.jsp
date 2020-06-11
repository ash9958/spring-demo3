<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<form:form action="stuform" modelAttribute="band">
	
		Band Name:
	<form:select path="bandname" >

			<form:options items="${band.bandOps}"  />

		</form:select>


		<br><br>
	
		
		<input type="submit" value="submit" />
	</form:form>
			
</body>
</html>