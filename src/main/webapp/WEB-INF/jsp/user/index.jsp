<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 8/20/19
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <!-- Favicon -->
    <link rel="shortcut icon" href="${pageContext.servletContext.contextPath}/images/favicon.ico" />

    <!-- bootstrap -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/bootstrap.min.css" />

    <!-- flaticon -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/flaticon.css" />

    <!-- mega menu -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/mega-menu/mega_menu.css" />

    <!-- mega menu -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/font-awesome.min.css" />

    <!-- owl-carousel -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/owl-carousel/owl.carousel.css" />

    <!-- jquery-ui -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/jquery-ui.css" />

    <!-- revolution -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/revolution/css/settings.css">

    <!-- main style -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/style.css" />

    <!-- responsive -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/responsive.css" />

    <!-- Style customizer -->
    <link rel="stylesheet" href="#" data-style="styles" />
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/style-customizer.css" />

    <link rel="apple-touch-icon" sizes="76x76" href="${pageContext.servletContext.contextPath}user/assets/img/apple-icon.png">
    <link rel="icon" type="image/png" href="${pageContext.servletContext.contextPath}/user/assets/img/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <!-- CSS Files -->
    <link href="${pageContext.servletContext.contextPath}/user/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath}/user/assets/css/paper-dashboard.css?v=2.0.0" rel="stylesheet" />
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="${pageContext.servletContext.contextPath}/user/assets/demo/demo.css" rel="stylesheet"/>
</head>

<body>
<!--=================================
 header -->

<header id="header" class="topbar-dark logo-right">
    <jsp:include page="topbar.jsp"/>

    <jsp:include page="menu.jsp"/>
</header>

<!--search -->
<section class="search white-bg">
    <div class="container">
        <div class="search-block red-bg">
            <div class="row">
                <div class="col-md-8">
                    <div class="row">
                        <div class="col-md-4">
                            <span>Select make</span>
                            <div class="selected-box">
                                <select class="selectpicker">
                                    <option>Make </option>
                                    <option>BMW</option>
                                    <option>Honda </option>
                                    <option>Hyundai </option>
                                    <option>Nissan </option>
                                    <option>Mercedes Benz </option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <span>Select model</span>
                            <div class="selected-box">
                                <select class="selectpicker">
                                    <option>Model</option>
                                    <option>3-Series</option>
                                    <option>Carrera</option>
                                    <option>GT-R</option>
                                    <option>Cayenne</option>
                                    <option>Mazda6</option>
                                    <option>Macan</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <span>Select Year</span>
                            <div class="selected-box">
                                <select class="selectpicker">
                                    <option>Year</option>
                                    <option>2010</option>
                                    <option>2011</option>
                                    <option>2012</option>
                                    <option>2013</option>
                                    <option>2014</option>
                                    <option>2015</option>
                                    <option>2016</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <span>Select body style</span>
                            <div class="selected-box">
                                <select class="selectpicker">
                                    <option>Body style</option>
                                    <option>2dr Car</option>
                                    <option>4dr Car</option>
                                    <option>Convertible</option>
                                    <option>Sedan</option>
                                    <option>Sports Utility</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <span>Select vehicle status</span>
                            <div class="selected-box">
                                <select class="selectpicker">
                                    <option>Vehicle Status</option>
                                    <option>Condition</option>
                                    <option>All Conditions</option>
                                    <option>Condition</option>
                                    <option>Brand New</option>
                                    <option>Slightly Used</option>
                                    <option>Used</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="price-slide">
                        <div class="price">
                            <label for="amount">Price Range</label>
                            <input type="text" id="amount" class="amount" value="$50 - $300" />
                            <div id="slider-range"></div>
                            <a class="button white" href="#">Search the Vehicle</a>
                            <a class="link" href="#">ADVANCED SEARCH</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>



<%--************************************************************--%>

