<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <c:set var = "title" scope = "page" value="Holiday Wizard"/>
    <c:import url="components/head.jsp"/>
    <link href="css/index.css" rel="stylesheet" type="text/css">
    <body>
    <c:import url="components/navBar.jsp"/>

    <div id="welcome-section">
        <h1 id="welcome-message">Welcome to Holiday Wizard!</h1>
        <p>From Squirrel Appreciation Day, to International Coffee Day, every day has something special going on.</p>
        <p>ALL COLORS WILL BE CHANGED. THIS IS JUST FOR ME TO SEE WHERE THINGS GO</p>
    </div>

    <div id="tutorial-section">
        <h1 id="getting-started">Getting Started</h1>
        <p>Here's where I would put the tutorial text.</p>
    </div>

    <div id="live-demo-section">
        <h1>Give it a shot!</h1>
        <!--ADD THE ACTION LATER WHEN WE HAVE A REQUEST LINK -->
        <form method="GET" action="">
            <input type="submit" value="Send request">
        </form>
    </div>

    <c:import url="components/bootstrapBody.jsp"/>
    </body>
</html>
