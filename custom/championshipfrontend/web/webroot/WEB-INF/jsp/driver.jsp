<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Race Championship GP Details</title>

<body>
	<h1>Stable ${stable.name}</h1>


	<br>
	<br>
	<ul>
		<li>${racechampionship.name}</li>
		<li>${racechampionship.surname}</li>
		<li>${racechampionship.nation}</li>
		<li>${racechampionship.age}</li>
		<li><a href="./racechampionships/${racechampionship.name}">${racechampionship.name}</a></li>
	</ul>
	<a href="../racechampionships">Back to RaceChampionship</a>
</body>
</html>