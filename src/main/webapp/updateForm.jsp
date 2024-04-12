<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var = "title" scope = "page" value="Update Form"/>
<c:import url="components/head.jsp"/>
<body>
<c:import url="components/navBar.jsp"/>
<h2>Update Function</h2>

<p>
<!-- TODO: low priority - not hard-coded? -->
<form method="POST" action="http://localhost:8080/national_holidays_team_project_war/services/holidays/update" >
    <label for="holId">Holiday ID:</label><br>
    <input type="text" id="holId" name="holId" required><br><br>
    <label for="holName">Holiday Name:</label><br>
    <input type="text" id="holName" name="holName"><br><br>
    <label for="holDate">Date:</label><br>
    <input type="text" id="holDate" name="holDate"><br><br>
    <button type="submit" name="submit" value="search">Update</button>
</form></p>

<c:import url="components/bootstrapBody.jsp"/>
</body>
</html>