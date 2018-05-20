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
<title>Sửa hồ sơ</title>

<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-te-1.4.0.min.js"
	charset="utf-8"></script>
<link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css" />

</head>
<body>
	<jsp:include page="menuungvien.jsp"></jsp:include>
	<div class="container" style="margin-left: 200px;">
		<div class="row">
			<div class="col-md-10 content">
				<div class="post">
					<div class="panel panel-primary" style="width: 800px;">
						<div class="panel-heading">
							<h3 class="panel-title">Sửa Hồ Sơ</h3>
						</div>
						<div class="panel-body">
							<html:form action="/suahoso-ungvien"
								enctype="multipart/form-data">
								<bean:define id="hoso" name="themHoSoForm" property="hoSo"></bean:define>
								<div class="row col-md-12">
									<div class="col-md-4">
										<h4>Ảnh</h4>
										<span> <img
											src="<bean:write  name="hoso"  property="anh"/>"
											width="180xp;" height="220px" /> <html:hidden name="hoso"
												property="anh" />
										</span>
										<html:file property="file"></html:file>
										<b style="background-color: red;"><html:errors
												property="anhrong" /></b>
										  <h4>Chuyên Ngành:(<span style="color: red">*</span>)</h4>
										<html:hidden name="themHoSoForm" property="maHoSo" />
										<html:text name="hoso" property="chuyenNganh"
											styleClass="form-control"></html:text>
										<html:hidden name="hoso" property="khoa" value="0" />
										<b style="color: red;"><html:errors property="rongcn" /></b>
									</div>

									<div class="col-md-8">
										<div class="col-md-12">
											<h4>Họ Tên :</h4>
											<html:text name="hoso" property="hoTen"
												styleClass="form-control"></html:text>
										</div>
										<div class="col-md-6">
											<h4>Ngày Sinh :</h4>
											<html:text name="hoso" property="ngaySinh"
												styleClass="form-control"></html:text>
											<%-- <p style="color: red"><html:errors prefix="loins"/> </p> --%>
										</div>
										<div class="col-md-6">
											<h4>Số điện thoại :</h4>
											<html:text name="hoso" property="soDienThoai"
												styleClass="form-control"></html:text>
											<p style="color: red;">
												<html:errors property="loisdt" />
											</p>
										</div>
										<div class=" col-md-6">
											<h4>Email :</h4>
											<html:text name="hoso" property="email"
												styleClass="form-control" readonly="true"></html:text>
										</div>
										<div class="col-md-6">
											<h4>Địa chỉ :</h4>
											<html:textarea name="hoso" property="diaChi" rows="5"
												cols="28"></html:textarea>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Mục tiêu công việc :</h4>
										<html:textarea name="hoso" property="mucTieuCongViec"
											styleClass="jqte-test"></html:textarea>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Học vấn</h4>
										<html:textarea name="hoso" property="hocVan"
											styleClass="jqte-test"></html:textarea>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Kinh ngiệm làm việc</h4>
										<html:textarea name="hoso" property="kinhNghiepLamViec"
											styleClass="jqte-test"></html:textarea>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Hoạt động :</h4>
										<html:textarea name="hoso" property="hoatDong"
											styleClass="jqte-test"></html:textarea>
									</div>
								</div>

								<div class="row">
									<div class="col-xs-12">
										<h4>Chứng chỉ</h4>
										<html:textarea name="hoso" property="chucChi"
											styleClass="jqte-test"></html:textarea>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Kĩ năng</h4>
										<html:textarea name="hoso" property="kiNang" styleClass="jqte-test"></html:textarea>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Sở thích :</h4>
										<html:textarea name="hoso" property="soThich"
											styleClass="jqte-test"></html:textarea>
									</div>
								</div>

								<div class="row col-md-offset-4">
									<br> Sửa Hồ Sơ
									<html:submit property="submit"
										onclick="return confirm('Bạn muốn sửa bài viết ?');"
										value="submit" styleClass="btn btn-primary">Thêm CV</html:submit>
									<html:link action="/cvdt-ungvien.do"
										styleClass="btn btn-primary">Hủy</html:link>
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
			function sua(){
				ducoment.form[0].submit();
			}
			$('.jqte-test').jqte();
		</script>
	<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>