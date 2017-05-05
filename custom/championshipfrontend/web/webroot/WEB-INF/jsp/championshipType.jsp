<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Race Championship Details</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid red;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: red;
}
</style>
<body>
	<h1>Race Championship Details</h1>

	Race Championship Calendar for ${racechampionship.name}
	<br>
	<br>
	<table>

		<tr>
			<th>${racechampionship.type}</th>
			<th>${racechampionship.name}</th>
		</tr>
		<br />

		<tr>
			<th>Date</th>
			<th>Granprix</th>
			<th>Laps</th>
			<th>Winner</th>
		</tr>

		<c:forEach var="calendar" items="${racechampionship.matches}">
			<tr>
				<td>${match.matchSummaryFormatted}</td>
			</tr>
		</c:forEach>
		<tr>
			<h2>Driver Rankings </h2>
			
			<th>Driver</th>
			<th>Vehicle</th>
			<th>Total Point</th>
			<th></th>
		</tr>
		<c:forEach var="calendar" items="${racechampionship.matches}">
			<tr>
				<td>${match.matchSummaryFormatted}</td>
			</tr>
		</c:forEach>
		<tr>
			<h2>Stable Rankings </h2>
			
			<th>Nationality</th>
			<th>Vehicle</th>
			<th>Driver</th>
			<th>Total Point</th>
		</tr>
		<c:forEach var="calendar" items="${racechampionship.matches}">
			<tr>
				<td>${match.matchSummaryFormatted}</td>
			</tr>
		</c:forEach>
		

	</table>
	
	


	<a href="../racechampionships">Back to Stadium Listing</a>
</body>
</html>