<%--<div class="wrapper ">
    <div class="sidebar" data-color="white" data-active-color="danger">--%>
        <div class="col-md-8">
        <div class="card card-user">
            <div class="card-header">
                <h5 class="card-title">Edit Profile</h5>
            </div>
            <div class="card-body">
                <form>
                    <div class="row">
                        <div class="col-md-3 px-1">
                            <div class="form-group">
                                <label>Username</label>
                                <input type="text" class="form-control" placeholder="Username" value="michael23">
                            </div>
                        </div>
                        <div class="col-md-4 pl-1">
                            <div class="form-group">
                                <input type="email" class="form-control" placeholder="Email">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6 pr-1">
                            <div class="form-group">
                                <label>First Name</label>
                                <input type="text" class="form-control" placeholder="Company" value="Chet">
                            </div>
                        </div>
                        <div class="col-md-6 pl-1">
                            <div class="form-group">
                                <label>Last Name</label>
                                <input type="text" class="form-control" placeholder="Last Name" value="Faker">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label>Address</label>
                                <input type="text" class="form-control" placeholder="Home Address" value="Melbourne, Australia">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4 pr-1">
                            <div class="form-group">
                                <label>City</label>
                                <input type="text" class="form-control" placeholder="City" value="Melbourne">
                            </div>
                        </div>
                        <div class="col-md-4 px-1">
                            <div class="form-group">
                                <label>Country</label>
                                <input type="text" class="form-control" placeholder="Country" value="Australia">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="update ml-auto mr-auto">
                            <button type="submit" class="btn btn-primary btn-round">Update Profile</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <%--</div>
</div>
--%>





















<%--************************************************************--%>



<%--<section class="page-section-ptb">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="owl-carousel owl-theme" data-items="5" data-md-items="5" data-sm-items="3" data-xs-items="1" data-space="0">
                    <div class="item">
                        <img class="img-fluid center-block" src="${pageContext.servletContext.contextPath}/images/clients/01.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="${pageContext.servletContext.contextPath}/images/clients/02.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="${pageContext.servletContext.contextPath}/images/clients/03.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="${pageContext.servletContext.contextPath}/images/clients/04.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="${pageContext.servletContext.contextPath}/images/clients/05.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="${pageContext.servletContext.contextPath}/images/clients/06.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="${pageContext.servletContext.contextPath}/images/clients/07.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="${pageContext.servletContext.contextPath}/images/clients/08.png" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>--%>

<jsp:include page="footer.jsp"/>




<div class="car-top">
    <span><img src="${pageContext.servletContext.contextPath}/images/car.png" alt=""></span>
</div>

<jsp:include page="js.jsp"/>
<!-- appear -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/jquery.appear.js"></script>

<!-- counter -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/counter/jquery.countTo.js"></script>

<!-- isotope -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/isotope/isotope.pkgd.min.js"></script>

<!-- owl-carousel -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/owl-carousel/owl.carousel.min.js"></script>

<!-- jquery-ui -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/jquery-ui.js"></script>

<!-- select -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/select/jquery-select.js"></script>

<!-- magnific popup -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/magnific-popup/jquery.magnific-popup.min.js"></script>

<!-- revolution -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/jquery.themepunch.tools.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/jquery.themepunch.revolution.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/extensions/revolution.extension.actions.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/extensions/revolution.extension.carousel.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/extensions/revolution.extension.kenburn.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/extensions/revolution.extension.migration.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/extensions/revolution.extension.parallax.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/revolution/js/extensions/revolution.extension.video.min.js"></script>

<!-- custom -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/custom.js"></script>

<!-- style customizer  -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/style-customizer.js"></script>

<script src="${pageContext.servletContext.contextPath}/user/assets/js/core/jquery.min.js"></script>
<script src="${pageContext.servletContext.contextPath}/user/assets/js/core/popper.min.js"></script>
<script src="${pageContext.servletContext.contextPath}/user/assets/js/core/bootstrap.min.js"></script>
<script src="${pageContext.servletContext.contextPath}/user/assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
<!--  Google Maps Plugin    -->
<script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
<!-- Chart JS -->
<script src="${pageContext.servletContext.contextPath}/user/assets/js/plugins/chartjs.min.js"></script>
<!--  Notifications Plugin    -->
<script src="${pageContext.servletContext.contextPath}/user/assets/js/plugins/bootstrap-notify.js"></script>
<!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
<script src="${pageContext.servletContext.contextPath}/user/assets/js/paper-dashboard.min.js?v=2.0.0" type="text/javascript"></script>
<!-- Paper Dashboard DEMO methods, don't include it in your project! -->
<script src="${pageContext.servletContext.contextPath}/user/assets/demo/demo.js"></script>
</body>
</html>