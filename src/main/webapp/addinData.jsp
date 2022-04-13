<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> -->
<!DOCTYPE html>
<html lang="en">

<head>
<link rel="stylesheet" href="./Style.css" type="text/css">
<script src="https://www.google.com/recaptcha/api.js" async defer></script>
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<title>Tec</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<style>
body {
	background-color: #000033;
	color: orange;
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

#toast {
	visibility: hidden;
	background-color: white;
}

#toast.show {
	visibility: visible;
}
</style>

</head>

<body>
	<!--TITULO-->

	<div class="alert main" role="alert" id="header">
		<h1 class="">Prueba Tecnica</h1>
	</div>

	<div class="container">
		<h3 class="data">Register User Form</h3>
		<form role="form" method="Post" action="addinData"
			onsubmit="return submitUserForm();">
			<div class="row">
				<div class="col-2">
					<div class="form-group data">
						<label class="data" for="name"> Name </label> <input type="text"
							class="form-control" id="name" name="name" required />
					</div>
				</div>
				<div class="col-2">
					<div class="form-group data">
						<label class="data" for="surname"> Surname </label> <input
							type="text" class="form-control" id="surname" name="surname"
							required />
					</div>
				</div>
				<div class="col-2">
					<div class="form-group data">
						<label class="data" for="date"> Date </label> <input type="date"
							class="form-control" id="date" name="date" required />
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-6">
					<div class="form-group data">
						<label class="data" for="email"> Email </label> <input
							type="email" class="form-control" id="email" name="email"
							required />
					</div>
				</div>
			</div>
			<div class="row justify-content-md-center">
				<div id="captcha">
					<div class="g-recaptcha"
						data-sitekey="6LdZyGQfAAAAAE-VKYhKRSyWVtYXsCX_MwbdG98T"
						data-callback="verifyCaptcha"></div>
					     
					<div id="g-recaptcha-error"></div>
				</div>
				<div class="col-4">
					<button type="submit" class="btn btn-primary" name="action"
						value="insert">Save</button>
				</div>
			</div>
	</div>
	</form>

	<div id="toast" role="alert" aria-live="assertive" aria-atomic="true"
		data-delay="2000"
		style="position: absolute; top: 0rem; right: 1rem; color: #000033;">
		<div class="toast-header">
			<strong class="mr-auto">Alert</strong>
		</div>
		<div class="toast-body">User registration complete.</div>
	</div>
	<div id="footer">
		<a class="ricoh" href="https://www.ricoh.es/"> <IMG
			SRC="ricoh.png" width="40" height="40" style="margin-left: 30px;"></a>
		<a class="liferay" href="https://www.liferay.com/es/home"> <IMG
			SRC="liferay.png" width="40" height="40" style="margin-left: 30px;"></a>
		<a class="teams"
			href="https://www.microsoft.com/es-es/microsoft-teams/log-in"> <IMG
			SRC="teams.png" width="50" height="50" style="margin-left: 30px;"></a>


	</div>

	<script>
		function submitUserForm() {
			var x = document.getElementById("toast");
			var response = grecaptcha.getResponse();
			if (response.length == 0) {
				document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:#ff9933;">Captcha must resolve.</span>';
				return false;
			}
			x.className = "show";
			return true;
		}
	</script>


</body>
</html>