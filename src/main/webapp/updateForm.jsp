<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Update Function</h2>

<p>
<form method="GET" action="updateHoliday" >
    <label for="holId">Holiday ID:</label><br>
    <input type="text" id="holId" name="idParam" required><br><br>
    <label for="holName">Holiday Name:</label><br>
    <input type="text" id="holName" name="nameParam"><br><br>
    <label for="holDate">Date:</label><br>
    <input type="text" id="holDate" name="dateParam"><br><br>
    <button type="submit" name="submit" value="search">Update</button>
</form></p>


</body>
</html>