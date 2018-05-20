<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head lang="en">
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Creative - Bootstrap 3 Responsive Admin Template">
<meta name="author" content="GeeksLabs">
<meta name="keyword"
	content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
<link rel="shortcut icon" href="admin/img/favicon.png">
  <script src="admin/js/jquery-1.8.3.min.js"></script>
<title>Register To Other Admin</title>
</head>
<body>
	<jsp:include page="/admin/header.jsp"></jsp:include>
	<section id="main-content">
          <section class="wrapper">
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                                Register
                          </header>
                          <div class="panel-body">
                              <div class="form">
                                  <html:form styleClass="form-validate form-horizontal " styleId="register_form" method="get" action="/register-Ok">
                                      <div class="form-group ">
                                          <label for="email" class="control-label col-lg-2">Email <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                          	<html:text property="email" styleId="email" styleClass="form-control"/>
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="password" class="control-label col-lg-2">Password <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                          
                                          		<html:password property="matKhau" styleClass="form-control" styleId="password"/>
										
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="confirm_password" class="control-label col-lg-2">Confirm Password <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                          		<input class="form-control " id="confirm_password" name="confirm_password" type="password" />
                                          </div>
                                      </div>
                                      <div class="form-group " style="text-align: center;">

                                          <label >
                                          
                                          	
                                        		<bean:write name="dangKyAdminForm" property="thongBao"/>
                                          	
                                          </label>
                                          
                                      </div>
                                      
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                          		<html:submit styleClass="btn btn-primary">Save</html:submit>
												<html:reset styleClass="btn btn-default" >Cancel</html:reset>
                                           </div>
                                      </div>
                                  </html:form>
                              </div>
                          </div>
                      </section>
                  </div>
              </div>
              <!-- page end-->
          </section>
      </section>
</body>
</html>