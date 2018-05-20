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
<title>Thêm hồ sơ</title>

<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-te-1.4.0.min.js"
	charset="utf-8"></script>
<link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
	<jsp:include page="menuungvien.jsp"></jsp:include>
	<div class="container" style="margin-left: 200px;">
		<div class="row">
			<div class="col-md-10 content">
				<div class="post">
					<div class="panel panel-primary" style="width: 800px;">
						<div class="panel-heading">
							<h3 class="panel-title">Điền Đầy Đủ thông tin trong CV Công
								Việc</h3>
						</div>
						<div class="panel-body">
							<html:form action="/taocv-ungvien" enctype="multipart/form-data">
								<div class="row col-md-12">
									<div class="col-md-4">
										<h4>Ảnh cá nhân</h4>
										<span> <img
										  src="#>"
										  width="150xp;" height="150px" />
									    </span>
										<html:file property="file"></html:file>
										<b style="color: red;"><html:errors property="anhrong" /></b>
										<h4>Chuyên Ngành:</h4>
										<html:text property="chuyenNganh" styleClass="form-control"></html:text>
										<html:hidden property="khoa" value="0" />
										<b style="color: red;"><html:errors property="rongcn" /></b>
									</div>

									<div class="col-md-8">
										<div class="col-md-12">
											<h4>Họ Tên :</h4>
											<html:text property="hoTen" styleClass="form-control"></html:text>
										</div>
										<div class="col-md-6">
											<h4>Ngày Sinh :</h4>
											<!-- 	<input type="date" name="ngaySinh" /> -->
											<html:text property="ngaySinh" styleClass="form-control"></html:text>
											<p style="color: red">
												<html:errors property="loins" />
											</p>
										</div>
										<div class="col-md-6">
											<h4>Số điện thoại :</h4>
											<html:text property="soDienThoai" styleClass="form-control"></html:text>
											<p style="color: red">
												<html:errors property="loisdt" />
											</p>
										</div>
										<div class=" col-md-6">
											<h4>Email :</h4>
											<html:text property="email" styleClass="form-control"
												readonly="true"></html:text>
										</div>
										<div class="col-md-6">
											<h4>Địa chỉ :</h4>
											<html:textarea property="diaChi" rows="5" cols="28"></html:textarea>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Mục tiêu công việc :</h4>
										<html:textarea property="mucTieuCongViec"
											styleClass="jqte-test" ></html:textarea>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Học vấn</h4>
										<html:textarea property="hocVan" styleClass="jqte-test"></html:textarea>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Kinh ngiệm làm việc</h4>
										<html:textarea property="kinhNghiem" styleClass="jqte-test"></html:textarea>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Hoạt động :</h4>
										<html:textarea property="hoatDong" styleClass="jqte-test"></html:textarea>
									</div>
								</div>

								<div class="row">
									<div class="col-xs-12">
										<h4>Chứng chỉ</h4>
										<html:textarea property="chungChi" styleClass="jqte-test"></html:textarea>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Kĩ năng</h4>
										<html:textarea property="kiNang" styleClass="jqte-test"></html:textarea>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Sở thích :</h4>
										<html:textarea property="soThich" styleClass="jqte-test"></html:textarea>
									</div>
								</div>

								<div class="row col-md-offset-4">
									<br> Thêm Hồ Sơ
									<html:submit property="submit" value="submit"
										styleClass="btn btn-success">Thêm CV</html:submit>
									<html:link action="/cvdt-ungvien.do"
										styleClass="btn btn-default">Hủy</html:link>
								</div>
							</html:form>
						</div>
					</div>
				</div>
				<!--/post-->
			</div>
			<!--/contet-->
		</div>
	</div>
	<script>
		$('.jqte-test').jqte();	
		$(document).ready(function(){
		    $('[data-toggle="tooltip"]').tooltip();   
		});
		</script>
	</script>
	<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>