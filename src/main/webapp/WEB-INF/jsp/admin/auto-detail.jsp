<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 9/24/19
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="meta.jsp"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Auto Detail</title>


    <!-- Favicon -->
    <link rel="shortcut icon" href="/images/favicon.ico" />

    <!-- bootstrap -->
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />

    <!-- flaticon -->
    <link rel="stylesheet" type="text/css" href="/css/flaticon.css" />

    <!-- mega menu -->
    <link rel="stylesheet" type="text/css" href="/css/mega-menu/mega_menu.css" />

    <!-- mega menu -->
    <link rel="stylesheet" type="text/css" href="/css/font-awesome.min.css" />

    <!-- slick css -->
    <link rel="stylesheet" type="text/css" href="/css/slick/slick.css" />
    <link rel="stylesheet" type="text/css" href="/css/slick/slick-theme.css" />

    <!-- owl-carousel -->
    <link rel="stylesheet" type="text/css" href="/css/owl-carousel/owl.carousel.css" />

    <!-- main style -->
    <link rel="stylesheet" type="text/css" href="/css/style.css" />

    <!-- responsive -->
    <link rel="stylesheet" type="text/css" href="/css/responsive.css">

    <!-- Style customizer -->
    <link rel="stylesheet" href="#" data-style="styles">
    <link rel="stylesheet" type="text/css" href="/css/style-customizer.css" />




    <jsp:include page="css.jsp"/>

</head>

<body class="fixed-navbar">
<!-- START HEADER-->
<jsp:include page="header.jsp"/>

<!-- START MENU-->
<jsp:include page="side-bar.jsp"/>
<!-- END MENU-->

<div class="content-wrapper">
    <!-- START PAGE CONTENT-->
    <div class="page-content fade-in-up">
        <div class="row">
            <div class="col-md-12">
                <div class="ibox">
                    <div class="ibox-head">
                        <div class="ibox-title">Istifadecinin ətraflı melumatlari</div>
                    </div>
                    <div class="ibox-body">


                        <div class="row">
                            <div class="col-md-6">
                                <div class="slider-slick">
                                    <div class="slider slider-for detail-big-car-gallery">
                                        <img class="img-fluid" src="/images/detail/big/01.jpg" alt="">
                                        <%--<img class="img-fluid" src="${mediaList.fileName}" alt="">--%>
                                        <img class="img-fluid" src="/images/detail/big/02.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/big/03.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/big/04.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/big/05.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/big/06.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/big/07.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/big/08.jpg" alt="">
                                    </div>
                                    <div class="slider slider-nav">
                                        <img class="img-fluid" src="/images/detail/thum/01.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/thum/02.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/thum/03.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/thum/04.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/thum/05.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/thum/06.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/thum/07.jpg" alt="">
                                        <img class="img-fluid" src="/images/detail/thum/08.jpg" alt="">
                                    </div>
                                </div>

                            </div>
                            <div class="col-md-6">
                                <div class="car-details-sidebar">
                                    <div class="details-block details-weight">
                                        <h5>DESCRIPTION</h5>
                                        <ul>
                                            <c:choose>
                                                <c:when test="${not empty optionalAuto}}">
                                            <li> <span>Make</span> <strong class="text-right">${optionalAuto.brand.name}</strong></li>
                                            <li> <span>Model</span> <strong class="text-right">${optionalAuto.model.name}</strong></li>
                                            <li> <span>Registration date </span> <strong class="text-right">2017</strong></li>
                                            <li> <span>Mileage</span> <strong class="text-right">25,000 mi</strong></li>
                                            <li> <span>Condition</span> <strong class="text-right">New</strong></li>
                                            <li> <span>Exterior Color</span> <strong class="text-right">Silver</strong></li>
                                            <li> <span>Interior Color</span> <strong class="text-right">Brown (Leather)</strong></li>
                                            <li> <span>Drivetrain</span> <strong class="text-right">FWD</strong></li></c:when>
                                            <c:otherwise>
                                                bele mashin yoxdu!
                                            </c:otherwise>
                                            </c:choose>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <jsp:include page="footer.jsp"/>
        </div>
    </div>
</div>
<jsp:include page="js.jsp"/>

<!--=================================
 jquery -->

<!-- jquery  -->
<script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>

<!-- bootstrap -->
<script type="text/javascript" src="/js/popper.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>

<!-- bootstrap -->
<script type="text/javascript" src="/js/mega-menu/mega_menu.js"></script>

<!-- appear -->
<script type="text/javascript" src="/js/jquery.appear.js"></script>

<!-- owl-carousel -->
<script type="text/javascript" src="/js/owl-carousel/owl.carousel.min.js"></script>

<!-- slick -->
<script type="text/javascript" src="/js/slick/slick.min.js"></script>

<!-- select -->
<script type="text/javascript" src="/js/select/jquery-select.js"></script>

<!-- magnific popup -->
<script type="text/javascript" src="/js/magnific-popup/jquery.magnific-popup.min.js"></script>

<!-- style customizer  -->
<script type="text/javascript" src="/js/style-customizer.js"></script>

<!-- custom -->
<script type="text/javascript" src="/js/custom.js"></script>

<!-- php forms -->
<script type="text/javascript" src="/js/forms/form-validation.js"></script>
<script src="../../../www.google.com/recaptcha/apib091.js?render=explicit" async defer></script>
<script type="text/javascript" src="/js/forms/recaptcha.js"></script>

<script>
    $(document).ready(function () {

        // to add badges
        get_auto_count_ajax();
        $('#usersAuto').DataTable();
    })
</script>
</body>
</html>