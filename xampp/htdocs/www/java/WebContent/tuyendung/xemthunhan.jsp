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
<title>Trả lời thư</title>

<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-te-1.4.0.min.js"
	charset="utf-8"></script>
<link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css" />
</head>
<body style="background: #eee">
	<div id="wrapper" style="with: 300px;">
		<div class="container"
			style="width: 800px; margin-left: 16%; margin-top: 35px;">
			<div id="box" class="row col-md-9 col-md-offset-2">
				<div class="col-sm-1"></div>
				<div class="row col-md-10" style="height: 550px">
					<h1 style="margin-left: 140px; margin-top: 90px;">Nội dung thư</h1>
					<bean:define id="thu" name="trangCVDaUngTuyenForm"
						property="thuDaGui"></bean:define>
					<div class="row">
						<div class="form-group col-md-12" style="margin-top: 30px;">
							<label class="col-md-4">Email Nhà tuyển dụng</label>
							<div class="col-md-7">
								<bean:write name="thu" property="emailNhaTuyenDung" />
							</div>
						</div>
						<div class="form-group col-md-12" style="margin-top: 10px;">
							<label class="col-md-4">Email Nhà Ứng Viên</label>
							<div class="col-md-7">
								<bean:write name="thu" property="emailNguoiTimViec" />
							</div>
						</div>
					</div>
					<div class=" row">
						<div class="form-group col-md-12">
							<label class="col-md-4">Tiêu đề</label>
							<div class="col-md-7">
								<bean:write name="thu" property="tieuDe" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-4">Ngày trả lời</label>
							<div class="col-md-7">
								<bean:write name="thu" property="ngayPhanHoi" />
							</div>

						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-4">Nội Dung thư :</label>
							<div class="col-md-7">
								<bean:write name="thu" property="noiDung" filter="false" />
							</div>

						</div>
					</div>
					<hr>
				</div>
				<div class="form-group col-md-12 col-md-offset-5">
					<bean:define id="emailNguoiTimViec" name="thu"
						property="emailNguoiTimViec" />
					<html:link
						action="/traloithu-ungtuyen?emaiNguoiTimViec=${emailNguoiTimViec}"
						styleClass="btn btn-success">Trả lời</html:link>
					<html:link action="/qlhopthu-tuyendung.do"> Trở về</html:link>
				</div>
			</div>

		</div>

	</div>
</body>
</html>