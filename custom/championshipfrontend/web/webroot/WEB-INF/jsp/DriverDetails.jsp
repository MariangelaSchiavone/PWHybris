<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Driver Details</title>

<body>
	<h1>Driver ${driver.name} ${driver.surname}</h1>

	<p>${driver.nationality}</p>
	<p>${driver.vehicle.name}</p>
	<p>
		<a href="/championshipfrontend/stables/${stable.code}">${stable.name}</a>
	</p>

	<a href="../raceChampionships">Back to RaceChampionships</a>
</body>
</html>