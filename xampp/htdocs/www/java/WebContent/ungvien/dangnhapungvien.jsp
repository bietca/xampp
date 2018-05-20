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
<title>Đăng nhập ứng viên</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-te-1.4.0.min.js"
	charset="utf-8"></script>
<link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css" />
</head>
<body style="background: #eee">
	<jsp:include page="/menu.jsp"></jsp:include>
	<div class="container" style="margin-top: 120px;">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-success">
					<div class="panel-heading">
						<span class="glyphicon glyphicon-lock"></span> ĐĂNG NHẬP
					</div>
					<div class="panel-body">
						<html:form action="/dn-ungvien" styleClass="form-horizontal"
							method="post">
							<input type="hidden" name="convertGET" value="1">
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-3 control-label">
									Email</label>
								<div class="col-sm-9">
									<html:text property="tenDangNhap" styleClass="form-control"></html:text>
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-3 control-label">
									Password</label>
								<div class="col-sm-9">
									<html:password property="matKhau" styleClass="form-control"></html:password>
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-3 control-label"></label>
								<div class="col-sm-9">
									<input type="checkbox" value="1" checked="checked" />Ứng Viên <input
										type="checkbox" value="2" />Nhà tuyển dụng
								</div>
							</div>
							<div class="form-group last">
								<div class="col-sm-offset-3 col-sm-9">
									<html:submit styleClass="btn btn-success btn-sm" value="submit">Đăng Nhập</html:submit>
									<a href="#"><button type="reset"
											class="btn btn-default btn-sm">Hủy</button></a>
								</div>
							</div>
						</html:form>
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