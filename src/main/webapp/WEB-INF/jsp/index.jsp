<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
	<head>
		<title>Index</title>
		<link href="webjars/bootstrap/5.1.0/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		 <div class="container col-xl-10 col-xxl-8 px-4 py-5">
		    <div class="row align-items-center g-lg-5 py-5">
		      <div class="col-lg-7 text-center text-lg-start">
		        <h1 class="display-4 fw-bold lh-1 mb-3">Twitter-Clone</h1>
		        <p class="col-lg-10 fs-4">You must sign in before accessing the website.</p>
		      </div>
		      <div class="col-md-10 mx-auto col-lg-5">
		        <form class="p-4 p-md-5 border rounded-3 bg-light">
		          <div class="form-floating mb-3">
		            <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
		            <label for="floatingInput">Email address</label>
		          </div>
		          <div class="form-floating mb-3">
		            <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
		            <label for="floatingPassword">Password</label>
		          </div>
		          <div class="checkbox mb-3">
		            <label>
		              <input type="checkbox" value="remember-me"> Remember me
		            </label>
		          </div>
		          <button class="w-100 btn btn-lg btn-info" type="submit">Login</button>
		          <hr class="my-4">
		          <small class="text-muted">If you don't have an account, <a href="">sign up</a>.</small>
		        </form>
		      </div>
		    </div>
		  </div>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
        <script src="webjars/bootstrap/5.1.0/js/bootstrap.min.js"></script>
	</body>
</html>