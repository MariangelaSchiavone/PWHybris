<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Race Championship Listing</title>
<body>
	<h1>Race Championships</h1>
	<ul>
		<c:forEach var="racechampionship" items="${raceChampionships}">
			<li><a href="./raceChampionships/${racechampionship.code}">${racechampionship.name}</a></li>
		</c:forEach>
	</ul>
</body>
</html>