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
<title>Danh sách sinh viên</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-te-1.4.0.min.js"
	charset="utf-8"></script>
<link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css" />
<style type="text/css">
  hr {
         margin-top: 2px;
         margin-bottom: 30px;
         border: 0;
         border-top: 1px solid #1b1a1a;
   }
</style>
</head>
<body style="background: #eee">
	<div class="container"
		style="width: 800px; margin-left: 16%; margin-top: 35px; background: #fff">
		<div class="row">
			<div class="col-md-10 content" style="margin-left: 80px;">
				<div class="row">
					<div class="panel-body">
						<html:form action="/taocv-ungvien">
							<bean:define id="baiviet" name="danhSachBaiTuyenDungForm" property="hoSo"></bean:define>
							<div class="row col-md-12" style="margin-top: 50px;">
								<div class="col-md-4">
									<p></p>

									<span> <img
										src="<bean:write  name="baiviet"  property="anh"/>"
										width="180xp;" height="220px" />
									</span>

									<p></p>
								</div>
								<div class="col-md-8">
									<div class="col-md-12">
										<div class="col-md-12">
											<h3>
												<label><bean:write name="baiviet" property="hoTen" /></label>
											</h3>
                                           <h4 >
										      <i><span style="color: blue;">  <bean:write name="baiviet" property="chuyenNganh" /></span></i> 
									      </h4>
										</div>
										<div class="col-md-12" >
											<h5> 
											      <label style="margin-right: 34px;">Ngày sinh :</label>
												
												<bean:write name="baiviet" property="ngaySinh" />
											
											</h5>
										</div>
										<div class="col-md-12">
											<h5> 
									                 <label style="margin-right: 17px;"> Số điện thoại :</label>
											         <bean:write name="baiviet" property="soDienThoai" />
											</h5>

										</div>
										<div class=" col-md-12">
											<h5>
												<label style="margin-right: 67px;">Email :</label>
												<bean:write name="baiviet" property="email" />
											</h5>

										</div>
										<div class="col-md-12">
											<h5>
												<label style="margin-right: 57px;">Địa chỉ :</label> <bean:write name="baiviet" property="diaChi" />
												
												
											</h5>

										</div>
									</div>

								</div>

							</div>
							
							<div class="row">
								<div class="col-xs-12" style="margin-top: 10px ; margin-bottom: 10px">
									<h5>
									  	<label>MỤC TIÊU NGHỀ NGHIỆP</label>
									 </h5>
									 <hr >
									<p>
										<bean:write name="baiviet" property="mucTieuCongViec"
											filter="fales" />
									</p>

								</div>
							</div>
							<div class="row">
								<div class="col-xs-12" style="margin-top: 10px ; margin-bottom: 10px">
									<h5><label>HỌC VẤN</label></h5>
									<hr>
									<p>
										<bean:write name="baiviet" property="hocVan" filter="fales" />
									</p>
								</div>
							</div>
							
							<div class="row">
								<div class="col-xs-12" style="margin-top: 10px ; margin-bottom: 10px">
									<h5><label>KINH NGHIỆM LÀM VIỆC</label> </h5>
									<hr>
									<p>
										<bean:write name="baiviet" property="kinhNghiepLamViec"
											filter="fales" />
									</p>
								</div>
							</div>
							
							<div class="row">
								<div class="col-xs-12" style="margin-top: 10px ; margin-bottom: 10px">
									<h5><label>HOẠT ĐỘNG</label> </h5>
									<hr>
									<p>
										<bean:write name="baiviet" property="hoatDong" filter="fales" />
									</p>
								</div>
							</div>
							
							<div class="row">
								<div class="col-xs-12" style="margin-top: 10px ; margin-bottom: 10px">
									<h5><label>CHỨNG CHỈ</label> </h5>
									<hr>
									<p>
										<bean:write name="baiviet" property="chucChi" filter="fales" />
									</p>
								</div>
							</div>
							
							<div class="row">
								<div class="col-xs-12">
									<h5><label>KĨ NĂNG</label> </h5>
									<hr>
									<p>
										<bean:write name="baiviet" property="kiNang" filter="fales" />
									</p>
								</div>
							</div>
							
							<div class="row">
								<div class="col-xs-12" style="margin-top: 10px ; margin-bottom: 10px">
									<h5><label>SỞ THÍCH</label> </h5>
									<hr>
									<p>
										<bean:write name="baiviet" property="soThich" filter="fales"></bean:write>
									</p>
								</div>
							</div>
							 <div class="row">
								<br>
								<bean:define id="email" name="baiviet" property="email"></bean:define>
								<html:link
									action="/traloithu-ungtuyen?emaiNguoiTimViec=${email}"
									styleClass="btn btn-primary">Trả lời thư</html:link>
							</div>
							<%-- <div class="row">
								<br>

								<html:link action="/cvdt-ungvien.do"
									styleClass="btn btn-primary">Trở về</html:link>
							</div> --%>
						</html:form>
					</div>
				</div>
			</div>
			<!--/post-->
		</div>
		<!--/contet-->
	</div>
    
</body>
</html>