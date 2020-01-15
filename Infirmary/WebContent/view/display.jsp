<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<style type="text/css">
.coloring {
	background-color: RGBA(13, 70, 83, 0.78);
}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>UPES Infirmary</title>
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Candal">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/files/css2/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/files/css2/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/files/css2/style.css">
</head>

<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="60">
	<!--banner-->
	<section id="banner" class="banner">
		<div class="bg-color">
			<nav class="navbar navbar-default navbar-fixed-top">
				<div class="container">
					<div class="col-md-12">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target="#myNavbar">
								<span class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
						</div>
						<div class="collapse navbar-collapse navbar-left" id="myNavbar">
							<ul class="nav navbar-nav">
								<li class="active" data-toggle="modal"
									data-target="#exampleModal"><a href="#banner">Patient</a></li>
								<li class=""><a href="#service">Add Medicines</a></li>
								<li class=""><a href="#contact">OutMedicine</a></li>
								<li class=""><a href="${pageContext.request.contextPath }/getpatient">Student List</a></li>
								<li class=""><a href="${pageContext.request.contextPath }/getstock">Stock List</a></li>
							</ul>
						</div>
						<div class="collapse navbar-collapse navbar-right" id="myNavbar">
							<ul class="nav navbar-nav">
								<li class=""><a href="${pageContext.request.contextPath }/">Logout</a></li>
							</ul>
						</div>
					</div>
				</div>
			</nav>


			<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h3 class="modal-title" id="exampleModalLabel">Patient
								Details</h3>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">
							<form action="patient" method="POST">
								<div class="form-group">
									<label class="control-label">Date</label>
									<div>
										<input type="date" class="form-control input-lg" name="date"
											required>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label">Name</label>
									<div>
										<input type="text" class="form-control input-lg" name="name"
											required>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label">Age</label>
									<div>
										<input type="text" class="form-control input-lg" name="age"
											required>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label">Gender </label> Male <input
										type="radio" name="gender" value="Male" required>
									Female <input type="radio" name="gender" value="Female"
										required>
								</div>
								<div class="form-group">
									<label class="control-label">Sap Id</label>
									<div>
										<input type="text" class="form-control input-lg" name="sapid"
											required>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label">Course</label>
									<div>
										<input type="text" class="form-control input-lg" name="course"
											required>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label">Medicines Prescribed</label>
									<div>
										<textarea class="form-control input-lg" name="medicine"
											required></textarea>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label">Chronic Ailment</label>
									<div>
										<textarea class="form-control input-lg" name="chronic_ailment"></textarea>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label">Allergies</label>
									<div>
										<textarea class="form-control input-lg" name="allergies"></textarea>
									</div>
								</div>
								<div class="form-group">
									<div>
										Day Scholar <input type="radio" name="travel"
											value="Day Scholar" required> Hostel Boarding <input
											type="radio" name="travel" value="Hostel Boarding" required>
									</div>
								</div>

								<div class="form-group">
									<div>
										<button type="button" class="btn btn-secondary"
											data-dismiss="modal">Close</button>
										<button type="submit" class="btn btn-success">
											Register</button>
									</div>
								</div>
							</form>
						</div>
						<div class="modal-footer"></div>
					</div>
				</div>
			</div>
			<div class="container">
				<div class="row">
					<div class="banner-info">
						<div class="banner-logo text-center">
							<!-- <img src="img/logo.png" class="img-responsive"> -->
						</div>
						<div class="banner-text text-center">
							<h1 class="white">UPES Infirmary</h1>
							<p>LONG LIFE!!!</p>
							<!--  <a href="#contact" class="btn btn-appoint">Make an Appointment.</a> -->
						</div>
						<div class="overlay-detail text-center">
							<a href="#service"><i class="fa fa-angle-down"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--/ banner-->
	<!--service-->
	<section id="service" class="section-padding">
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-sm-4">
					<h2 class="ser-title">InMedicine</h2>
					<hr class="botm-line">
					<p>Add received stock of medicines to keep better track of
						medicines</p>
				</div>
				<div class="col-md-4 col-sm-4">
					<div class="service-info">

						<form action="">
							<div class="form-group">
								<label class="control-label">Medicine</label>
								<div>
									<input type="text" class="form-control input-lg"
										name="medicine" required>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label">Stock</label>
								<div>
									<input type="text" class="form-control input-lg" name="stock"
										required>
								</div>
							</div>
							<div class="form-group">
								<div>
									<button type="button" class="btn btn-secondary"
										data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-success">Save
										Changes</button>
								</div>
							</div>
						</form>
						<!-- <div class="icon">
              <i class="fa fa-stethoscope"></i>
            </div> -->
						<!-- <div class="icon-info">
              <h4>24 Hour Support</h4>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
            </div>
          </div>
          <div class="service-info">
            <div class="icon">
              <i class="fa fa-ambulance"></i>
            </div>
            <div class="icon-info">
              <h4>Emergency Services</h4>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
            </div>
          </div>
        </div>
        <div class="col-md-4 col-sm-4">
          <div class="service-info">
            <div class="icon">
              <i class="fa fa-user-md"></i>
            </div>
            <div class="icon-info">
              <h4>Medical Counseling</h4>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
            </div>
          </div>
          <div class="service-info">
            <div class="icon">
              <i class="fa fa-medkit"></i>
            </div>
            <div class="icon-info">
              <h4>Premium Healthcare</h4>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
            </div> -->
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--/ service-->
	<!--cta-->
	<!--/ contact-->
	<!--footer-->
	<section id="contact" class="section-padding coloring">
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-sm-4">
					<h2 class="ser-title white">OutMedicine</h2>
					<hr class="botm-line">
					<p class="white">Add medicines here in case they needs to be
						deducted from the total available stock</p>
				</div>
				<div class="col-md-4 col-sm-4">
					<div class="service-info">

						<form action="">
							<div class="form-group">
								<label class="control-label white">Medicine</label>
								<div>
									<input type="text" class="form-control input-lg"
										name="medicine" required>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label white">Stock</label>
								<div>
									<input type="text" class="form-control input-lg" name="stock"
										required>
								</div>
							</div>
							<div class="form-group">
								<div>
									<button type="button" class="btn btn-secondary"
										data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-success">Save
										Changes</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>

	<footer id=footer>
		<div class="top-footer">
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-sm-4 marb20">
						<div class="ftr-tle">
							<h4 class="white no-padding">Important Note</h4>
						</div>
						<div class="info-sec">
							<p>All the above provided information will be linked with our back end system so that it can be used efficiently in the future.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<script
		src="${pageContext.request.contextPath }/files/js2/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/files/js2/jquery.easing.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/files/js2/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/files/js2/custom.js"></script>
	<script
		src="${pageContext.request.contextPath }/files/contactform/contactform.js"></script>

</body>

</html>
