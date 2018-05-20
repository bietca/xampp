<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
	
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>Home</title>

    <!-- Bootstrap CSS -->    
    <link href="admin/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="admin/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="admin/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="admin/css/font-awesome.min.css" rel="stylesheet" />    
    <!-- full calendar css-->

    <!-- owl carousel -->
    <link rel="stylesheet" href="admin/css/owl.carousel.css" type="text/css">
	<link href="admin/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
	<link rel="stylesheet" href="admin/css/fullcalendar.css">
    <link href="admin/css/style.css" rel="stylesheet">
    <link href="admin/css/style-responsive.css" rel="stylesheet" />
	<link href="admin/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
	
	
	
 </head>
<body>
	<header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
            </div>
            <!--logo start-->
            <html:link action="/danh-SachCadidate" styleClass="logo" ><i class="icon_house_alt"></i> Nice <span class="lite">Admin</span></html:link>
            <!--logo end-->
            <div class="top-nav notification-row">
                <ul class="nav pull-right top-menu">
                    
                   <!--  <li>
                        <a href="trangCaNhan.html"><i class="icon_desktop"></i>Trang chủ</a>
                    </li> -->
                    <li>
                    	<html:link action="/dangXuat" ><i class="icon_key_alt"></i> Đăng xuất</html:link>
                    </li>
                </ul>
            </div>
    </header>  
    <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_book_alt"></i>
                               <span>QL Người dùng</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">                          
                          <li><html:link action="/danh-SachEmployer" >Nhà tuyển dụng</html:link></li>
                          <li><html:link action="/danh-SachCadidate" >Người tìm việc</html:link></li>
                      </ul>
                  </li>       
                  <li >
                  		
                     <%--    <html:link action="/register-Ok" >
                          <i class="icon_plus_alt"></i>
                          <span>Quản lý tài khoản</span>
                      </html:link> --%>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_documents_alt"></i>
                          <span>Quản lý Bài Viết</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">        
                          <li><html:link action="/danh-sachbaiviet" >Danh sách bài viết</html:link></li>                  
                       <!--    <li><a class="" href=""><span>Bài viết hết hạn</span></a></li> -->
                      </ul>
                  </li>
                  <li >
                  		
                        <html:link action="/thongKe" >
                          <i class="fa fa-book fa-fw"></i>
                          <span>Thống kê</span>
                      </html:link>
                  </li>
              </ul>
              <!-- sidebar menu end-->
          </div>
    </aside>
        
<!--   container section end -->

<!--     <script src="js/jquery.js"></script> -->
<!--     <script src="js/jquery-ui-1.10.4.min.js"></script> -->
  
    <script type="text/javascript" src="admin/js/jquery-ui-1.9.2.custom.min.js"></script>
    <script src="admin/js/bootstrap.min.js"></script>
<!--     nice scroll -->
    <script src="admin/js/jquery.scrollTo.min.js"></script>
    <script src="admin/js/jquery.nicescroll.js" type="text/javascript"></script>
    
    
<!--     script for this page only -->
    <script src="admin/js/jquery.rateit.min.js"></script>
<!--     custom select -->
    <script src="admin/js/jquery.customSelect.min.js" ></script>
   
   <!--  custome script for all page -->
    <script src="admin/js/scripts.js"></script>
  <!--   custom script for this page -->
    <script src="admin/js/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="admin/js/jquery-jvectormap-world-mill-en.js"></script>
    <script src="admin/js/jquery.autosize.min.js"></script>
    <script src="admin/js/jquery.placeholder.min.js"></script>
    <script src="admin/js/gdp-data.js"></script>  
    <script src="admin/js/morris.min.js"></script>
    <script src="admin/js/sparklines.js"></script>    
    <script src="admin/js/jquery.slimscroll.min.js"></script>
  	
  	

	
  </body>
</html>
