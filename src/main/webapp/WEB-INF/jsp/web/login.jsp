<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 7.08.2019
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <jsp:include page="meta.jsp"/>
    <jsp:include page="css.jsp"/>
    <link rel="stylesheet" href="css/style.css">


    <title>AutoBazar Login</title>
    <jsp:include page="meta.jsp"/>
    <title>AutoBazar Login</title>

    <jsp:include page="css.jsp"/>
    <link src="css/style.css">

    <style>
        input[type=number]::-webkit-inner-spin-button,
        input[type=number]::-webkit-outer-spin-button {
            -webkit-appearance: none;
            -moz-appearance: none;
            appearance: none;
            margin: 0;
        }
    </style>
</head>

<body>


<div id="loading">
    <div id="loading-center">
        <img src="images/loader.gif" alt="">
    </div>
</div>


<header id="header" class="defualt">
    <jsp:include page="topbar.jsp"/>

    <jsp:include page="menu.jsp"/>
</header>

<!--=================================
 header -->


<!--=================================
 inner-intro -->

<section class="inner-intro bg-1 bg-overlay-black-70">
    <div class="container">
        <div class="row text-center intro-title">
            <div class="col-md-6 text-md-left d-inline-block">
                <h1 class="text-white">Login </h1>
            </div>
            <div class="col-md-6 text-md-right float-right">
                <ul class="page-breadcrumb">
                    <li><a href="#"><i class="fa fa-home"></i> Home</a> <i class="fa fa-angle-double-right"></i></li>
                    <li><a href="#">pages</a> <i class="fa fa-angle-double-right"></i></li>
                    <li><span>Login</span> </li>
                </ul>
            </div>
        </div>
    </div>
</section>

<!--=================================
 inner-intro -->


<!--=================================
 login-form  -->

<section class="login-form page-section-ptb">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-title">
                    <h2>Login To Your Account</h2>
                    <div class="separator"></div>
                </div>
            </div>
        </div>

        <div class="row justify-content-center">
            <div class="col-lg-6 col-md-12">

                <form method="post" action="login">

                    <div class="gray-form clearfix">
                        <div class="form-group">
                            <c:if test="${param.error != null}">
                                Username or password is invalid!
                            </c:if>

                            <c:if test="${not empty param.logout}">
                                Successfully logged out!
                            </c:if>

                            <label for="name">Email* </label>
                            <input id="name" class="form-control" type="text" placeholder="Email" name="autobazar_username">
                        </div>
                        <div class="form-group">
                            <label for="Password">Password* </label>
                            <input id="Password" class="form-control" type="password" placeholder="Password" name="autobazar_password">
                        </div>

                        <input type="hidden"                        6
                               name="${_csrf.parameterName}"
                               value="${_csrf.token}"/>
                        <button type="submit" class="btn">Log in</button>

                        <div class="form-group">
                            <div class="remember-checkbox mb-4">
                                <input type="checkbox" name="remember-me" id="one">
                                <label for="one"> Remember me</label>
                                <a href="#" class="float-right">Forgot Password?</a>
                            </div>
                        </div>
                        <input type="submit" class="button red" value="Login">
                    </div>
                </form>

                <div class="login-social text-center">
                    <h5>Login with Social media</h5>
                    <ul>
                        <li><a class="fb button" href="#"><i class="fa fa-facebook"></i> Facebook</a></li>
                        <li><a class="twitter button" href="#"><i class="fa fa-twitter"></i> Twitter</a></li>
                        <li><a class="pinterest button" href="#"><i class="fa fa-google-plus"></i> google+</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</section>

<!--=================================
 login-form  -->


<jsp:include page="footer.jsp"/>


<!--=================================
back to top -->

<div class="car-top">
    <span><img src="images/car.png" alt=""></span>
</div>

<!--=================================
back to top -->


<jsp:include page="js.jsp"/>

</body>

</html>
