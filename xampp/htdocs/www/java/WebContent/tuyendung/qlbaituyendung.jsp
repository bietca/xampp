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
<title>Quản lý bài tuyến dụng</title>

<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script src="js/sweetalert.js"></script>
<link rel="stylesheet" href="css/sweetalert.css">
<link href="css/elegant-icons-style.css" rel="stylesheet" />
</head>
<body style="background: #eee">
	<jsp:include page="menunhatuyendung.jsp"></jsp:include>
	<div class="container" style="margin-bottom: 100px;">
		<div class="row" style="margin-top: 10px;">
			<div class="col-md-6">
				<html:link action="/them-tuyendung" styleClass="btn btn-primary">
					<span class="glyphicon glyphicon-plus"> Thêm mới Bài tuyển
						dụng</span>
				</html:link>
			</div>
		</div>

		<div class="row">
			<div class="content col-md-8 col-sm-9 col-xs-12"
				style="border-color: black;">
				<h4 class="archive-title">Danh sách bài tuyển dụng</h4>

				<logic:iterate name="danhSachBaiTuyenDungForm"
					property="baiTuyenDungs" id="baiviet">
					<div class="item-archive"
						style="border: 1px solid #fff; background: #f1fbff; margin-top: 10px">
						<div class="box box-white job">
							<div class="row">
								<div class="hidden-xs col-sm-2">
									<a href="#" class="company-logo"> <img src="images/cty.jpg"
										style="width: 150px; height: 150px; margin: 10px;"
										alt="Global CyberSoft" title=".NET Developer">
									</a>
								</div>
								<div class="col-md-10 col-sm-10" style="padding-left: 60px;">
									<h4 class="job-title">
										<a target="_blank" class="text-highlight " href="#"> <span
											class="bold"> <bean:write name="baiviet"
													property="maBaiViet" /> <bean:write name="baiviet"
													property="tieuDe" filter="false" />
										</span>
										</a>
									</h4>


									<p class="job-salary">
										<span><i class="glyphicon glyphicon-home"></i> <bean:write
												name="baiviet" property="noiLamViec" /></span> <span><i
											class="glyphicon glyphicon-bed"></i>
										<bean:write name="baiviet" property="loaiHinhLamViec" /></span> <span><i
											class="glyphicon glyphicon-usd"></i> <bean:write
												name="baiviet" property="luong" /></span> <span><i
											class="glyphicon glyphicon-list-alt"></i> <bean:write
												name="baiviet" property="hanNopHoSo" /></span>
									</p>
									<bean:define id="maBaiViet" name="baiviet" property="maBaiViet"></bean:define>
									<html:link action="/ql-xemchitiet?maBaiViet=${maBaiViet}">
										<span class="glyphicon glyphicon-edit">Xem chi tiết ...</span>
									</html:link>
									<!-- 	<div class="col-md-12 col-sm-10"> -->
									<bean:define id="maBaiViet" name="baiviet" property="maBaiViet" />
									<div class="col-md-12 col-sm-10"
										style="margin-left: 400px; margin-top: 33px;">
										<div class="col-md-1">
											<html:link styleClass="btn btn-primary"
												action="/suabai-tuyendung?mabaiViet1=${maBaiViet}">
												<i class="delete-alt2-icon">Sửa</i>
											</html:link>
										</div>
										<div class="col-md-offset-2">
											<html:link styleClass="btn btn-danger"
												action="/xoabai-tuyendung?maBaiViet1=${maBaiViet}"
												onclick="return confirm('Bạn muốn xóa bài viết ?');">
												<i class="delete-alt2-icon">Xóa</i>
											</html:link>
										</div>

									</div>
									
								</div>
							</div>
						</div>
					</div>
					<!-- end .item -->
				</logic:iterate>
			</div>

		</div>
	</div>
	<div style="margin-top: 30px">
		<jsp:include page="/footer.jsp"></jsp:include>
	</div>

</body>
</html>