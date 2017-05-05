<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Race Championship GP Details</title>
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
	<h1>Race Championship Details for ${racechampionship.name}</h1>

	
	<br>
	<br>
	<table>

		<tr>
			<th>${racechampionship.name}</th>
			<th>${racechampionship.nation}</th>
			<th>${racechampionship.date}</th>
			<th>${racechampionship.laps}</th>
		</tr>
		<br />

		<tr>
			<th>Position</th>
			<th>Driver</th>
			<th>Nationality</th>
			<th>Stable</th>
			<th>TotTime</th>
		</tr>

		<c:forEach var="calendar" items="${racechampionship.matches}">
			<tr>
				<td>${match.matchSummaryFormatted}</td>
				<td><a href="./${racechampionshipstable.name}">${racechampionshipstable.name}</a></td>
			</tr>
		</c:forEach>

	</table>


	<a href="../racechampionships">Back to RaceChampionship</a>
</body>
</html>