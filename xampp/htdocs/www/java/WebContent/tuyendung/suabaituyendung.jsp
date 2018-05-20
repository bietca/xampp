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
<title>Sửa bài tuyển dụng</title>

<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-te-1.4.0.min.js"
	charset="utf-8"></script>
<link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css" />
</head>
<body style="background: #eee">
	<jsp:include page="menunhatuyendung.jsp"></jsp:include>
	<div id="wrapper">
		<div class="container" style="margin-top: 20px;">
			<h3 class="col-md-offset-5">Sửa Bài tuyển dụng mới</h3>
		</div>
		<div class="container"
			style="margin-top: 45px; background: #fff; width: 900px;">
			<html:form action="/suabai-tuyendung">
				<bean:define id="tdung" property="baiTuyenDung1"
					name="themBaiTuyenDungForm"></bean:define>
				<div id="box" class="row">
					<div class="col-sm-1"></div>
					<div class="row col-md-10">
						<div class="row">
							<div class="form-group col-md-12" style="margin-top: 10px;">
								<label>Tiêu đề</label>
								<html:text name="tdung" property="tieuDe"
									styleClass="form-control"></html:text>
								<p style="background: red">
									<html:errors property="loiRong" />
								<p>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="form-group col-md-4">
								<label>Chọn tối đa 3 ngành nghề</label>
								<html:select property="maNganh" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listNganh" value="maNganh" label="tenNganh" />
								</html:select>

							</div>
							<div class="form-group col-md-4">
								<label></label>
								<html:select property="maNganh1" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listNganh" value="maNganh" label="tenNganh" />
								</html:select>

							</div>
							<div class="form-group col-md-4">
								<label></label>
								<html:select property="maNganh2" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listNganh" value="maNganh" label="tenNganh" />
								</html:select>

							</div>
						</div>
						<hr>
						<div class="row">
							<div class="form-group col-md-4">
								<label>Chọn tối đa 3 nơi làm việc</label>
								<html:select property="maNoiLamViec" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listNoiLamViec" value="maNoiLamViec"
										label="tenNoiLamViec" />
								</html:select>
							</div>
							<div class="form-group col-md-4">
								<label> </label>
								<html:select property="maNoiLamViec1" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listNoiLamViec" value="maNoiLamViec"
										label="tenNoiLamViec" />
								</html:select>
							</div>
							<div class="form-group col-md-4">
								<label></label>
								<html:select property="maNoiLamViec2" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listNoiLamViec" value="maNoiLamViec"
										label="tenNoiLamViec" />
								</html:select>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="form-group col-md-4">
								<label>Số lượng</label>
								<html:text name="themBaiTuyenDungForm"
									property="soLuongCanTuyen" styleClass="form-control"></html:text>

							</div>
							<div class="form-group col-md-4">
								<label>Cấp bậc</label>
								<html:select property="maTD" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listCapBac" value="maCapBac" label="tenCapBac" />
								</html:select>
							</div>
							<div class="form-group col-md-4">
								<label>Loại hình làm việc</label>
								<html:select property="maLoaiCongViec" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listLoaiCongViec" value="maLoaiCongViec"
										label="tenLoaiCongViec" />
								</html:select>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-4">
								<label>Kinh Nghiệm Làm việc</label>
								<html:select property="maKinhNghiem" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listKinhNghiem" value="maKinhNghiem"
										label="tenKinhNghiem" />
								</html:select>
							</div>
							<div class="form-group col-md-4">
								<label>Giớ tính</label>
								<html:select property="gioiTinh" styleClass="form-control">
									<option value="1">Không phân biệt</option>
									<option value="2">Nam</option>
									<option value="3">Nu</option>
								</html:select>
							</div>
							<div class="form-group col-md-4">
								<label>Mức lương</label>
								<html:select property="maLuong" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listLuong" value="maLuong" label="tenLuong" />
								</html:select>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="form-group col-md-6">
								<div>
									<label>Han Nộp Hồ sơ</label>
									<%-- <html:text name="themBaiTuyenDungForm"  property="hanNopHoSo" styleClass="form-control"></html:text> --%>
									<input type="date" name="hanNopHoSo" class="form-control">
									<p style="background: red">
										<html:errors property="loiNgay" />
									</p>
								</div>
								<div class="form-group col-md-12">
									<label>Người nhận hồ sơ</label>
									<html:text name="themBaiTuyenDungForm"
										property="tenNguoiNhanHoSo" styleClass="form-control"></html:text>
								</div>
							</div>
							<div>
								<div class="form-group col-md-6">
									<label>Số điện thoại</label>
									<html:text name="themBaiTuyenDungForm" property="soDienThoai"
										styleClass="form-control"></html:text>
									<html:errors property="loiSDT" />
								</div>
								<div class="form-group col-md-6">
									<label>Email</label>
									<html:text name="themBaiTuyenDungForm" property="email"
										styleClass="form-control" readonly="true"></html:text>
								</div>
							</div>

						</div>
						<div class="row">
							<div class="form-group col-md-4">
								<label>Chọn 3 Kĩ Năng</label> <label>Kĩ Năng</label>
								<html:select property="kyNang" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listKiNang" label="tenKiNang" value="maKiNang" />
								</html:select>
							</div>
							<div class="form-group col-md-4">
								<label></label>
								<html:select property="kyNang1" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listKiNang" label="tenKiNang" value="maKiNang" />
								</html:select>
							</div>
							<div class="form-group col-md-4">
								<label></label>
								<html:select property="kyNang2" styleClass="form-control">

									<html:optionsCollection name="themBaiTuyenDungForm"
										property="listKiNang" label="tenKiNang" value="maKiNang" />
								</html:select>
								<html:hidden property="luotxem" value="0" />
								<html:hidden property="trangthai" value="0" />
							</div>
						</div>

						<div class="form-group col-md-12">
							<label>Mô Tả công việc</label>
							<html:textarea property="motaCongViec" styleClass="jqte-test"></html:textarea>
						</div>
						<div class="form-group col-md-12">
							<label>Yêu cầu ứng viên</label>
							<html:textarea property="yeuCauUngVien" styleClass="jqte-test"></html:textarea>
						</div>

						<div class="form-group col-md-12	">
							<label>Quyền lợi ứng viên</label>
							<html:textarea property="quyenLoiUngVien" styleClass="jqte-test"></html:textarea>
						</div>
						<div class="form-group col-md-12">
							<label>Giới thiệu ngắn về công ty</label>
							<html:textarea property="gioiThieuCty" styleClass="jqte-test"></html:textarea>
						</div>

						<hr>
						<div class="form-group col-md-12">
							<html:submit property="submit" value="submit"
								alt="Thêm Bài Tuyển Dụng" styleClass="btn btn-success">Thêm Bài tuyển dụng</html:submit>
							<html:link action="/qlbtuyendung-tuyendung"> Về trang quản lý</html:link>
						</div>

					</div>
				</div>
			</html:form>
		</div>
		<script>
	   
		$('.jqte-test').jqte();
		</script>
	</div>
</body>
</html>