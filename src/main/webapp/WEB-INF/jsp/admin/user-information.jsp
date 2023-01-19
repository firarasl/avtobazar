<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: itcity.academy
  Date: 9/18/2019
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="meta.jsp"/>
    <title>APPROVED AUTOS | ADMIN DASHBOARD</title>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script src="//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">

    <jsp:include page="css.jsp"/>
</head>

<body class="fixed-navbar">
<div class="page-wrapper">
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
                            <div class="ibox-title">Istifadecinin melumatlari</div>
                        </div>
                        <div class="ibox-body">
                            <table class="table table-striped table-bordered table-hover" id="usertable"
                                   cellspacing="0"
                                   width="100%">
                                <tr>
                                    <th>Istifadecinin id-si:</th>
                                    <c:choose>
                                    <c:when test="${not empty optionalUser}">
                                    <td>
                                            ${optionalUser.id}
                                    </td>

                                </tr>
                                <tr>
                                    <th>Istifadecinin adi:</th>
                                    <td>${optionalUser.name}</td>
                                </tr>
                                <tr>
                                    <th>Istifadecinin soyadi:</th>
                                    <td>${optionalUser.surname}</td>
                                </tr>
                                <tr>
                                    <th>Istifadecinin emaili:</th>
                                    <td>${optionalUser.email}</td>
                                </tr>
                                <tr>
                                    <th>Istifadecinin 1-ci telefonu:</th>
                                    <td><span class="glyphicon glyphicon-earphone"> </span> ${optionalUser.mobile1}</td>
                                </tr>
                                <tr>
                                    <th>Istifadecinin 2-ci telefonu:</th>
                                    <td>
                                        <c:choose>
                                            <c:when test="${not empty optionalUser.mobile2}">
                                                <span class="glyphicon glyphicon-earphone"> </span>  ${optionalUser.mobile2}</c:when>
                                            <c:otherwise><p style="color: darkred"> Istifadecinin 2ci nomresi
                                                yoxdu</p></c:otherwise>
                                        </c:choose></td>
                                </tr>
                                <tr>
                                    <th>Istifadecinin qeydiyyat tarxi:</th>
                                    <td>${optionalUser.registrationDate}</td>
                                </tr>
                                <tr>
                                    <th>Istifadecinin statusu:</th>
                                    <td>${optionalUser.status}</td>
                                </tr>
                                </c:when>
                                <c:otherwise> idsi yoxdu</c:otherwise>
                                </c:choose>
                            </table>
                        </div>
                    </div>


<%--car info--%>
<c:choose>
    <c:when test="${not empty autoList}">


                    <div class="ibox">
                        <div class="ibox-head">
                            <div class="ibox-title">Auto Detail</div>
                        </div>
                        <div class="ibox-body">
                            <table class="table table-striped table-bordered table-hover" id="usersAuto"
                                   cellspacing="0"
                                   width="100%">
                                <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Marka</th>
                                    <th>Model</th>
                                    <th>İl</th>
                                    <th>Yürüş (km)</th>
                                    <th>Mühərrik</th>
                                    <th>Şəhər</th>
                                    <th>Yerləşdirmə tarixi</th>
                                    <th>Info</th>
                                </tr>
                                </thead>
<tbody>
                <c:forEach items="${autoList}" var="auto">
                <tr>
                <td>${auto.id}</td>
                <td>${auto.brand.name}</td>
                <td>${auto.model.name}</td>
                <td>${auto.year}</td>
                <td>${auto.mileage}</td>
                <td>${auto.engine}</td>
                <td>${auto.city.name}</td>
                <td>${auto.createDateTime}</td>
                <td><a href="getMediaByAutoId?id=${auto.id}">Ətraflı</a> </td>
                </tr>
                </c:forEach>


</tbody>
                                <tfoot>
                                <tr>
                                    <th>Id</th>
                                    <th>Marka</th>
                                    <th>Model</th>
                                    <th>İl</th>
                                    <th>Yürüş (km)</th>
                                    <th>Mühərrik</th>
                                    <th>Şəhər</th>
                                    <th>Yerləşdirmə tarixi</th>
                                    <th>Info</th>
                                </tr>
                                </tfoot>
                            </table>
                        </div>
                    </div>
                    </c:when>
    <c:otherwise>
        <h5>Bu istifadecinin mashini yoxdu!</h5>
    </c:otherwise>
                    </c:choose>

                </div>
            </div>
            <jsp:include page="footer.jsp"/>
        </div>
    </div>
    <jsp:include page="js.jsp"/>
    <script>
        $(document).ready(function () {

            // to add badges
            get_auto_count_ajax();
            $('#usersAuto').DataTable();
        })
    </script>
</body>
</html>


