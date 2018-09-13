<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap.css">
<script src="js/bootstrap.min.js"></script>
<title>Login</title>

<div class="container" style="margin-top: 150px">

	<img src="img/bildit.png" style="width:15%" />

	<div class="row">
		<div class="col-md-12">
			<div class="border" style="padding: 10px 10px 10px 10px">
				<h6> Welcome ${sessionScope.email}</h6>
				<h4>One more steps...</h4>

				<form method="post" action="ProccessController">

					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" name="name">
					</div>

					<div class="form-group">
						<label for="lastName">Last name</label> <input type="text"
							class="form-control" id="lastName" name="lastName">
					</div>

					<div class="form-group">
						<label for="streetAddress">Street address</label> <input
							type="text" class="form-control" id="streetAddress" name="streetAddress">
					</div>
					<div class="form-group">
						<label for="city">City</label> <input
							type="text" class="form-control" id="city" name="city">
					</div>

					<button type="submit" class="btn btn-primary ">Finish</button>

				</form>
			</div>
		</div>

	</div>

</div>









</head>
<body>

</body>
</html>