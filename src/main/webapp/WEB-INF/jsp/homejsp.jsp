<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Simple Sidebar - Start Bootstrap Template</title>

<!-- Bootstrap Core CSS -->
<link href="resources/bootstrap-3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="resources/bootstrap-3.3.6/css/simple-sidebar.css"
	rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<style type="text/css">

a.btn.btn-default{
padding: 0; 
height: 22px;
    width: 22px;

	
}
div.col-sm-9{
 width: 370px;
}
</style>

</head>
<body>

	<div id="wrapper">

		<!-- Sidebar -->
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li class="sidebar-brand"><a href="#"> Start Bootstrap </a></li>
				<li><a href="#">Dashboard</a></li>
				<li><a href="#">Shortcuts</a></li>
				<li><a href="#">Overview</a></li>
				<li><a href="#">Events</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Services</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<h1>Simple Sidebar</h1>

						<h2>Temps actuel: ${serverTime}.</h2>

						<p>This template has a responsive menu toggling system. The
							menu will appear collapsed on smaller screens, and will appear
							non-collapsed on larger screens. When toggled using the button
							below, the menu will appear/disappear. On small screens, the page
							content will be pushed off canvas.</p>
						<p>
							Make sure to keep all page content within the
							<code>#page-content-wrapper</code>
							.
						</p>
						<a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle
							Menu</a>
					</div>
				</div>
			</div>
		</div>
		<!-- /#page-content-wrapper -->

		<div class="container">
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4" style="background-color: lightgray;">
					<div class="col-sm-3">N Piques</div>
					<div class="col-sm-9">
<!-- 						<div class="btn-toolbar" role="toolbar"> -->
<!-- 							<div class="btn-group btn-group-lg btn-group-justified btn-group-fill-height"> -->
								
								<!-- TODO centrer le 10, fixer largeur bouton  -->
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">A</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">R</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">D</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">V</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">10</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">9</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">8</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">7</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">6</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">5</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">4</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">3</span></a>
								<a href="#" class="btn btn-default" role="button"><span class="pull-left">2</span></a>
<!-- 							</div> -->
<!-- 						</div> -->
					</div>
				</div>
				<div class="col-sm-4"></div>
			</div>
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4" style="background-color: lightgray;">N
					Coeurs</div>
				<div class="col-sm-4"></div>
			</div>
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4" style="background-color: lightgray;">N
					Carreaux</div>
				<div class="col-sm-4"></div>
			</div>
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4" style="background-color: lightgray;">N
					Trèfles</div>
				<div class="col-sm-4"></div>
			</div>
			<div class="row">
				<div class="col-sm-4" style="background-color: lightgray;">O
					Piques</div>
				<div class="col-sm-4">N</div>
				<div class="col-sm-4" style="background-color: lightgray;">E
					Piques</div>
			</div>
			<div class="row">
				<div class="col-sm-4" style="background-color: lightgray;">O
					Coeurs</div>
				<div class="col-sm-4">O</div>
				<div class="col-sm-4" style="background-color: lightgray;">E
					Coeurs</div>
			</div>
			<div class="row">
				<div class="col-sm-4" style="background-color: lightgray;">O
					Carreaux</div>
				<div class="col-sm-4">E</div>
				<div class="col-sm-4" style="background-color: lightgray;">E
					Carreaux</div>
			</div>
			<div class="row">
				<div class="col-sm-4" style="background-color: lightgray;">O
					Trèfles</div>
				<div class="col-sm-4">S</div>
				<div class="col-sm-4" style="background-color: lightgray;">E
					Trèfles</div>
			</div>
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4" style="background-color: lightgray;">S
					Piques</div>
				<div class="col-sm-4"></div>
			</div>
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4" style="background-color: lightgray;">S
					Coeurs</div>
				<div class="col-sm-4"></div>
			</div>
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4" style="background-color: lightgray;">S
					Carreaux</div>
				<div class="col-sm-4"></div>
			</div>
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4" style="background-color: lightgray;">S
					Trèfles</div>
				<div class="col-sm-4"></div>
			</div>
		</div>

		<!-- 		<div class="container"> -->
		<!-- 		  <div class="btn-toolbar" role="toolbar"> -->
		<!-- 		    <div class="btn-group btn-group-lg btn-group-justified btn-group-fill-height"> -->
		<!-- 		      <a href="#" class="btn btn-default" role="button"> -->
		<!-- 		        <strong>Part A</strong><br> -->
		<!-- 		        <span>Summary</span> -->
		<!-- 		      </a> -->
		<!-- 		      <a href="#" class="btn btn-default" role="button"> -->
		<!-- 		        <strong>Part B</strong><br> -->
		<!-- 		        <span>Very Long Summary</span> -->
		<!-- 		      </a> -->
		<!-- 		      <a href="#" class="btn btn-default" role="button"> -->
		<!-- 		        <strong>Part D</strong><br> -->
		<!-- 		        <span>Summary</span> -->
		<!-- 		      </a> -->
		<!-- 		      <a href="#" class="btn btn-default" role="button"> -->
		<!-- 		        <strong>Part E</strong><br> -->
		<!-- 		        <span>Long Summary That's Annoyingly Long</span> -->
		<!-- 		      </a> -->
		<!-- 		      <a href="#" class="btn btn-default" role="button"> -->
		<!-- 		        <strong>Part F</strong><br> -->
		<!-- 		        <span>Summary</span> -->
		<!-- 		      </a> -->
		<!-- 		      <a href="#" class="btn btn-default" role="button"> -->
		<!-- 		        <strong>Part G</strong><br> -->
		<!-- 		        <span>Very Long Summary</span> -->
		<!-- 		      </a> -->
		<!-- 		    </div> -->
		<!-- 		  </div> -->
		<!-- 		</div>		 -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="resources/jquery-2.2.0/jquery-2.2.0.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources/bootstrap-3.3.6/js/bootstrap.min.js"></script>

	<!-- Menu Toggle Script -->
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>
</body>
</html>