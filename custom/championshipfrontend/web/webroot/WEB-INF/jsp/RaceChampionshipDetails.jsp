<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Race Championship Details</title>

<body>
	<h1>Race Championship Details</h1>

	Race Championship Calendar for ${raceChampionship.name}
	(${raceChampionship.type})
	<br>
	<table>
		<tr>
			<th>Date</th>
			<th>Granprix</th>
			<th>Laps</th>
		</tr>
		<c:forEach var="granPrix" items="${raceChampionship.granPrix}">
			<tr>
				<td>${granPrix.date}</td>
				<td><a href="./granPrix/${granPrix.code}">${granPrix.name}</a></td>
				<td>${granPrix.laps}</td>
			</tr>
		</c:forEach>
	</table>
	<h2>Driver Rankings</h2>
	<table>
		<tr>
			<th>Driver</th>
			<th>Vehicle</th>
			<th>Total Point</th>
		</tr>
		<c:forEach var="driverRanking"
			items="${raceChampionship.driverRanking.placing}">
			<tr>
				<td>${driverRanking.driver}</td>
				<td>${driverRanking.driver.vehicle.name}</td>
				<td>${driverRanking.points}</td>
			</tr>
		</c:forEach>
	</table>
	<h2>Stable Rankings</h2>
	<table>
		<tr>
			<th>Name</th>
			<th>Nationality</th>
			<th>Total Point</th>
		</tr>
		<c:forEach var="stableRanking"
			items="${raceChampionship.stableRanking.placing}">
			<tr>
				<td>${stableRanking.stable.name}</td>
				<td>${stableRanking.stable.nation}</td>
				<td>${stableRanking.points}</td>
			</tr>
		</c:forEach>
	</table>

	<a href="../raceChampionships">Back to Race Championships Listing</a>
</body>
</html>