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
		<li>${racechampionship.nation}</li>
		<c:forEach var="racechampionship" items="${racechampionships}">
			<li><a href="./racechampionships/${racechampionship.name}">${racechampionship.name}</a></li>
		</c:forEach>
	</ul>



	<a href="../racechampionships">Back to RaceChampionship</a>
</body>
</html>