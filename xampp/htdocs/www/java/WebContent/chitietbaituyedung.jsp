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
<title>thông tin chi tiết</title>

<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body style="background:rgba(208, 208, 208, 0.88); margin-top: 110px;">
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="wrapper">

		<div class="container" style="margin-top: 45px; background: #fff;">

			<div id="main">
				<bean:define id="baiviet" name="danhSachBaiTuyenDungForm"
					property="baiTuyenDung"></bean:define>
				<div id="job-page-wraper">
					<div class="container">
						<div class="box box-white">
							<div class="row">
								<div class="col-md-9">
									<div class="row">
										<div class="col-md-3">
											<div class="company-logo-wraper text-center">
												<a href="#"
													title="C&ocirc;ng ty Dai-ichi Life Nh&acirc;̣t Bản"><img
													class="company-logo" src="images/cty.jpg"
													alt="C&ocirc;ng ty Dai-ichi Life Nh&acirc;̣t Bản"
													style="width: 150px; height: 150px;"></a>
											</div>
										</div>
										<div class="col-md-9">
											<h1 class="job-title text-highlight bold">
												<bean:write name="baiviet" property="tieuDe" filter="false" />
											</h1>
											<html:hidden name="baiviet" property="maBaiViet" />

										</div>
										<div class="col-xs-3 col-sm-3">
											<i><b>Ngành nghề :</b></i>
											<bean:write name="baiviet" property="nganh" />
										</div>
										<div class="col-xs-3 col-sm-3">
											<i>Lược xem :</i>
											<bean:write name="baiviet" property="luotXem" />
										</div>
									</div>
									<div class="job-meta text-dark-gray"
										style="margin-bottom: 20px; width: 1000px;">
										<div class="row ">
											<div class="col-xs-12 col-sm-2" style="margin-left: 100px;">
												<i class="glyphicon glyphicon-list-alt"></i>
												<bean:write name="baiviet" property="hanNopHoSo" />
											</div>
											<div class="col-xs-12 col-sm-2">
												<i class="glyphicon glyphicon-usd"></i>
												<bean:write name="baiviet" property="luong" />
											</div>
											<div class="col-xs-12 col-sm-4">
												<i class="glyphicon glyphicon-home"></i>
												<bean:write name="baiviet" property="noiLamViec" />
											</div>
											<div class="col-xs-12 col-md-2">
												<i class="glyphicon glyphicon-bed"></i>
												<bean:write name="baiviet" property="loaiHinhLamViec" />
											</div>

										</div>
									</div>
								</div>

								<div class="col-md-3" style="margin-top: 15px">
									<div class="text-center">
										<bean:define id="maBaiViet" name="baiviet"
											property="maBaiViet"></bean:define>
										<html:link action="/ungtuyennhanh?maBaiViet=${maBaiViet}"
											styleClass="btn btn-primary">
													Ứng tuyển Nhanh
												</html:link>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="container" style="margin-top: 30px;">
			<div class="row col-md-9" style="background: #fff">
				<div class="content col-md-12 col-sm-9 ">
					<div class="container">
						<div class="row">
							<div class="col-md-8" id="col-job-left">
								<div class="box box-white">
									<h3 class="text-dark-gray">Mô tả công việc</h3>
									<div class="text-dark-gray">
										<p style="color: black;">
											<bean:write name="baiviet" property="motaCongViec"
												filter="false" />
										</p>
									</div>
									<hr>
									<hr>
									<div class="skill-tags">
										<a href="javascript:void(0)">Kĩ năng : <bean:write
												name="baiviet" property="kyNang" /></a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="row col-md-9" style="background: #fff">
					<div class="content col-md-12 col-sm-9 ">
						<div class="container">
							<div class="row">
								<div class="col-md-8" id="col-job-left">
									<div class="box box-white">
										<h3 class="text-dark-gray">Yêu cầu ứng viên</h3>
										<div class="text-dark-gray">
											<p style="color: black;">
												<bean:write name="baiviet" property="yeuCauUngVien"
													filter="false" />
											</p>
										</div>
										<hr>
										<div class="skill-tags">
											<a href="#">Kinh nghiệm : <bean:write name="baiviet"
													property="kinhghiem" /></a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<hr>
					<div class="content col-md-12 col-sm-9 ">
						<div class="container">
							<div class="row">
								<div class="col-md-8" id="col-job-left">
									<div class="box box-white">
										<h3 class="text-dark-gray">Quyền lợi ứng viên</h3>
										<div class="text-dark-gray">
											<p style="color: black;">
												<bean:write name="baiviet" property="quyenLoiUngVien"
													filter="false"/>
											</p>
										</div>
										<hr>
										<div class="skill-tags">
											<a href="javascript:void(0)">Lương : <bean:write
													name="baiviet" property="luong" />
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<hr>
					<div class="content col-md-12 col-sm-9 ">
						<div class="container">
							<div class="row">
								<div class="col-md-8" id="col-job-left">
									<div class="box box-white">
										<h3 class="text-dark-gray">Giới thiệu về chúng tôi</h3>

										<div class="text-dark-gray">
											<b> Người nhận hồ sơ :<bean:write name="baiviet"
													property="tenNguoiNhanHoSo" />
											</b>
										</div>
										<div class="text-dark-gray">
											<b> Số Điện Thoại :<bean:write name="baiviet"
													property="soDienThoai" />
											</b>
										</div>
										<div class="text-dark-gray">
											<b> Email :<bean:write name="baiviet" property="email" />
											</b>
										</div>
										<hr>

									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
			<!--/container -->
			<div class="sidebar">
				<div class="sidebar-item col-md-3"
					style="margin-left: 20px; border-color: black;">
					<h4 class="widget-title">Bài Tuyển Dụng mới</h4>
					<div class="textwidget">
						<logic:iterate name="danhSachBaiTuyenDungForm"
							property="baiTuyenDungs" id="baiviet1">
							<div class="other-post-item"
								style="background: #fff; border: #d06767; padding: 10px; border: 1px solid rgba(66, 117, 89, 0.66);"">
								<div class="other-post-img">
									<a href="#"><img src="images/cty5.jpg"
										style="height: 80px; border: 1px solid rgba(66, 117, 89, 0.66);"></a>
								</div>
								<div class="other-post-info">
									<b><html:link
											action="/ct-baituyendung?maBaiViet=${maBaiViet}">
											<bean:write name="baiviet1" property="tieuDe" />
										</html:link></b> <b>Lương:</b>
									<bean:write name="baiviet1" property="luong" />
									<br> <b>Hạn DK :</b>
									<bean:write name="baiviet" property="hanNopHoSo" />

								</div>
							</div>
						</logic:iterate>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>