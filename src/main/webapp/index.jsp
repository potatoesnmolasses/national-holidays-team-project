<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <c:set var = "title" scope = "page" value="Holiday Wizard"/>
    <c:import url="head.jsp"/>
    <body>
    <c:import url="header.jsp"/>

    <div id="welcome-section">
        <h1 id="welcome-message">Welcome to Holiday Wizard!</h1>
        <p>From Squirrel Appreciation Day, to International Coffee Day, every day has something special going on.</p>
    </div>

    <c:import url="bootstrapBody.jsp"/>
    </body>
</html>
