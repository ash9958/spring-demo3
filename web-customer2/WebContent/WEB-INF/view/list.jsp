<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Band Options</title>
	<style>
	.table1{	
			margin-left: 3%;
			margin-top: 3%;
			width:90%;
			height:200px;
			
			text-align: center;
		}
		

	</style>

</head>
<body>





	<input type="button" value="Add Data"
		onclick="window.location.href='showFormAdd'; return false;" />



	<br><br>
	<hr>
	<table border="1" class="table1">
		<tr>
			<th>Band Country</th>
			<th>Band Name</th>
			<th>Band Member</th>
		</tr>
		<c:forEach var="tempBandDetails" items="${bandDetails}">
			<tr>
				<td>${tempBandDetails.countery}</td>
				<td>${tempBandDetails.bandDetails.bandName}</td>
				<td>${tempBandDetails.bandDetails.bandMembers}</td>

			</tr>
		</c:forEach>
	</table>


</body>
</html>