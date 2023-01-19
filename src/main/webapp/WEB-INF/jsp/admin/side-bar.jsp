<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 9/9/19
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="page-sidebar" id="sidebar">
    <div id="sidebar-collapse">
        <div class="admin-block d-flex">
            <div>
                <img src="${pageContext.servletContext.contextPath}/assets/img/admin-avatar.png" width="64"/>
            </div>
            <div class="admin-info">
                <div class="font-strong">Anar Gasimov</div>
                <small>Administrator</small></div>
        </div>
        <ul class="side-menu metismenu">
            <li>
                <a class="active" href="/admin"><i class="sidebar-item-icon fa fa-th-large"></i>
                    <span class="nav-label">Admin Panel</span>
                </a>
            </li>
            <li class="heading">Menu</li>
            <li>
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-list-alt"></i>
                    <span class="nav-label">Elanlar</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse">
                    <li>
                        <a href="javascript:;">
                            <span class="nav-label">Bütün Elanlar</span><i class="fa fa-angle-left arrow"></i></a>
                        <ul class="nav-3-level collapse">
                            <li>
                                <a href="/admin/all">Hamısı</a>
                            </li>

                            <li>
                                <a href="/admin/approvedAutos">Təsdiqlənən
<%--                                    <span id="approved" class="badge">0</span>--%>
                                    <span class="pull-right-container"><span id="approved" class="label label-success pull-right">0</span>
            </span>
                                </a>
                            </li>
                            <li>
                                <a href="/admin/pendingAutos">Gözləyən
<%--                                    <span id="pending" class="badge">0</span>--%>
                                    <span class="pull-right-container"><span id="pending" class="label label-danger pull-right">0</span>
            </span>
                                </a>
                            </li>
                            <li>
                                <a href="/admin/all-vip">VIP</a>
                            </li>
                        </ul>
                    </li>

                    <li>
                        <a href="javascript:;">
                            <span class="nav-label"></span>Avtosalon Elanları<i class="fa fa-angle-left arrow"></i></a>
                        <ul class="nav-3-level collapse">
                            <li>
                                <a href="#">Hamısı</a>
                            </li>
                            <li>
                                <a href="#">Yeni</a>
                            </li>
                            <li>
                                <a href="#">Təsdiqlənən</a>
                            </li>
                            <li>
                                <a href="#">İcazə verilməyən</a>
                            </li>
                            <li>
                                <a href="#">Premium</a>
                            </li>
                            <li>
                                <a href="#">VIP</a>
                            </li>
                            <li>
                                <a href="#">Adi</a>
                            </li>
                        </ul>
                    </li>

                    <li>
                        <a href="javascript:;">
                            <span class="nav-label"></span>İstifadəçi Elanları<i class="fa fa-angle-left arrow"></i></a>
                        <ul class="nav-3-level collapse">
                            <li>
                                <a href="#">Hamısı</a>
                            </li>
                            <li>
                                <a href="#">Yeni</a>
                            </li>
                            <li>
                                <a href="#">Təsdiqlənən</a>
                            </li>
                            <li>
                                <a href="#">İcazə verilməyən</a>
                            </li>
                            <li>
                                <a href="#">Premium</a>
                            </li>
                            <li>
                                <a href="#">VIP</a>
                            </li>
                            <li>
                                <a href="#">Adi</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-users"></i>
                    <span class="nav-label">İstifadəçilər</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse">
                    <li>
                        <a href="/admin/users">Bütün istifadəçilər
                            <span class="pull-right-container"><span id="istifadeciler" class="label label-danger pull-right">0</span></span>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-car "></i>
                    <span class="nav-label">Avtosalonlar</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse">
                    <li>
                        <a href="charts_flot.html">Flot Charts</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="calendar.html"><i class="sidebar-item-icon fa fa-envelope"></i>
                    <span class="nav-label">Mesajlar</span>
                </a>
            </li>
            <li>
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-edit"></i>
                    <span class="nav-label">Redaktə</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse">
                    <li>
                        <a href="form_basic.html">Basic Forms</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-user-secret"></i>
                    <span class="nav-label">Adminlər</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse">
                    <li>
                        <a href="maps_vector.html">AvtoBazar Adminləri</a>
                    </li>
                    <li>
                        <a href="maps_vector.html">Avtosalon Adminləri</a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-user-md"></i>
                    <span class="nav-label">Moderatorlar</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse">
                    <li>
                        <a href="mailbox.html">AvtoBazar Moderatorları</a>
                    </li>
                    <li>
                        <a href="mailbox.html">Avtosalon Moderatorları</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="calendar.html"><i class="sidebar-item-icon fa fa-bullhorn"></i>
                    <span class="nav-label">Reklamlar</span>
                </a>
            </li>
            <li>
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-file-text"></i>
                    <span class="nav-label">Səhifələr</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse">
                    <li>
                        <a href="invoice.html">Invoice</a>
                    </li>
                    <li>
                        <a href="profile.html">Profile</a>
                    </li>

                </ul>
            </li>
        </ul>
    </div>
</nav>