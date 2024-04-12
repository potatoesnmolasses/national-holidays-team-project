<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Add Holiday</h2>

<p>
<form method="POST" action="http://localhost:8080/national_holidays_team_project_war/services/holidays/add" >
    <label for="name">Holiday Name:</label><br>
    <input type="text" id="name" name="name"><br><br>
    <label for="month">Month:</label><br>
    <input type="number" id="month" name="month" min="1" max="12"><br><br>
    <label for="day">Day:</label><br>
    <input type="number" id="day" name="day" min="1" max="31"><br><br>
    <button type="submit" name="submit" value="search">Add</button>
</form>
</p>

</body>
</html>