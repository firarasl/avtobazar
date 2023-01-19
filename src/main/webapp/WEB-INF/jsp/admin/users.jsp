<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 9/10/19
  Time: 12:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="meta.jsp"/>
    <title>AutoBazar Users Admin | Dashboard</title>
    <jsp:include page="css.jsp"/>
</head>

<body class="fixed-navbar">
<div class="page-wrapper">
    <!-- START HEADER-->
    <jsp:include page="header.jsp"/>
    <!-- END HEADER-->
    <!-- START MENU-->
    <jsp:include page="side-bar.jsp"/>

    <div class="content-wrapper">
        <!-- START PAGE CONTENT-->
        <div class="page-heading">
            <h1 class="page-title">Bütün istifadəçilər</h1>
            <ol class="breadcrumb">
                <li class="breadcrumb-item">
                    <a href="/admin/">Admin Panel<i class="la la-home font-20"></i></a>
                </li>
                <li class="breadcrumb-item">
                    Menu<i class="la la-home font-20"></i></a>
                </li>
                <li class="breadcrumb-item">
                    Elanlar<i class="la la-home font-20"></i></a>
                </li>
                <li class="breadcrumb-item">
                    Bütün Elanlar<i class="la la-home font-20"></i></a>
                </li>
                <li class="breadcrumb-item">
                    Təsdiqlənən<i class="la la-home font-20"></i></a>
                </li>
            </ol>
        </div>
        <div class="page-content fade-in-up">
            <div class="ibox">
                <div class="ibox-head">
                    <div class="ibox-title">AutoBazar</div>
                </div>
                <div class="ibox-body">
                    <table class="table table-striped table-bordered table-hover" id="users"
                           cellspacing="0"
                           style="width: auto">
                        <thead>
                        <tr>
                            <th>id</th>
                            <th>Ad</th>
                            <th>Soyad</th>
                            <th>Email</th>
                            <th>Telefon1</th>
                            <th>Telefon2</th>
                            <th>Qeydiyyat tarixi</th>
                            <th>Status</th>
                            <th>Ətraflı</th>
                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>id</th>
                            <th>Ad</th>
                            <th>Soyad</th>
                            <th>Email</th>
                            <th>Telefon1</th>
                            <th>Telefon2</th>
                            <th>Qeydiyyat tarixi</th>
                            <th>Status</th>
                            <th>Ətraflı</th>
                        </tr>
                        </tfoot>
                      
                    </table>
                </div>
            </div>
        </div>
        <!-- END PAGE CONTENT-->
        <jsp:include page="footer.jsp"/>
    </div>
</div>
<!--JAVASCRIPT LINK-->
<jsp:include page="js.jsp"/>
<script>
    $(document).ready(function () {
        // $('#users').DataTable(
        //     {
        //         "processing": true,
        //         "serverSide": true,
        //         "ajax": "/datatables/user-datatable" ,
        //         "lengthMenu": [[5, 10, 25, 50, 100, -1], [5, 10, 25, 50, 100, "All"]]
        //     }
        // );
        get_auto_count_ajax();

        $('#users').DataTable({

            "lengthMenu": [[5, 10, 25, 50, -1], [5, 10, 25, 50, "All"]],
            "processing": true,
            "serverSide": true,
            "ajax": "/getAllUsers",

            "language": {
                "lengthMenu": "_MENU_ sətir elan sayı",
                "zeroRecords": "istifayedici yoxdur",
                "info": "Səhifə _PAGE_  ümumi  _PAGES_",
                "search": "Axtar",
                "infoEmpty": "Belə user yoxdur",
                "infoFiltered": "(toplam _MAX_ elan tapıldı)",
                "paginate": {
                    "previous": "Əvvəlki",
                    "next": "Sonrakı"
                }
            }
        })
    });
</script>
</body>
</html>

