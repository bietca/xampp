<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head lang="en">
</head>
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
								<li><a href="#timkiem" style="color: blue;">Tìm Việc</a></li>
								<li><a href="#baiviet" style="color: blue;">Tất Cả bài
										tuyển dụng</a></li>
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