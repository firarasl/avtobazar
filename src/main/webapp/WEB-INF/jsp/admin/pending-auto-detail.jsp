<%--
  Created by IntelliJ IDEA.
  User: nar
  Date: 21.09.19
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>PENDING DETAIL | AUTO </title>
    <!-- lazim -->
    <!-- bootstrap -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/bootstrap.min.css"/>

    <!-- lazim -->
    <!-- flaticon -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/font-awesome.min.css"/>

    <!-- lazim -->
    <!-- slick css -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/slick/slick.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/slick/slick-theme.css"/>


    <!-- lazim -->
    <!-- owl-carousel -->
    <link rel="stylesheet" type="text/css"
          href="${pageContext.servletContext.contextPath}/css/owl-carousel/owl.carousel.css"/>


    <!-- lazim -->
    <!-- main style -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/style.css"/>

    <!-- lazim -->
    <!-- responsive -->
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/responsive.css">

    <style>
        #button {
            border-color: #db2d2e;
            font-size: 13px;
            color: white;
            background-color: #db2d2e;
        }
    </style>
</head>

<body>
<section class="car-details page-section-ptb">
    <div class="container">
        <div class="row">
            <div class="col-md-6 ">
                <div class="slider-slick">
                    <div class="slider slider-for detail-big-car-gallery">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/big/01.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/big/02.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/big/03.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/big/04.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/big/05.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/big/06.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/big/07.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/big/08.jpg"
                             alt="">
                    </div>
                    <div class="slider slider-nav">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/thum/01.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/thum/02.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/thum/03.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/thum/04.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/thum/05.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/thum/06.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/thum/07.jpg"
                             alt="">
                        <img class="img-fluid" src="${pageContext.servletContext.contextPath}/images/detail/thum/08.jpg"
                             alt="">
                    </div>

                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="car-details-sidebar">
                    <div class="details-block details-weight">
                        <ul>

                            <li><span>Şəhər</span> <strong class="text-right">${auto.city.name}</strong></li>
                            <li><span>Ad</span> <strong class="text-right">${auto.user.name}</strong></li>
                            <li><span>Nömrə</span> <strong class="text-right">${auto.user.mobile1}</strong></li>
                            <li><span>Yerləşdirmə tarixi</span> <strong
                                    class="text-right">${auto.createDateTime}</strong></li>
                            <li><span>Marka</span> <strong class="text-right">${auto.model.brand.name}</strong></li>
                            <li><span>Model</span> <strong class="text-right">${auto.model.name}</strong></li>
                            <li><span>İli</span> <strong class="text-right">${auto.year}</strong></li>
                            <li><span>Rəng</span> <strong class="text-right">${auto.exteriorColor.name}</strong></li>
                            <li><span>Yürüş</span> <strong class="text-right">${auto.mileage}</strong></li>
                            <li><span>Sürətlər qutusu</span> <strong class="text-right">${auto.gearType.name}</strong>
                            </li>
                            <li><span>Mühərrikin həcmi</span> <strong class="text-right">${auto.engine}</strong></li>
                            <li><span>Mühərrikin gücü</span> <strong
                                    class="text-right">${auto.horsePower}&nbsp;a.g</strong></li>
                            <li><span>Yanacaq</span> <strong class="text-right">${auto.fuelType.name}</strong></li>
                            <li><span>Vəziyyəti</span> <strong class="text-right">${auto.used}</strong></li>
                            <li><span>Qiymət</span> <strong class="text-right">${auto.price}&nbspAZN</strong></li>


                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-9 col-md-9  col-sm-9">
                <div id="tabs">
                    <ul class="tabs">
                        <li data-tabs="tab1" class="active"><span aria-hidden="true" class="icon-diamond"></span> Ümumi
                            Məlumat
                        </li>
                        <li data-tabs="tab2"><span aria-hidden="true" class="icon-list"></span>Xüsusiyyətlər</li>
                    </ul>
                    <div id="tab1" class="tabcontent">
                        <p><strong>
                            ${auto.description}
                        </strong>
                        </p>
                    </div>
                    <div id="tab2" class="tabcontent">
                        <div class="extra-feature">
                            <div class="row">
                                <div class="col-md-4">
                                    <ul class="list-style-1">
                                        <c:choose>
                                            <c:when test="${not empty auto.centralLocking}">
                                                <li><i class="fa fa-check"></i>Mərkəzi qapanma</li>
                                            </c:when>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${not empty auto.startStop}">
                                                <li><i class="fa fa-check"></i>Start Stop</li>
                                            </c:when>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${not empty auto.abs}">
                                                <li><i class="fa fa-check"></i>Anti-Lock (ABS)</li>
                                            </c:when>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${not empty auto.bluetooth}">
                                                <li><i class="fa fa-check"></i>bluetooth</li>
                                            </c:when>
                                        </c:choose>

                                        <c:choose>
                                            <c:when test="${not empty auto.lightType.name}">
                                                <li><i class="fa fa-check"></i>${auto.lightType.name}</li>
                                            </c:when>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${not empty auto.climatisation}">
                                                <li><i class="fa fa-check"></i>${auto.climatisation.name}</li>
                                            </c:when>
                                        </c:choose>

                                    </ul>
                                </div>
                                <div class="col-md-4">
                                    <ul class="list-style-1">
                                        <c:choose>
                                            <c:when test="${not empty auto.airbag}">
                                                <li><i class="fa fa-check"></i>Airbag</li>
                                            </c:when>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${not empty auto.interiorMaterial.name}">
                                                <li><i class="fa fa-check"></i>${auto.interiorMaterial.name}</li>
                                            </c:when>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${not empty auto.parkingSensor}">
                                                <li><i class="fa fa-check"></i>Park radarı</li>
                                            </c:when>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${not empty auto.seat}">
                                                <li><i class="fa fa-check"></i>Oturacaqların isidilməsi</li>
                                            </c:when>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${not empty auto.electricWindow}">
                                                <li><i class="fa fa-check"></i>Elektrik şüşə qaldıranlar</li>
                                            </c:when>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${not empty auto.sideMirrorAdjustment}">
                                                <li><i class="fa fa-check"></i>Güzgülərin qatlanması</li>

                                            </c:when>
                                        </c:choose>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="car-details-sidebar">
                            <div class="details-form contact-2 details-weight">
                                    <h5>BİLDİRİŞ</h5>
                                    <div class="form-group">
                                        <label>

                                            <textarea name="message" class="form-control" id="message" rows="10" cols="30"
                                                           placeholder="Mesaj"></textarea>
                                        </label>
                                    </div>
                                    <div>
                                        <input type="submit" value="Göndər" id="button"/>
                                    </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="feature-car">
                    <h6>DİGƏR ELANLARI</h6>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="owl-carousel" data-nav-arrow="true" data-nav-dots="true" data-items="4"
                                 data-md-items="4" data-sm-items="2" data-xs-items="2" data-space="15">
                                <div class="item">
                                    <div class="car-item gray-bg text-center">
                                        <div class="car-image">
                                            <img class="img-fluid"
                                                 src="${pageContext.servletContext.contextPath}/images/car/01.jpg"
                                                 alt="">
                                            <div class="car-overlay-banner">
                                                <ul>
                                                    <li><a href="#"><i class="fa fa-link"></i></a></li>
                                                    <li><a href="#"><i class="fa fa-dashboard"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="car-list">
                                            <ul class="list-inline">
                                                <li><i class="fa fa-registered"></i> 2016</li>
                                                <li><i class="fa fa-cog"></i> Manual</li>
                                                <li><i class="fa fa-dashboard"></i> 6,000 mi</li>
                                            </ul>
                                        </div>
                                        <div class="car-content">
                                            <div class="star">
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star-o orange-color"></i>
                                            </div>
                                            <a href="#"> Acura Rsx</a>
                                            <div class="separator"></div>
                                            <div class="price">
                                                <span class="old-price">$35,568</span>
                                                <span class="new-price">$32,698 </span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="car-item gray-bg text-center">
                                        <div class="car-image">
                                            <img class="img-fluid"
                                                 src="${pageContext.servletContext.contextPath}/images/car/02.jpg"
                                                 alt="">
                                            <div class="car-overlay-banner">
                                                <ul>
                                                    <li><a href="#"><i class="fa fa-link"></i></a></li>
                                                    <li><a href="#"><i class="fa fa-dashboard"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="car-list">
                                            <ul class="list-inline">
                                                <li><i class="fa fa-registered"></i> 2016</li>
                                                <li><i class="fa fa-cog"></i> Manual</li>
                                                <li><i class="fa fa-dashboard"></i> 6,000 mi</li>
                                            </ul>
                                        </div>
                                        <div class="car-content">
                                            <div class="star">
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star-o orange-color"></i>
                                            </div>
                                            <a href="#">Lexus GS 450h</a>
                                            <div class="separator"></div>
                                            <div class="price">
                                                <span class="old-price">$35,568</span>
                                                <span class="new-price">$32,698 </span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="car-item gray-bg text-center">
                                        <div class="car-image">
                                            <img class="img-fluid"
                                                 src="${pageContext.servletContext.contextPath}/images/car/03.jpg"
                                                 alt="">
                                            <div class="car-overlay-banner">
                                                <ul>
                                                    <li><a href="#"><i class="fa fa-link"></i></a></li>
                                                    <li><a href="#"><i class="fa fa-dashboard"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="car-list">
                                            <ul class="list-inline">
                                                <li><i class="fa fa-registered"></i> 2016</li>
                                                <li><i class="fa fa-cog"></i> Manual</li>
                                                <li><i class="fa fa-dashboard"></i> 6,000 mi</li>
                                            </ul>
                                        </div>
                                        <div class="car-content">
                                            <div class="star">
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star-o orange-color"></i>
                                            </div>
                                            <a href="#">GTA 5 Lowriders DLC</a>
                                            <div class="separator"></div>
                                            <div class="price">
                                                <span class="old-price">$35,568</span>
                                                <span class="new-price">$32,698 </span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="car-item gray-bg text-center">
                                        <div class="car-image">
                                            <img class="img-fluid"
                                                 src="${pageContext.servletContext.contextPath}/images/car/04.jpg"
                                                 alt="">
                                            <div class="car-overlay-banner">
                                                <ul>
                                                    <li><a href="#"><i class="fa fa-link"></i></a></li>
                                                    <li><a href="#"><i class="fa fa-dashboard"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="car-list">
                                            <ul class="list-inline">
                                                <li><i class="fa fa-registered"></i> 2016</li>
                                                <li><i class="fa fa-cog"></i> Manual</li>
                                                <li><i class="fa fa-dashboard"></i> 6,000 mi</li>
                                            </ul>
                                        </div>
                                        <div class="car-content">
                                            <div class="star">
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star-o orange-color"></i>
                                            </div>
                                            <a href="#">Toyota avalon hybrid </a>
                                            <div class="separator"></div>
                                            <div class="price">
                                                <span class="old-price">$35,568</span>
                                                <span class="new-price">$32,698 </span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="car-item gray-bg text-center">
                                        <div class="car-image">
                                            <img class="img-fluid"
                                                 src="${pageContext.servletContext.contextPath}/images/car/05.jpg"
                                                 alt="">
                                            <div class="car-overlay-banner">
                                                <ul>
                                                    <li><a href="#"><i class="fa fa-link"></i></a></li>
                                                    <li><a href="#"><i class="fa fa-dashboard"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="car-list">
                                            <ul class="list-inline">
                                                <li><i class="fa fa-registered"></i> 2016</li>
                                                <li><i class="fa fa-cog"></i> Manual</li>
                                                <li><i class="fa fa-dashboard"></i> 6,000 mi</li>
                                            </ul>
                                        </div>
                                        <div class="car-content">
                                            <div class="star">
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star orange-color"></i>
                                                <i class="fa fa-star-o orange-color"></i>
                                            </div>
                                            <a href="#">Hyundai santa fe sport </a>
                                            <div class="separator"></div>
                                            <div class="price">
                                                <span class="old-price">$35,568</span>
                                                <span class="new-price">$32,698 </span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/notify.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/notify.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>

    $(document).ready(function () {
        $("#button").click(function () {

            let message_value = $('#message').val();
            let msg={
                "autoId" : ${auto.id},
                "message": message_value
            };
            $.ajax({
                url: 'sendMessageToUser',
                contentType: 'application/json',
                method: 'post',
                data: JSON.stringify(msg),
                success: function (data) {
                    if (data){

                        $("#button").notify("Bildiriş göndərildi");
                    }
                }
            });

        /*    $.post('/admin/sendMessageToUser?autoId='+,
                {
                    message_value
                },
                function (data) {
                    alert(data)
                }
            );*/

        })
    })


</script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/bootstrap.min.js"></script>

<!-- bootstrap -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/mega-menu/mega_menu.js"></script>

<!-- appear -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/jquery.appear.js"></script>

<!-- owl-carousel -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/owl-carousel/owl.carousel.min.js"></script>

<!-- slick -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/slick/slick.min.js"></script>

<!-- select -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/select/jquery-select.js"></script>

<!-- style customizer  -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/style-customizer.js"></script>

<!-- custom -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/custom.js"></script>
</body>
</html>

