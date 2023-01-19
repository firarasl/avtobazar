<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 9/9/19
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <jsp:include page="meta.jsp"/>
    <title>Error-404</title>
    <!-- GLOBAL MAINLY STYLES-->
    <link href="${pageContext.servletContext.contextPath}/assets/vendors/bootstrap/diststatic/css/bootstrap.min.css" rel="stylesheet" />
    <!-- THEME STYLES-->
    <link href="${pageContext.servletContext.contextPath}assetsstatic/css/main.css" rel="stylesheet" />
</head>

<body class="bg-silver-100">
<div class="content">
    <h1 class="m-t-20">404</h1>
    <p class="error-title">SEHİFE TAPILMADI</p>
    <p class="m-b-20">Bağışlayın, axtardığınız səhifə tapılmadı.
        <a class="color-green" href="?action=index"> Əsas səhifəyə keçin</a></p>
</div>
<style>
    .content {
        max-width: 450px;
        margin: 0 auto;
        text-align: center;
    }

    .content h1 {
        font-size: 160px;
        color: #ff0000;
    }

    .error-title {
        font-size: 22px;
        font-weight: 500;
        margin-top: 30px
    }
</style>
<!-- BEGIN PAGA BACKDROPS-->
<div class="sidenav-backdrop backdrop"></div>
<div class="preloader-backdrop">
    <div class="page-preloader"></div>
</div>
<!-- END PAGA BACKDROPS-->
<!-- CORE PLUGINS -->
<script src="${pageContext.servletContext.contextPath}/assets/vendors/jquery/dist/jquery.min.js" type="text/javascript"></script>
<script src="${pageContext.servletContext.contextPath}/assets/vendors/popper.js/dist/umd/popper.min.js" type="text/javascript"></script>
<script src="${pageContext.servletContext.contextPath}/assets/vendors/bootstrap/dist/js/bootstrap.min.js" type="text/javascript"></script>
<!-- CORE SCRIPTS-->
<script src="${pageContext.servletContext.contextPath}assets/js/app.js" type="text/javascript"></script>
</body>

</html>
