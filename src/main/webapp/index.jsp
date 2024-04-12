<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <c:set var = "title" scope = "page" value="Holiday Wizard"/>
    <c:import url="components/head.jsp"/>
    <link href="css/index.css" rel="stylesheet" type="text/css">
    <body>
    <c:import url="components/navBar.jsp"/>

    <h1 id="welcome-message">Welcome to Holiday Wizard!</h1>

    <div id="welcome-section" class="container">
        <div class="card">
            <div class="card-body">
                <p>From Squirrel Appreciation Day, to Internation Coffee Day, every day has something special going on. Add more later</p>
            </div>
        </div>
    </div>

    <div id="tutorial-section" class="container">
        <div class="card">
            <div class="card-header">
                <h2>Getting Started</h2>
            </div>
            <div class="card-body">
                Here's where I would put the tutorial text.
            </div>
        </div>
    </div>

    <div id="live-demo-section" class="container">
        <div class="card">
            <div class="card-header">
                <h2>Give it a shot!</h2>
            </div>
            <div class="card-body">
                <!-- ADD THE ACTION LATER WHEN WE HAVE A WORKING URL -->
                <form method="GET" action="http://localhost:8080/national_holidays_team_project_war/services/holidays/all">
                    <input type="submit" value="Send GET request">
                </form>
            </div>
        </div>
    </div>

    <c:import url="components/bootstrapBody.jsp"/>
    </body>
</html>
