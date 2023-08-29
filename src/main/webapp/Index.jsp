<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">


</head>
<body style="background-color:lavender">
<br><br>
<div class="row" style="text-align:center">
	<div class="col-sm-2" ></div>
	<div class="col-sm-3" style="background-color:purple;color:orange;padding:30px;border-radius:30px">
	<h5>Hidden form field</h5>
	<form method="post" action="Hidden_form_field">
	Name: <input type="text" name="e_name" id="e_name"><br><br>
	Password: <input type="text" name="e_password" id="e_password"> <br><br>
	<input type="submit" class="btn btn-light btn-sm" style="background-color:orange" value="Submit" >
	</form>
	</div>
	<div class="col-sm-1"></div>
	<div class="col-sm-3" style="background-color:purple;color:orange;padding:30px;border-radius:30px">
	<h5>URL Re-Writing</h5>

<form action="UrlReWrite">
Name: <input type="text" name="e_name" id="e_name"><br><br>
Password: <input type="text" name="e_password" id="e_password"> <br><br>
<input type="submit" class="btn btn-light btn-sm" value="Submit"  style="background-color:orange">
</form>
	</div>
</div> <br><br>
<div class="row" style="text-align:center">
<div class="col-sm-2" ></div>
	<div class="col-sm-3" style="background-color:purple;color:orange;padding:30px;border-radius:30px">
	<h5>Session Object</h5>
<form method="post" action="Home_HttpSession">
Name: <input type="text" name="e_name" id="e_name"><br><br>
Password: <input type="text" name="e_password" id="e_password"> <br><br>
<input type="submit" class="btn btn-light btn-sm" value="Submit"  style="background-color:orange">

</form>
	</div>
	<div class="col-sm-1" ></div>
	<div class="col-sm-3" style="background-color:purple;color:orange;padding:30px;border-radius:30px">
	<h5>Cookies</h5>
<form method="post" action="Home_Cookies">
Name: <input type="text" name="e_name" id="e_name"><br><br>
Password: <input type="text" name="e_password" id="e_password"> <br><br>
<input type="submit" class="btn btn-light btn-sm"  style="background-color:orange" value="Submit" >

</form>
	</div>
</div>






</body>
</html>