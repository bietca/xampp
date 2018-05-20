<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Đăng nhập Admin</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="admin/img/favicon.png">
    
    <!-- Bootstrap CSS -->    
    <link href="admin/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="admin/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="admin/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="admin/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles -->
    <link href="admin/css/style.css" rel="stylesheet">
    <link href="admin/css/style-responsive.css" rel="stylesheet" />

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
   		 	
    </script>
</head>

  <body class="login-img3-body">

    <div class="container">

      <html:form styleClass="login-form" action="/login-admin">        
        <div class="login-wrap">
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <html:text  styleClass="form-control" property="tenDangNhap" styleId="textForm"/>
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <html:password  styleClass="form-control" property="matKhau" styleId="passworktForm"/>
            </div>
            <html:submit styleClass="btn btn-primary btn-lg btn-block" >Login</html:submit>
        </div>
        <label class="checkbox">
                <span class="pull-left">
                	<bean:write name="loginAdminForm" property="thongBao"/>
                </span>
        </label>
      </html:form>
      </div>
    	    <!-- javascripts -->
		    <script src="js/jquery.js"></script>
		    <script src="js/bootstrap.min.js"></script>
		    <!-- nice scroll -->
		    <script src="js/jquery.scrollTo.min.js"></script>
		    <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
		    <!-- jquery validate js -->
		    <script type="text/javascript" src="js/jquery.validate.min.js"></script>
		
		    <!-- custom form validation script for this page-->
		    <script src="js/form-validation-script.js"></script>
		    <!--custome script for all page-->
		    <script src="js/scripts.js"></script>    
    	<script type="text/javascript">
		    $(function() {
		        $("#textForm").attr("placeholder", "Username");
		        $("#passworktForm").attr("placeholder", "Password");
		        
		    });
		    window.onload = function(){
	    		document.getElementsById("#textForm").focus();
	    	}
		    
    	</script>
     </body>
    
</html>