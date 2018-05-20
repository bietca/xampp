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
<title>Quản Lý Ứng Viên</title>
</head>
<div class="container-full">
	<div class="header-menu">
		<nav class="navbar navbar-default"
			style="line-height: 20px; padding: 14px 18px; font-size: 14px; background: #fff;">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<img class="navbar-brand" alt="" src="images/logo.png">
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><html:link action="/tc-ungvien" style="color: blue;">Trang Chủ</html:link></li>
					<%-- <li><html:link action="/cn-ungvien" style="color: blue;">Trang Chủ</html:link></li> --%>
					<li><html:link action="/cn-ungvien" style="color: blue;">Trang Cá Nhân</html:link></li>
					<li><html:link action="/cvdt-ungvien" style="color: blue;">Quản lý hồ sơ</html:link></li>
					<li><html:link action="/cvut-ungvien" style="color: blue;">Hộp thư</html:link></li>
					
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><html:link action="/dxuat-trangchu"
							onclick="return confirm('Bạn muốn đăng xuất không ?');"
							styleClass="glyphicon glyphicon-log-out">Đăng xuất</html:link></li>
				</ul>
				
			</div>

		</nav>
		<!-- End Menu Bootstrap -->
	</div>
</div>