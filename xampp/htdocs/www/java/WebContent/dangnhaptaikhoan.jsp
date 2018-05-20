<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>Đăng nhập tài khoản</title>

<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-te-1.4.0.min.js"
	charset="utf-8"></script>
<link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css" />
</head>
<body style="background: #eee">
	<div class="container-full">
		<section id="banner" class="banner"
			style="position: absolute; min-height: 800px;">
			<div class="bg-color">
				<nav class="navbar navbar-default navbar-fixed-top"
					style="padding: 20px; background: #fff;">
					<div class="container">
						<div class="col-md-12">
							<div class="navbar-header">
								<button type="button" class="navbar-toggle"
									data-toggle="collapse" data-target="#myNavbar">
									<span class="icon-bar"></span> <span class="icon-bar"></span> <span
										class="icon-bar"></span> <span class="icon-bar"></span>
								</button>
								<html:link action="/gd-trangchu" styleClass="navbar-brand">
									<img src="images/logo.png" class="img-responsive"
										style="width: 140px; margin-top: -16px;">
								</html:link>
							</div>
							<div class="collapse navbar-collapse navbar-left" id="myNavbar">
								<ul class="nav navbar-nav">
									<li><html:link action="/gd-trangchu" style="color: blue;">Trang Chủ</html:link></li>
								</ul>
							</div>
							<ul class="nav navbar-nav navbar-right">
								<li><html:link action="/dktk-trangchu"
										styleClass="glyphicon glyphicon-user" style="color: blue;">Đăng kí</html:link></li>
								<li><html:link action="/dn-nguoidung"
										styleClass="glyphicon glyphicon-log-in" style="color: blue;">Đăng Nhập</html:link></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</section>
	</div>
	<div class="container" style="margin-top: 120px;">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<!--  Dang ki khi chua dang nhap- -->
				<p style="color: green">
					<html:errors property="loidk" />
				</p>
				<p style="color: green">
					<html:errors property="thanhcong" />
				</p>
				<div class="panel panel-success" style="width: 380px;">
					<div class="panel-heading">
						<span class="glyphicon glyphicon-lock"></span> ĐĂNG NHẬP
					</div>
					<div class="panel-body" style="ê">
						<html:form action="/dn-nguoidung" styleClass="form-horizontal"
							method="post">
							<input type="hidden" name="convertGET" value="1">
							<div class="form-group">
							   <div></div>
								<label for="inputEmail3" class="col-sm-3 control-label">
									Email</label>
								<div class="col-sm-9">						
									<html:text property="tenDangNhap" styleClass="form-control" maxlength="50"></html:text>
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-md-3 control-label">Mật
									khẩu</label>
								<div class="col-md-9">
									<html:password property="matKhau" styleClass="form-control" maxlength="50"></html:password>
									<p style="color: red">
										<html:errors property="loiDangNhap" />
									</p>
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-3 control-label"></label>
								<div class="col-sm-9">
									<html:radio property="loaiTK" value="1">Ứng Viên</html:radio>
									<html:radio property="loaiTK" value="2">Nhà Tuyển dụng</html:radio>
								</div>
							</div>
							<div class="form-group last">
								<div class="col-sm-offset-3 col-sm-9">
									<html:submit styleClass="btn btn-success btn-sm"
										property="submit" value="submit">Đăng Nhập</html:submit>
									<html:link action="/gd-trangchu.do"
										styleClass="btn btn-default btn-sm"> Hủy</html:link>
								</div>
							</div>
						</html:form>
						<script type="text/javascript">
	              function submit(){
	            	  document.form[0].submit();
	              }
	          </script>
					</div>
					<div class="panel-footer">
						Bạn chưa có tài khoản?
						<html:link action="/dktk-trangchu"
							styleClass="glyphicon glyphicon-user">Đăng kí</html:link>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>