<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>thông tin chi tiết</title>
  
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
      <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
	<script type="text/javascript" src="js/jquery-te-1.4.0.min.js" charset="utf-8"></script>
	<link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css"/>
</head>
  <body style="background: #eee">
     <jsp:include page="/menu.jsp"></jsp:include> 
    <div id="wrapper" style="with:300px;">
    	<div class="container" style=" margin-top: 20px;">
			<h3>Đăng Bài tuyển dụng mới</h3>
		</div>
		<div class="container" style="width: 800px; margin-left: 16%;margin-top: 35px;" >
			<html:form action="/them-tuyendung" >
			<div id="box" class="row">
				<div class="col-sm-1"></div>
				<div class="row col-md-10" >
					<h1 style="margin-left: 240px;">Thư ứng tuyển </h1>
					<div class="row">
						<div class="form-group col-md-12" style="margin-top: 10px;">	
							<label class="col-md-4" >Email Nhà tuyển dụng</label>
							<div  class="col-md-7" >	
								<p>nguyenvana@gmail.com</p>
								<%-- <bean:write name="thuUngTuyenForm"  property="emailNhaTuyenDung" >NguyenVanA@gmail.com</bean:write> --%>
							</div> 
						</div>
						<div class="form-group col-md-12" style="margin-top: 10px;">
							<label class="col-md-4" >Email Ứng viên</label>
							<div class="col-md-7">
								<p>nguyenvana@gmail.com</p>
								<%-- <bean:write name="thuUngTuyenForm"  property="emaiNguoiTimViec" ></bean:write> --%>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-12"  style="margin-top: 10px;">
							<label  class="col-md-4">Mã bài tuyển dụng</label>
							<div class="col-md-7">
								<p>1</p>
								<%-- <bean:write name="thuUngTuyenForm"  property="maBaiTuyenDung" >1</bean:write> --%>
							</div>
						</div>
						<div class="form-group col-md-12"  style="margin-top: 10px;">
							<label  class="col-md-4">Mã CV Ứng tuyển</label>
							<p>1</p>
							<%-- <bean:write name="thuUngTuyenForm"  property="ngayUngTuyen" >2</bean:write> --%>
						</div>
					</div>
					<div class=" row">
						<div class="form-group col-md-12">
							<label class="col-md-4">Tiêu đề</label>
							<div class="col-md-7">
							<p>Lap trn vein</p>
								<%-- <bean:write name="thuUngTuyenForm"  property="maCV" >Tuyển Lập trính viên</bean:write> --%>
							</div>
					</div>
					</div>	
					<div class="row">
						<div class="form-group col-md-12">
							<label  class="col-md-4">Ngày ứng tuyển</label>
							<div class="col-md-7">
							<p>12-02-2017</p>
									<%-- <bean:write name="thuUngTuyenForm"  property="ngayUngTuyen" >12-12-2017</bean:write>
									<bean:write name="thuUngTuyenForm"  property="trangThai" >1</bean:write> --%>
							</div>
						
						</div>
					</div>
					<%-- <div class="form-group col-md-12">
							<label>Nội Dung thư</label>
							<p>FPOmsdpofmposdmgspmg[ iojnfgipo n]</p>
							<bean:write name="thuUngTuyenForm" property="noiDung"  filter="false"></bean:write>
					</div> --%>
					<hr>
					<div class="form-group col-md-12 col-md-offset-5">
						<html:submit property="submit"  alt="Thêm Bài Tuyển Dụng" onclick="myFunction()" styleClass="btn btn-success">Trả lời thư</html:submit>
						<html:link action="/qlbtuyendung-tuyendung"> Về trang quản lý</html:link>
					</div>
					</div>
				</div>	
		</html:form>	
		</div> 
	   <script>
	   $('.jqte-test').jqte();
		function myFunction() {
			submit.val("submit");
			document.forms[0].submit();
		}
		
		</script>
		</div>	   
  </body>
</html>