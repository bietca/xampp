<%@page import="model.bo.admin.PhanTrang"%>
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
<title>Trang chủ</title>

<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body style="background: #eee">
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="container">
		<section id="timkiem">
			<jsp:include page="/slide.jsp"></jsp:include>
		</section>
		<div id="wrapper" class="baiviet">
			<div class="container">
				<ul class="nav nav-tabs"
					style="background: #90ec90; margin-top: 20px; width: 1114px;">
					<li class="active"><a data-toggle="tab" href="#home">Việc
							Làm Nổi Bậc</a></li>
					<li><a data-toggle="tab" href="#menu1">Toàn Thời Gian</a></li>
					<li><a data-toggle="tab" href="#menu2">Bán Thời Gian</a></li>
					<li><a data-toggle="tab" href="#menu3">Thực Tập</a></li>

					<!-- Dang Ki Tim Viec -->
					<div class="container col-md-offset-10">
						<!-- Trigger the modal with a button -->
						<button type="button" class="btn btn-info" data-toggle="modal"
							data-target="#myModal">Đăng kí tìm việc ngay..</button>
						<!-- Modal -->
						<div class="modal fade" id="myModal" role="dialog">
							<div class="modal-dialog modal-sm">
								<div class="modal-content">
									<div class="modal-header" style="background: #90ec90;">
										<button type="button" class="close" data-dismiss="modal">&times;</button>

										<h4 class="modal-title">Công việc muốn của bạn là</h4>
									</div>
									<html:form action="/dangkitimkiec?submit=submit">
										<div class="modal-body">

											<div>
												<label>Chuyên Ngành</label>
												<div>
													<html:select property="chuyenNganh"
														styleClass="form-control">
														<html:optionsCollection name="trangChuForm"
															property="listNganh" label="tenNganh" value="maNganh" />
													</html:select>
												</div>
											</div>
											<div>
												<label>Nơi Làm Việc</label>
												<div>
													<html:select property="noiLamViec"
														styleClass="form-control">
														<html:optionsCollection name="trangChuForm"
															property="listNoiLamViec" label="tenNoiLamViec"
															value="maNoiLamViec" />
													</html:select>
												</div>
											</div>
											<div>
												<label>Loại Công việc</label>
												<div>
													<html:select property="loaiCongViec"
														styleClass="form-control">
														<html:optionsCollection name="trangChuForm"
															property="listLoaiHinhCongViec" label="tenLoaiCongViec"
															value="maLoaiCongViec" />
													</html:select>
												</div>
											</div>
											<div>
												<label>Cấp bậc</label>
												<div>
													<html:select property="capBac" styleClass="form-control">

														<html:optionsCollection name="trangChuForm"
															property="listCapBac" label="tenCapBac" value="maCapBac" />
													</html:select>
												</div>
											</div>

											<div>
												<label>Mức Lương</label>
												<div>
													<html:select property="luong" styleClass="form-control">
														<html:optionsCollection name="trangChuForm"
															property="listLuong" label="tenLuong" value="maLuong" />
													</html:select>
												</div>
											</div>
											<div>
												<label>Email Của Bạn</label>
												<div>
													<html:text property="email" styleId="email"
														styleClass="form-control"></html:text>
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<html:submit property="submit" styleClass="btn btn-primary"
												onclick="return confirm('Bạn muốn đăng kí tìm việc, hoặc thay đổi đăng kí công việc ?');">Đăng kí</html:submit>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Thoát</button>
										</div>
									</html:form>
								</div>
							</div>
						</div>
					</div>
					<!--/ Dang Ki Tim Viec -->
				</ul>
			</div>
			<div class="container" style="margin-top: 15px;">

				<html:form styleId="form1" action="/gd-trangchu" method="get">
					<div class="col-lg-4">
						<html:hidden styleId="idPage" name="trangChuForm"
							property="soTrang" styleClass="form-control"></html:hidden>
					</div>
					<script type="text/javascript">
						//Trỏ đến styleId( tương đương với id) của property page
						var idPage = $("#idPage");

						//Khi load trang xong
						$(document)
								.ready(
										function() {
											//Đọc lại giá trị page hiện tại từ Form Class
											var pageStatic = parseInt('<bean:write name="trangChuForm" property="soTrang"/>');
											//Thêm class active vô id <li> của trang hiện tại
											$("#" + pageStatic).addClass(
													"active");
										});
						//Khi muốn xem kết quả tìm kiếm của trang nào đó
						function handleClickAction(page) {
							//Gán giá trị page truyền vào cho property page của Form Class
							idPage.val(page);
							//Submit form bằng javascript
							document.forms["form1"].submit();
						};
					</script>
				</html:form>

				<div class="tab-content">
					<div id="home" class="tab-pane fade in active">
						<section id="baiviet">
							<div class="row"
								style="background: #fff; background: #fff; width: 1140px;">
								<div class="content col-md-8 col-sm-9 col-xs-12"
									style="border-color: black;">
									<h4 class="archive-title">Tất cả bài tuyển dụng :</h4>

									<logic:iterate name="trangChuForm" property="baiTuyenDungs"
										id="baiviet">
										<div class="other-post-item">
											<div class="other-post-img">
												<a href="#"><img src="images/cty7.jpg"
													style="height: 137px; border: 1px solid rgba(66, 117, 89, 0.66);"></a>
											</div>
											<div class="other-post-info">

												<bean:define id="maBaiViet" name="baiviet"
													property="maBaiViet"></bean:define>
												<b><html:link
														action="/ct-baituyendung?maBaiViet=${maBaiViet}">
														<bean:write name="baiviet" property="tieuDe" />
													</html:link></b> <br> <b>Nơi làm viêc:</b>
												<bean:write name="baiviet" property="noiLamViec" />
												<br> <b>Loại công việc:</b>
												<bean:write name="baiviet" property="loaiHinhLamViec" />
												<br> <b>Ngành :</b>
												<bean:write name="baiviet" property="nganh" />
												<br> <b>Lương:</b>
												<bean:write name="baiviet" property="luong" />
												<br> <b>Ngày Đăng:</b>
												<bean:write name="baiviet" property="ngayDang" />
												<br> <b>Hạn DK :</b>
												<bean:write name="baiviet" property="hanNopHoSo" />
											</div>
										</div>
									</logic:iterate>
									<div class="container"
										style="display: flex; align-items: center; margin: 10px;">
										<ul class="pagination" style="margin: 0 auto;">
											<li class="1"><a href="#"
												onclick='handleClickAction("1")'>&laquo;</a></li>
											<%
												if (PhanTrang.tongTrang < 8) {
													for (int i = 0; i < PhanTrang.tongTrang; i++) {
														out.println("<li id='" + (i + 1) + "'><a href='#' onclick='handleClickAction(" + (i + 1) + ");'>"
																+ (i + 1) + "</a></li>");
													}
												} else {
													if (PhanTrang.soTrang < 2) {
														for (int i = 0; i < 4; i++) {
															out.println("<li id='" + (i + 1) + "'><a href='#' onclick='handleClickAction(" + (i + 1)
																	+ ");'>" + (i + 1) + "</a></li>");
														}

														int mid = (PhanTrang.tongTrang - 4 - 4) / 2 + 4;
														out.println("<li><a href='#' onclick='handleClickAction(" + mid + ")'> ... </a></li>");

														for (int i = PhanTrang.tongTrang - 4; i < PhanTrang.tongTrang; i++) {
															out.println("<li id='" + (i + 1) + "'><a href='#' onclick='handleClickAction(" + (i + 1)
																	+ ");'>" + (i + 1) + "</a></li>");
														}
													} else {
														int midFirst = (PhanTrang.soTrang - 2) / 2;
														out.println("<li><a href='#' onclick='handleClickAction(" + midFirst + ")'> ... </a></li>");

														int n = PhanTrang.soTrang + 3 > PhanTrang.tongTrang ? PhanTrang.tongTrang : PhanTrang.soTrang + 3;
														for (int i = PhanTrang.soTrang - 2; i < n; i++) {
															out.println("<li id='" + (i + 1) + "'><a href='#' onclick='handleClickAction(" + (i + 1)
																	+ ");'>" + (i + 1) + "</a></li>");
														}

														if (PhanTrang.soTrang < PhanTrang.tongTrang - 4) {
															int midLast = (PhanTrang.tongTrang - (PhanTrang.soTrang + 2)) / 2 + PhanTrang.soTrang + 2;
															if (midLast > PhanTrang.tongTrang)
																midLast = PhanTrang.tongTrang;
															out.println("<li><a href='#' onclick='handleClickAction(" + midLast + ")'> ... </a></li>");
														}

													}
												}
											%>
											<li class="<%=PhanTrang.tongTrang%>"><a href="#"
												onclick='handleClickAction("<%=PhanTrang.tongTrang%>")'>&raquo;</a></li>
										</ul>
									</div>
								</div>
								<div class="sidebar col-md-4 col-sm-3 col-xs-12">
									<div class="sidebar-item">
										<h4 class="widget-title">Bài Tuyển Dụng Mới</h4>
										<div class="textwidget">
											<logic:iterate name="trangChuForm"
												property="top10BaiTuyenDungMoi" id="baiviet">
												<div class="other-post-item">
													<div class="other-post-img">
														<a href="#"><img src="images/cty5.jpg"></a>
													</div>
													<div class="other-post-info">

														<bean:define id="maBaiViet" name="baiviet"
															property="maBaiViet"></bean:define>
														<b><html:link
																action="/ct-baituyendung?maBaiViet=${maBaiViet}">
																<bean:write name="baiviet" property="tieuDe" />
															</html:link></b> <br> <b>Nơi làm viêc:</b>
														<bean:write name="baiviet" property="noiLamViec" />
														<br> <b>Loại công việc:</b>
														<bean:write name="baiviet" property="loaiHinhLamViec" />
														<br> <b>Lương:</b>
														<bean:write name="baiviet" property="luong" />
														<br> <b>Ngày Đăng:</b>
														<bean:write name="baiviet" property="ngayDang" />
														<br> <b>Hạn DK :</b>
														<bean:write name="baiviet" property="hanNopHoSo" />

													</div>
												</div>
											</logic:iterate>
										</div>
									</div>
								</div>
							</div>
						</section>
					</div>
					<div id="menu1" class="tab-pane fade">
						<div class="row" style="background: #fff;">
							<div class="content col-md-8 col-sm-9 col-xs-12"
								style="border-color: black;">
								<h4 class="archive-title">Top 10 Việc làm toàn thời gian
									nổi bật</h4>
								<logic:iterate name="trangChuForm"
									property="top10BaiToanThoiGian" id="baiviet">
									<div class="other-post-item">
										<div class="other-post-img">
											<a href="#"><img src="images/cty8.png"
												style="height: 137px; border: 1px solid rgba(66, 117, 89, 0.66);"></a>
										</div>
										<div class="other-post-info">

											<bean:define id="maBaiViet" name="baiviet"
												property="maBaiViet"></bean:define>
											<b><html:link
													action="/ct-baituyendung?maBaiViet=${maBaiViet}">
													<bean:write name="baiviet" property="tieuDe" />
												</html:link></b> <br> <b>Nơi làm viêc:</b>
											<bean:write name="baiviet" property="noiLamViec" />
											<br> <b>Loại công việc:</b>
											<bean:write name="baiviet" property="loaiHinhLamViec" />
											<br> <b>Ngành :</b>
											<bean:write name="baiviet" property="nganh" />
											<br> <b>Lương:</b>
											<bean:write name="baiviet" property="luong" />
											<br> <b>Ngày Đăng:</b>
											<bean:write name="baiviet" property="ngayDang" />
											<br> <b>Hạn DK :</b>
											<bean:write name="baiviet" property="hanNopHoSo" />

										</div>
									</div>
								</logic:iterate>
							</div>
							<div class="sidebar col-md-4 col-sm-3 col-xs-12">
								<div class="sidebar-item">
									<h4 class="widget-title">Bài Tuyển Dụng Mới</h4>
									<div class="textwidget">
										<logic:iterate name="trangChuForm"
											property="top10BaiTuyenDungMoi" id="baiviet">
											<div class="other-post-item">
												<div class="other-post-img">
													<a href="#"><img src="images/cty5.jpg"></a>
												</div>
												<div class="other-post-info">

													<bean:define id="maBaiViet" name="baiviet"
														property="maBaiViet"></bean:define>
													<b><html:link
															action="/ct-baituyendung?maBaiViet=${maBaiViet}">
															<bean:write name="baiviet" property="tieuDe" />
														</html:link></b> <br> <b>Nơi làm viêc:</b>
													<bean:write name="baiviet" property="noiLamViec" />
													<br> <b>Loại công việc:</b>
													<bean:write name="baiviet" property="loaiHinhLamViec" />
													<br> <b>Lương:</b>
													<bean:write name="baiviet" property="luong" />
													<br> <b>Ngày Đăng:</b>
													<bean:write name="baiviet" property="ngayDang" />
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
					<div id="menu2" class="tab-pane fade">
						<div class="row" style="background: #fff;">
							<div class="content col-md-8 col-sm-9 col-xs-12"
								style="border-color: black;">
								<h4 class="archive-title">Top 10 Việc làm Bán thời gian nổi
									bật</h4>
								<logic:iterate name="trangChuForm"
									property="top10BaiBanThoiGian" id="baiviet">
									<div class="other-post-item">
										<div class="other-post-img">
											<a href="#"><img src="images/cty2.jpg"
												style="height: 137px; border: 1px solid rgba(66, 117, 89, 0.66);"></a>
										</div>
										<div class="other-post-info">

											<bean:define id="maBaiViet" name="baiviet"
												property="maBaiViet"></bean:define>
											<b><html:link
													action="/ct-baituyendung?maBaiViet=${maBaiViet}">
													<bean:write name="baiviet" property="tieuDe" />
												</html:link></b> <br> <b>Nơi làm viêc:</b>
											<bean:write name="baiviet" property="noiLamViec" />
											<br> <b>Loại công việc:</b>
											<bean:write name="baiviet" property="loaiHinhLamViec" />
											<br> <b>Ngành :</b>
											<bean:write name="baiviet" property="nganh" />
											<br> <b>Lương:</b>
											<bean:write name="baiviet" property="luong" />
											<br> <b>Ngày Đăng:</b>
											<bean:write name="baiviet" property="ngayDang" />
											<br> <b>Hạn DK :</b>
											<bean:write name="baiviet" property="hanNopHoSo" />

										</div>
									</div>
								</logic:iterate>
							</div>
							<div class="sidebar col-md-4 col-sm-3 col-xs-12">
								<div class="sidebar-item">
									<h4 class="widget-title">Bài Tuyển Dụng Mới</h4>
									<div class="textwidget">
										<logic:iterate name="trangChuForm"
											property="top10BaiTuyenDungMoi" id="baiviet">
											<div class="other-post-item">
												<div class="other-post-img">
													<a href="#"><img src="images/cty5.jpg"></a>
												</div>
												<div class="other-post-info">

													<bean:define id="maBaiViet" name="baiviet"
														property="maBaiViet"></bean:define>
													<b><html:link
															action="/ct-baituyendung?maBaiViet=${maBaiViet}">
															<bean:write name="baiviet" property="tieuDe" />
														</html:link></b> <br> <b>Nơi làm viêc:</b>
													<bean:write name="baiviet" property="noiLamViec" />
													<br> <b>Loại công việc:</b>
													<bean:write name="baiviet" property="loaiHinhLamViec" />
													<br> <b>Lương:</b>
													<bean:write name="baiviet" property="luong" />
													<br> <b>Ngày Đăng:</b>
													<bean:write name="baiviet" property="ngayDang" />
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
					<div id="menu3" class="tab-pane fade">
						<div class="row" style="background: #fff;">
							<div class="content col-md-8 col-sm-9 col-xs-12"
								style="border-color: black;">
								<h4 class="archive-title">Top 10 Bài thực tập nổi bật</h4>
								<logic:iterate name="trangChuForm" property="top10BaiThucTap"
									id="baiviet">
									<div class="other-post-item">
										<div class="other-post-img">
											<a href="#"><img src="images/cty7.jpg"
												style="height: 137px; border: 1px solid rgba(66, 117, 89, 0.66);"></a>
										</div>
										<div class="other-post-info">
											<bean:define id="maBaiViet" name="baiviet"
												property="maBaiViet"></bean:define>
											<b><html:link
													action="/ct-baituyendung?maBaiViet=${maBaiViet}">
													<bean:write name="baiviet" property="tieuDe" />
												</html:link></b> <br> <b>Nơi làm viêc:</b>
											<bean:write name="baiviet" property="noiLamViec" />
											<br> <b>Loại công việc:</b>
											<bean:write name="baiviet" property="loaiHinhLamViec" />
											<br> <b>Ngành :</b>
											<bean:write name="baiviet" property="nganh" />
											<br> <b>Lương:</b>
											<bean:write name="baiviet" property="luong" />
											<br> <b>Ngày Đăng:</b>
											<bean:write name="baiviet" property="ngayDang" />
											<br> <b>Hạn DK :</b>
											<bean:write name="baiviet" property="hanNopHoSo" />

										</div>
									</div>
								</logic:iterate>
							</div>
							<div class="sidebar col-md-4 col-sm-3 col-xs-12">
								<div class="sidebar-item">
									<h4 class="widget-title">Những bài tuyển dụng mới</h4>
									<div class="textwidget">
										<logic:iterate name="trangChuForm"
											property="top10BaiTuyenDungMoi" id="baiviet">
											<div class="other-post-item">
												<div class="other-post-img">
													<a href="#"><img src="images/cty5.jpg"></a>
												</div>
												<div class="other-post-info">

													<bean:define id="maBaiViet" name="baiviet"
														property="maBaiViet"></bean:define>
													<b><html:link
															action="/ct-baituyendung?maBaiViet=${maBaiViet}">
															<bean:write name="baiviet" property="tieuDe" />
														</html:link></b><br> <b>Nơi làm viêc:</b>
													<bean:write name="baiviet" property="noiLamViec" />
													<br> <b>Loại công việc:</b>
													<bean:write name="baiviet" property="loaiHinhLamViec" />
													<br> <b>Lương:</b>
													<bean:write name="baiviet" property="luong" />
													<br> <b>Ngày Đăng:</b>
													<bean:write name="baiviet" property="ngayDang" />
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
				</div>
			</div>
		</div>

	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>