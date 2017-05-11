<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Race Championship GP Details</title>
<body>
	<h1>GranPrix Details for ${granPrix.name}</h1>
	<br>

	<p>${granPrix.name}</p>
	<p>${granPrix.nation}</p>
	<p>${granPrix.date}</p>
	<p>${granPrix.laps}</p>

	<table>
	<tr>
	<th>Position</th>
	<th>Driver</th>
	<th>Time</th>
	</tr>
		<c:forEach var="placing" items="${granPrix.placing}">
			<tr>
				<td>${placing.position}</td>
				<td>${placing.driver.name} ${placing.driver.surname}</td>
				<td>${placing.time}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="../../raceChampionships">Back to RaceChampionships</a>
</body>
</html>