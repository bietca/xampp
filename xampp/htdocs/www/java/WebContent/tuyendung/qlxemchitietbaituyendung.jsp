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
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script src="js/bootstrap.min.js"></script>
</head>
<body style="background: #eee">
	<jsp:include page="menunhatuyendung.jsp"></jsp:include>
	<div id="wrapper">
		<div class="container" style="margin-top: 20px;"></div>
		<div class="container"
			style="margin-top: 25px; background: #fff; width: 1000px;">
			<div id="main">
				<bean:define id="baiviet" name="danhSachBaiTuyenDungForm"
					property="baiTuyenDung"></bean:define>
				<div id="job-page-wraper">
					<!-- 	<div class="container"> -->
					<div class="box box-white">
						<!-- 	<div class="row"> -->
						<div class="col-md-9">
							<div class="row">
								<div class="col-md-3">
									<div class="company-logo-wraper text-center">
										<a href="#"
											title="C&ocirc;ng ty Dai-ichi Life Nh&acirc;̣t Bản"><img
											class="company-logo" src="images/cty.jpg"
											alt="C&ocirc;ng ty Dai-ichi Life Nh&acirc;̣t Bản"
											style="width: 150px; height: 150px; margin-top: 15px"></a>
									</div>
								</div>
								<div class="col-md-9">
									<h1 class="job-title text-highlight bold">
										<bean:write name="baiviet" property="tieuDe" filter="false" />
									</h1>
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
							<div class="job-meta text-dark-gray" style="margin-bottom: 20px;">
								<div class="row">
									<div class="col-xs-6 col-sm-3">
										<i class="glyphicon glyphicon-list-alt"></i>
										<bean:write name="baiviet" property="hanNopHoSo" />
									</div>
									<div class="col-xs-6 col-sm-3">
										<i class="glyphicon glyphicon-usd"></i>
										<bean:write name="baiviet" property="luong" />
									</div>
									<div class="col-xs-6 col-sm-3">
										<i class="glyphicon glyphicon-home"></i>
										<bean:write name="baiviet" property="noiLamViec" />
									</div>
									<div class="col-xs-6 col-sm-3">
										<i class="glyphicon glyphicon-bed"></i>
										<bean:write name="baiviet" property="loaiHinhLamViec" />
									</div>

								</div>
							</div>
						</div>
						<!-- </div> -->
					</div>
					<!-- </div> -->
				</div>
			</div>
		</div>

		<div class="container" style="margin-top: 10px; margin-left: 132px;">
			<div class="row col-md-9" style="background: #fff; width: 1000px;">
				<div class="content col-md-12 col-sm-9 ">
					<div class="container">
						<div class="row">
							<div class="col-md-8" id="col-job-left">
								<div class="box box-white">
									<h3 class="text-dark-gray">Mô tả công việc</h3>
									<div class="text-dark-gray">
										<p>
											<bean:write name="baiviet" property="motaCongViec"
												filter="false" />
										</p>
									</div>
									<hr>
									<div class="skill-tags">
										<a href="javascript:void(0)">Kĩ năng : <bean:write
												name="baiviet" property="kyNang" filter="false" /></a>
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
											<p>
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
											<p>
												<bean:write name="baiviet" property="quyenLoiUngVien"
													filter="false" />
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
											<p>
												Tên công ty :
												<bean:write name="baiviet" property="gioiThieuCty"
													filter="false" />
											</p>
										</div>
										<div class="text-dark-gray">
											<p>
												Người nhận hồ sơ :
												<bean:write name="baiviet" property="tenNguoiNhanHoSo" />
											</p>
										</div>
										<div class="text-dark-gray">
											<p>
												Số Điện Thoại :
												<bean:write name="baiviet" property="soDienThoai" />
											</p>
										</div>
										<div class="text-dark-gray">
											<p>
												Email :
												<bean:write name="baiviet" property="email" />
											</p>
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
		</div>
	</div>
	<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>