<html>
	<head>
		 <script src="http://localhost:8000/jquery/dist/jquery.min.js"></script>
		<script src="http://localhost:8000/bootstrap/dist/js/bootstrap.min.js"></script>
         <script src="http://localhost:8000/jsrender/jsrender.min.js"></script>
		<script src="http://localhost:8000/underscore/underscore-min.js"></script>
		<script src="http://localhost:8000/backbone/backbone-min.js"></script>
		<script src="http://localhost:8000/js/router.js"></script>
		<script src="http://localhost:8000/js/templateLoader.js"></script>
		<script src="http://localhost:8000/js/controller.js"></script>
		<script src="http://localhost:8000/js/main.js"></script>
        <link rel="stylesheet" type="text/css" href="http://localhost:8000/bootstrap/dist/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="http://localhost:8000/css/style.css"/>
	</head>
	<body>
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>                        
		      </button>
		      <a class="navbar-brand" href="#">EMS</a>
		    </div>
		    <div class="collapse navbar-collapse" id="myNavbar">
		      <ul class="nav navbar-nav">
		        <li class="active"><a href="#" id="homeDisplayId">Home</a></li>
				  <li><a href="#/list" id="showlistMenu">Show List</a></li>
		        <li class="dropdown">
		          <a class="dropdown-toggle shiftright" id="addnewEmployee01" data-toggle="dropdown" href="#">Add New Employee<span class="" ></span></a>
		         <!-- <ul class="dropdown-menu">
		            <li><a href="#/add" id="addNewEmployeeId">ADD NEW</a></li>
		            <li><a href="#/update">UPDATE</a></li>
		            <li><a href="#/delete">DELETE</a></li>
		          </ul>-->
		        </li>
				  <li><div class="shiftright"></div></li>
				<li>
					<div>
						<input type="text" class="input-lg searchBox" placeholder="Search by NAME,ID"/>
						<button class="btn btn-success">Search</button>
					</div>
				  </li>
				<li></li>
		        <li><a href="#"></a></li>
		      </ul>
		      <ul class="nav navbar-nav navbar-right">
		        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
		        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
		      </ul>
		    </div>
		  </div>
		</nav>
		<div class="container">
			
		  <h3>MANAGEMENT SYSTEM</h3>
			<div id="homePageDataDisplay" class="col-sm-12">
			</div>
			<div class="col-sm-6" id="addEmployeeColId"></div>
			<div class="col-sm-12" id="showList"></div>
		</div>
	</body>
</html>