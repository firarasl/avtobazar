<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: firar
  Date: 9/26/2019
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="meta.jsp"/>
    <title>APPROVED AUTOS | ADMIN DASHBOARD</title>
    <jsp:include page="css.jsp"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

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
                            <div class="ibox-title">Yeni Brandi əlavə et</div>
                        </div>
                        <div class="ibox-body">

                           <form action="/admin/insertBrand" method="get">
                               <label for="valueName">Brandin adini ver</label>
                               <input name="brand" class="form-control" type="text" id="valueName">

                               <br/>
                               <label for="sel1"> Statusu sec</label>
                               <select class="form-control" name="status" id="sel1" name="sellist1">
                                   <option value="1">1</option>
                                   <option value="0">0</option>
                               </select>
                               <br/>

                               <input value="Gonder!" class="btn btn-primary" type="submit">
                           </form>

                            <hr>

                            <form action="/admin/insertModel" method="get">
                                <label for="input2">Brandin adini ver</label>
                                <input name="model" class="form-control" type="text" id="input2">

                                <br/>
                                <label for="select2"> Statusu sec</label>
                                <select class="form-control" name="status" id="select2" name="status">
                                    <option value="1">1</option>
                                    <option value="0">0</option>
                                </select>
                                <br/>

                                <input value="Gonder!" class="btn btn-primary" type="submit">
                            </form>



                        </div>
                    </div>
                </div>
            </div>
            <jsp:include page="footer.jsp"/>
        </div>
    </div>
    <jsp:include page="js.jsp"/>
</div>
</body>
</html>
