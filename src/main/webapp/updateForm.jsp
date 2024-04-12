<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Update Function</h2>

<p>

<form method="POST" action="http://localhost:8080/national_holidays_team_project_war/services/holidays/update" >
    <label for="holId">Holiday ID:</label><br>
    <input type="text" id="holId" name="holId" required><br><br>
    <label for="holName">Holiday Name:</label><br>
    <input type="text" id="holName" name="holName"><br><br>
    <label for="month">Month:</label><br>
    <input type="number" id="month" name="month" min="1" max="12"><br><br>
    <label for="day">Day:</label><br>
    <input type="number" id="day" name="day" min="1" max="31"><br><br>
    <button type="submit" name="submit" value="search">Update</button>
</form></p>


</body>
</html>