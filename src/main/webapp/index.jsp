<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <c:set var = "title" scope = "page" value="Holiday Wizard"/>
    <c:import url="components/head.jsp"/>
    <link href="css/index.css" rel="stylesheet" type="text/css">
    <body>
    <c:import url="components/header.jsp"/>

    <div id="welcome-section">
        <h1 id="welcome-message">Welcome to Holiday Wizard!</h1>
        <p>From Squirrel Appreciation Day, to International Coffee Day, every day has something special going on.</p>
        <p>ALL COLORS WILL BE CHANGED. THIS IS JUST FOR ME TO SEE WHERE THINGS GO</p>
    </div>

    <c:import url="components/bootstrapBody.jsp"/>
    </body>
</html>
