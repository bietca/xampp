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
<title>Tra chủ tìm việc</title>
<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<div class="container-full">
	<div class="header-menu">
		<nav class="navbar navbar-default"
			style="line-height: 20px; padding: 14px 18px; font-size: 14px; background: #fff;">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<img class="navbar-brand" alt="" src="images/logo.png">
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><html:link action="/tc-ungvien" style="color: blue;">Trang Chủ</html:link></li>
					<%-- <li><html:link action="/cn-ungvien" style="color: blue;">Trang Chủ</html:link></li> --%>
					<li><html:link action="/cn-ungvien" style="color: blue;">Trang Cá Nhân</html:link></li>
					<li><html:link action="/cvdt-ungvien" style="color: blue;">Quản lý hồ sơ</html:link></li>
					<li><html:link action="/cvut-ungvien" style="color: blue;">Hộp thư</html:link></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><html:link action="/dxuat-trangchu"
							onclick="return confirm('Bạn muốn đăng xuất không ?');"
							styleClass="glyphicon glyphicon-log-out">Đăng xuất</html:link></li>
				</ul>
			</div>

		</nav>
		<!-- End Menu Bootstrap -->
	</div>
</div>
<body style="background: #eee;">

	<div id="wrapper">
		<div class="container" style="margin-top: 40px; background: #fff;">

			<!-- Chuc nang tim kiem -->
			<div class="row"
				style="background: rgba(18, 121, 34, 0.21); padding-bottom: 50px; border: solid 1px #3e9652;">
				<div class="col-md-12 col-sm-offset-1">
					<h1>
						Tìm Công Việc Mơ Ước. <br class="visible-xs">
						<strong>Nâng Bước Thành Công!</strong>
					</h1>
				</div>

				<html:form action="/tk-baituyendung">
					<div class="row">

						<div class="col-md-3 col-sm-offset-1">

							<input type="text" class="form-control job-typeahead tt-input"
								placeholder="Nhập ví trí ứng tuyển .." id="tieuDe"
								onkeyup="myFunction()">
						</div>
						<div class="col-md-2">

							<html:select styleId="maNganh" property="maNganh"
								styleClass="js-example-basic-single js-states form-control"
								onchange="myFunction()">
								<option value="">-- Chọn ngành --</option>
								<html:optionsCollection name="timKiemBaiTuyenDungForm"
									property="listNganh" label="tenNganh" value="maNganh" />
							</html:select>
						</div>
						<div class="col-lg-2">

							<html:select styleId="maNoiLamViec" property="maNoiLamViec"
								styleClass="form-control" onchange="myFunction()">
								<option value="">--Nơi làm việc--</option>
								<html:optionsCollection name="timKiemBaiTuyenDungForm"
									property="listNoiLamViec" label="tenNoiLamViec"
									value="maNoiLamViec" />
							</html:select>
						</div>
						<div class="col-md-2" style="margin-left: 14px;">

							<html:select styleId="maKinhNghiem" property="maKinhNghiem"
								styleClass="form-control" onchange="myFunction()">
								<option value="">--Kinh nghiệm--</option>
								<html:optionsCollection name="timKiemBaiTuyenDungForm"
									property="listKinhNghiem" label="tenKinhNghiem"
									value="maKinhNghiem" />
							</html:select>
						</div>
					</div>

					<div class="row" style="margin: 10px;">
						<div class="col-md-3" style="margin-left: 73px; width: 300px;">

							<html:select styleId="maTD" property="maTD"
								styleClass="form-control" onchange="myFunction()">
								<option value="">-- Chọn Cấp bậc --</option>
								<html:optionsCollection name="timKiemBaiTuyenDungForm"
									property="listCapBac" label="tenCapBac" value="maCapBac" />
							</html:select>
						</div>
						<div class="col-md-2" style="width: 200px;">

							<html:select styleId="maLoaiCongViec" property="maLoaiCongViec"
								styleClass="form-control" onchange="myFunction()">
								<option value="">--Loại công việc--</option>
								<html:optionsCollection name="timKiemBaiTuyenDungForm"
									property="listLoaiCongViec" label="tenLoaiCongViec"
									value="maLoaiCongViec" />
							</html:select>
						</div>

						<div class="col-md-2" style="margin-left: 2px; width: 200px;">

							<html:select styleId="maLuong" property="maLuong"
								styleClass="form-control" onchange="myFunction()">
								<option value="">-- Chọn Lương --</option>
								<html:optionsCollection name="timKiemBaiTuyenDungForm"
									property="listLuong" label="tenLuong" value="maLuong" />
							</html:select>
						</div>
						<%-- <div class="col-md-2" style="margin-left: 16px; margin-top: 22px;">
		      		    
		      			<input type="button" value="Tìm Kiếm" onclick="myFunction()"  class="btn btn-primary" style="margin-top: 22px;"><br />
      					 <html:submit styleClass="btn btn-warning" style="width:168px">Tìm Kiếm</html:submit>
      				</div> --%>
					</div>
				</html:form>
				<script>
				 var request;  
				 function myFunction()  
				 {  
					var chuyennganh=document.getElementById("tieuDe").value;
					 var nganh = document.getElementById("maNganh").value;
					 var noiLamViec = document.getElementById("maNoiLamViec").value;
					 var namKN = document.getElementById("maKinhNghiem").value;
					 var capbac = document.getElementById("maTD").value;
					 var maCV = document.getElementById("maLoaiCongViec").value;
					 var maLuong = document.getElementById("maLuong").value;
					
					 var url="/Admin/tk-baituyendung1.do?maNganh="+nganh+
							"&&maNoiLamViec="+noiLamViec+"&&maKinhNghiem="+namKN+
							"&&maTD="+capbac+"&&maLoaiCongViec="+maCV+"&&maLuong="+maLuong+
							"&&tieuDe="+chuyennganh;
					 
				 if(window.XMLHttpRequest){  
					 request=new XMLHttpRequest();  
				 }  
				 else if(window.ActiveXObject){  
					 request=new ActiveXObject("Microsoft.XMLHTTP");  
				 }  
 
				 try  
				 {  
					 request.onreadystatechange=getInfo;  
					 request.open("GET",url,true);  
					 request.send();  
				 }  
				 catch(e)  {  
					 alert("Unable to connect to server");  
					 }  
				 }  	   
				 function getInfo(){  
				 if(request.readyState==4){  
					 var val=request.responseText;
					/* alert(val);  */
					 var ketqua="";
					 var items = JSON.parse(val);
							var leng=items.length;
							var ketqua1="<h3 style=\"color:red\">Kết quả tìm kiếm: "+leng+"</h3>";
					          for (var index in items) {  
										ketqua+="<div class=\"other-post-item\">"
										+ "<div class=\"other-post-img\" >"
										+ "<a href=\"#\"><img src=\"images/cty7.jpg\" style=\" height: 137px;\"></a>"
										+ "	</div>"
										+ "<div class=\"other-post-info\">"
										+ "	<b><a href=\"/Admin/ct-baituyendung.do?maBaiViet="+ items[index].maBaiViet +"\" >"
												+ "		"+ items[index].tieuDe+""
												+ "	</a></b>"
												+ "	<br>"
										+ "	<b>Nơi làm viêc:</b>"+ items[index].noiLamViec+"<br>"
										+ "<b>Loại công việc:</b>" + items[index].loaiHinhLamViec+""
										+ "<br>"
										+ "<b>Ngành:</b>" + items[index].nganh+""
										+ "<br>"
										+ "<b>Lương:</b>"+ items[index].luong +"<br>"
										+ "<b>Ngày Đăng:</b>"+ items[index].ngayDang +"<br>"
										+ "<b>Hạn DK :</b>"+ items[index].hanNopHoSo +""
									
										+ "	</div>"
										+ "</div>";
					          }		
					  $("#ketqua").html(ketqua1);        
					 $("#danhsach").html(ketqua);
					 }  
				 }  
				 </script>
			</div>
		</div>
		<!-- Chuc nang tim kiem -->
		<!-- Ket qua tra ve -->
		<div class="container" style="margin-top: 15px;">
			<div class="row" style="background: #fff;">
				<div class="content col-md-8 col-sm-9 col-xs-12">
					<div class="row">
						<div class="col-md-5">
							<h3 class="archive-title" id="ketqua">Danh sách việc làm</h3>
						</div>
						<div class="col-md-3 col-md-offset-16"></div>
					</div>
					<!-- 
					<p id="ketqua"></p> -->
					<div class="item-archive"
						style="border: 1px solid #fff; margin-top: 10px">
						<div class="box box-white job">
							<p id="danhsach">
							<div id="danhsach"></div>
						</div>
					</div>
				</div>

				<div class="sidebar col-md-4 col-sm-3 col-xs-12">
					<div class="container">
						<!-- Trigger the modal with a button -->
						<button type="button" class="btn btn-info" data-toggle="modal"
							data-target="#myModal">Đăng kí tìm việc ngay..</button>
						<p style="color: green">
							<html:errors property="loidk" />
						</p>
						<!-- Modal -->
						<div class="modal fade" id="myModal" role="dialog">
							<div class="modal-dialog modal-sm">
								<div class="modal-content">
									<div class="modal-header" style="background: #90ec90;">
										<button type="button" class="close" data-dismiss="modal">&times;</button>

										<h4 class="modal-title">Công việc mong muốn của bạn</h4>
									</div>
									<html:form action="/dangkitimkiec">
										<div class="modal-body">

											<div>
												<label>Chuyên Ngành</label>
												<div>
													<html:select property="chuyenNganh"
														styleClass="form-control">
														<html:optionsCollection name="timKiemBaiTuyenDungForm"
															property="listNganh" label="tenNganh" value="maNganh" />
													</html:select>
												</div>
											</div>
											<div>
												<label>Nơi Làm Việc</label>
												<div>
													<html:select property="noiLamViec"
														styleClass="form-control">
														<html:optionsCollection name="timKiemBaiTuyenDungForm"
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
														<html:optionsCollection name="timKiemBaiTuyenDungForm"
															property="listLoaiCongViec" label="tenLoaiCongViec"
															value="maLoaiCongViec" />
													</html:select>
												</div>
											</div>
											<div>
												<label>Cấp bậc</label>
												<div>
													<html:select property="capBac" styleClass="form-control">

														<html:optionsCollection name="timKiemBaiTuyenDungForm"
															property="listCapBac" label="tenCapBac" value="maCapBac" />
													</html:select>
												</div>
											</div>

											<div>
												<label>Mức Lương</label>
												<div>
													<html:select property="luong" styleClass="form-control">
														<html:optionsCollection name="timKiemBaiTuyenDungForm"
															property="listLuong" label="tenLuong" value="maLuong" />
													</html:select>
												</div>
											</div>
											<div>
												<label>Email Của Bạn</label>
												<div>
													<%--     <bean:write name="timKiemBaiTuyenDungForm" property="email"/>  --%>
													<html:text name="timKiemBaiTuyenDungForm" property="email"
														styleId="email" styleClass="form-control" readonly="true"></html:text>
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<html:submit property="submit" value="submit" styleClass="btn btn-primary"
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

					<div class="sidebar-block" id="other-post">
						<div class="sidebar-block-title">
							<span style="color: black;">Công việc mới phụ hợp với bạn</span>
						</div>
						<div class="sidebar-block-content">
					    <logic:present name="timKiemBaiTuyenDungForm" property="listBaiTuyenDungPhuHop">
					     	<logic:iterate name="timKiemBaiTuyenDungForm" property="listBaiTuyenDungPhuHop" id="baiviet">
								<div class="other-post-item">
									<div class="other-post-img">
										<a href="#"><img src="images/cty.jpg"></a>
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
					   </logic:present>
							
						</div>
					</div>
				</div>
				<!--end #sidebar-->
			</div>

		</div>
	</div>

	<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>