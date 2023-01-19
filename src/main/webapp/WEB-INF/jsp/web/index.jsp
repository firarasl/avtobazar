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

<section class="recent-vehicle white-bg page-section-ptb">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-title">
                    <h2>Son Elanlar</h2>
                    <div class="separator"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row no-gutter">
            <div class="col-md-12">
                <div class="isotope popup-gallery column-4">
                    <div class="grid-item mercedes audi">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/01.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">Acura Rsx</a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item bmw audi">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/02.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">Lexus GS 450h</a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item mercedes hyundai">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/03.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">GTA 5 Lowriders DLC</a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item bmw audi">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/04.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">Toyota avalon hybrid </a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item mercedes hyundai">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/05.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">Hyundai santa fe sport </a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item bmw audi hyundai">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/06.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">Lexus is f</a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item bmw hyundai">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/07.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">Hyundai santa fe</a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item mercedes hyundai">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/01.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">Acura Rsx</a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item mercedes hyundai">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/02.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">Lexus GS 450h</a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item bmw audi">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/03.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">GTA 5 Lowriders DLC</a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item mercedes hyundai">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/04.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#"> Toyota avalon hybrid </a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                    <div class="grid-item bmw audi hyundai">
                        <div class="car-item-3">
                            <img class="img-fluid center-block" src="images/car/05.jpg" alt="">
                            <div class="car-overlay text-center">
                                <a class="link" href="#">Hyundai santa fe sport </a>
                                <span class="price">$32,698</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>



<section class="page-section-ptb">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="owl-carousel owl-theme" data-items="5" data-md-items="5" data-sm-items="3" data-xs-items="1" data-space="0">
                    <div class="item">
                        <img class="img-fluid center-block" src="images/clients/01.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="images/clients/02.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="images/clients/03.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="images/clients/04.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="images/clients/05.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="images/clients/06.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="images/clients/07.png" alt="">
                    </div>
                    <div class="item">
                        <img class="img-fluid center-block" src="images/clients/08.png" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="footer.jsp"/>

<div class="car-top">
    <span><img src="${pageContext.servletContext.contextPath}/images/car.png" alt=""></span>
</div>

<jsp:include page="js.jsp"/>

<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/jquery.appear.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/counter/jquery.countTo.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/isotope/isotope.pkgd.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/owl-carousel/owl.carousel.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/jquery-ui.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/select/jquery-select.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/magnific-popup/jquery.magnific-popup.min.js"></script>
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

<script type="text/javascript">


</script>
</body>
</html>