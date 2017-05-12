<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Stable Details</title>

<body>
	<h1>Stable ${stable.name}</h1>
	<br>
	<br>
	<p>${stable.nation}</p>
	<p>
		<a href="/championshipfrontend/drivers/${driver1.code}">${driver1.name}
			${driver1.surname}</a>
	</p>
	<p>
		<a href="/championshipfrontend/drivers/${driver2.code}">${driver2.name}
			${driver2.surname}</a>
	</p>
	<a href="../raceChampionships">Back to RaceChampionship</a>
</body>
</html>