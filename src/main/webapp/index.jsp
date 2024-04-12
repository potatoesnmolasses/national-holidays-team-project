<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <c:import url="components/head.jsp"/>
    <link href="css/index.css" rel="stylesheet" type="text/css">


    <body>
    <c:import url="components/navBar.jsp"/>

    <h1 id="welcome-message">Welcome to Holiday Wizard!</h1>

    <div id="welcome-section" class="container">
        <div class="card">
            <div class="card-body">
                <p>From Squirrel Appreciation Day, to Internation Coffee Day, every day has something special going on! Holiday Wizard makes it easy to incorporate daily fun holidays in whatever you may need them for! This API does not require any keys to work. Simply send a request and get a JSON response back!</p>
            </div>
        </div>
    </div>

    <div id="tutorial-section" class="container">
        <div class="card">
            <div class="card-header">
                <h2>Getting Started</h2>
            </div>
            <div class="card-body">
                <p>Getting all available holidays</p>
                <input class="form-control" type="text" value="http://localhost:8080/national_holidays_team_project_war/services/holidays/all" readonly="">
                <br>
                <p>Getting holidays by date</p>
                <p>Input dates using their numeric values. Ex. April 12th being 4 and 12 respectively</p>
                <input class="form-control" type="text" value="http://localhost:8080/national_holidays_team_project_war/services/holidays/dates/{month}/{day}" readonly="">
                <br>
                <p>Getting the daily holiday list</p>
                <input class="form-control" type="text" value="http://localhost:8080/national_holidays_team_project_war/services/holidays/daily" readonly="">
                <br>

                <p id="doc-button">
                    <a href="redocHoliday.jsp">
                        <button>Read the docs!</button>
                    </a>
                </p>
            </div>
        </div>
    </div>

    <div id="live-demo-section" class="container">
        <div class="card">
            <div class="card-header">
                <h2>Give it a shot!</h2>
            </div>
            <div class="card-body">
                <p>Click this button to get a response for today's holidays</p>
                <form method="GET" action="http://localhost:8080/national_holidays_team_project_war/services/holidays/daily">
                    <input type="submit" value="Send GET request">
                </form>
            </div>
        </div>
    </div>

    <c:import url="components/bootstrapBody.jsp"/>
    </body>
</html>
