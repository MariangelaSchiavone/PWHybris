<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Race Championship Listing</title>
    <body>
        <h1>Race Championship </h1>
     <ul>
     <c:forEach var="racechampionship" items="${racechampionships}">
        <li><a href="./racechampionships/${racechampionship.name}">${racechampionship.name}</a></li>
      </c:forEach>
      </ul>
    </body>
</html>