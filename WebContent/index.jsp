<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap.css">
<script src="js/bootstrap.min.js"></script>
<title>Login</title>

</head>
<body>

	<div class="container" style="margin-top: 200px">

		<img src="img/bildit.png" class="center" style="width: 30%" />

		<div class="row">
			<div class="col-md-6">
				<div class="border" style="padding: 10px 10px 10px 10px">

					<h4>Login</h4>

					<form method="post" action="LoginController">

						<div class="form-group">
							<label for="email">Email address</label> <input type="email"
								class="form-control" id="emailType" name="email"
								aria-describedby="emailHelp" placeholder="Enter email">
							<small>We'll
								never share your email with anyone else.</small>
						</div>
						<div class="form-group">
							<label for="password">Password</label> <input type="password"
								class="form-control" id="passwordType" name="password"
								placeholder="Password">
						</div>
						<button type="submit" class="btn btn-primary ">Login</button>

					</form>
				</div>
			</div>

			<div class="col-md-6">
				<div class="border" style="padding: 10px 10px 10px 10px">
					<span class="pull-right">
						<h4>Register</h4>
						<form method="post" action="RegisterController">
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="emailID" required="true" name="emailRegistration"> <small
									id="emailHelp" class="form-text text-muted">We'll never
									share your email with anyone else.</small>
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="passwordID" name="passwordRegistration">
							</div>
							<button type="submit" class="btn btn-primary">Register</button>
							
						</form>
					</span>
				</div>
			</div>
		</div>

	</div>

</body>
</html>
