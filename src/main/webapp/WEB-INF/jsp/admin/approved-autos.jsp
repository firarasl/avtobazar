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
                            <div class="ibox-title">Son əlavə edilən elanlar</div>
                        </div>
                        <div class="ibox-body">
                            <table class="table table-striped table-bordered table-hover" id="example-table"
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

            $('#example-table').DataTable({

                "lengthMenu": [[5, 10, 25, 50, -1], [5, 10, 25, 50, "All"]],
                "processing": true,
                "serverSide": true,
                "ajax": "/getApprovedAutos",

                "language": {
                    "lengthMenu": "_MENU_ sətir elan sayı",
                    "zeroRecords": "heç bir elan yoxdur",
                    "info": "Səhifə _PAGE_  ümumi  _PAGES_",
                    "search": "Axtar",
                    "infoEmpty": "Belə elan yoxdur",
                    "infoFiltered": "(toplam _MAX_ elan tapıldı)",
                    "paginate": {
                        "previous": "Əvvəlki",
                        "next": "Sonrakı"
                    }
                }
            })
        })
    </script>
</body>
</html>


