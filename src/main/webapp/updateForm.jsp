<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Update Function</h2>

<p>
<!-- TODO: low priority - not hard-coded? -->
<form method="POST" action="http://localhost:8080/national_holidays_team_project_war/test/holidayUpdate" >
    <label for="holId">Holiday ID:</label><br>
    <input type="text" id="holId" name="holId" required><br><br>
    <label for="holName">Holiday Name:</label><br>
    <input type="text" id="holName" name="holName"><br><br>
    <label for="holDate">Date:</label><br>
    <input type="text" id="holDate" name="holDate"><br><br>
    <button type="submit" name="submit" value="search">Update</button>
</form></p>


</body>
</html>