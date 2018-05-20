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
<link rel="shortcut icon" href="img/favicon.png">
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link href="../css/font-awesome.min.css" rel="stylesheet">
<link href="../css/compiled.min.css" rel="stylesheet">
<link href="../css/mdb.min.css" rel="stylesheet">
<link href="../css/sweetalert.css" rel="stylesheet">

<link href="admin/css/jquery.paginate.css" rel="stylesheet"type="text/css">

<script>
            $(document).ready(function () {
                $('#dataTables-example').dataTable();
            });
    </script>
<!-- CUSTOM SCRIPTS -->
<script src="admin/js/jquery.min.js"></script>
<title>Danh sách người dùng</title>
</head>
<body>
	<jsp:include page="/admin/header.jsp"></jsp:include>
	<section id="main-content">
		<section class="wrapper">
			<div class="row" style="padding-bottom: 4px; display: inline;">
				<html:form action="/danh-SachEmployer">
					<div class="col-lg-4">
						<html:text property="tenNhaTuyenDung" styleClass="form-control"></html:text>
					</div>
					<div class="col-lg-4">
						<html:submit styleClass="btn-success pull-left">Tìm Kiếm</html:submit>
					</div>
					<div class="col-lg-3"></div>
				</html:form>
			</div>
			<!-- page start-->

			<div class="row">
				<div class="col-lg-12">
					<section class="panel">
						<header class="panel-heading" style="margin-top: 10px;">
							<div class="col-md-5"></div>
							<div class="col-md-7">
								Số Lượng Nhà Tuyển Dụng Là:
								<bean:write name="danhSachNhaTuyenDungForm" property="soLuong" />
							</div>
						</header>

						<table class="table table-striped table-advance table-hover"
							id="dataTables-example">
							<tbody>
								<tr>
									<th><i class="icon_profile"></i>Họ và tên</th>
									<th><i class="icon_mobile"></i> Số điện thoại</th>
									<th><i class="icon_mail_alt"></i> Email</th>
									<th><i class="icon_pin_alt"></i> Địa Chỉ</th>
									<th><i class="icon_internet"></i> Website</th>
									<th><i class="icon_company"></i>TenCongTY</th>
									<th><i class="icon_cogs"></i> Thực hiện</th>
								</tr>

								<logic:iterate property="listNhaTuyenDung"
									name="danhSachNhaTuyenDungForm" id="x">
									<tr>
										<td><bean:write name="x" property="tenNhaTuyenDung" /></td>
										<td><bean:write name="x" property="soDienThoai" /></td>
										<td><bean:write name="x" property="email" /></td>
										<td><bean:write name="x" property="diaChi" /></td>
										<td><bean:write name="x" property="website" /></td>
										<td><bean:write name="x" property="tenCongTY" /></td>
										<td><bean:define id="email" property="email" name="x" />
											<div class="btn-group">
												<html:link styleClass="btn btn-danger"
													action="/xoa-Employer?email=${email}"
													onclick="return confirm('Are YOu Sure ?');">
													<i class="icon_close_alt2"></i>
												</html:link>
											</div></td>
									</tr>
								</logic:iterate>

							</tbody>
						</table>


					</section>
				</div>
			</div>

			<!-- page end-->
		</section>
	</section>
	<!--main content end-->
	<!-- <script src="http://code.jquery.com/jquery-1.12.4.min.js"></script> -->
	<script src="admin/js/jquery.paginate.js"></script>
	<script>
	$(document).ready(function () {
	    $('table').paginate({
	        'elemsPerPage': 5,
	            'maxButtons': 6
	    });
	});
	</script>
</body>
</html>