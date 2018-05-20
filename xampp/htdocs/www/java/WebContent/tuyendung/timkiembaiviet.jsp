<%@page import="model.bo.admin.PhanTrang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>tìm kiếm việc làm</title>
   
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
     <link rel="stylesheet" href="css/bootstrap.min.css"/>
  <!--   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
</head>
<div class="container-full" >
 		<section id="banner" class="banner" style=" position: absolute;min-height: 800px;">
		<div class="bg-color">
			<nav class="navbar navbar-default navbar-fixed-top" style="padding: 20px;background: #fff;">
			  <div class="container">
			  	<div class="col-md-12">
				    <div class="navbar-header">
				      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				         <span class="icon-bar"></span>
				      </button>
				      <html:link action="/gd-trangchu" styleClass="navbar-brand"><img src="images/logo.png" class="img-responsive" style="width: 140px; margin-top: -16px;"></html:link>
				    </div>
				    <div class="collapse navbar-collapse navbar-left" id="myNavbar">
				      <ul class="nav navbar-nav">
				       	<li><html:link action="/gd-trangchu"  style="color: blue;" >Trang Chủ</html:link></li>
				       	
				      </ul>
				    </div>
				      <ul class="nav navbar-nav navbar-right">
               			<li><html:link action="/dktk-trangchu" styleClass="glyphicon glyphicon-user"  style="color: blue;">Đăng kí</html:link></li>
               			<li><html:link action="/dn-nguoidung" styleClass="glyphicon glyphicon-log-in"  style="color: blue;">Đăng Nhập</html:link></li>
  			  		 </ul>
				</div>
			  </div>
			</nav>	
			</div>
		</section>
  </div>
  <body style="background: #eee; margin-top: 120px;">
    <div id="wrapper" >
      <div class="container" style="  margin-top: 80px;background: #fff;">
     
      	<!-- Chuc nang tim kiem -->
      	<div class="row" style="background: rgba(18, 121, 34, 0.21);padding-bottom: 50px;  border: solid 1px #3e9652;">
      		<div class="col-md-12 col-sm-offset-1">
      			<h1>Tìm Công Việc Mơ Ước. <br class="visible-xs"><strong>Nâng Bước Thành Công!</strong></h1>
      		</div>     		   
      		
	       <html:form action="/tk-baituyendung" > 
	        	<div class="row">
	        	    
	        		<div class="col-md-3 col-sm-offset-1">
	        		<!--     <input type="checkbox" checked="checked">Tích vào để tìm kiếm chính xác</input> -->
      					<input type="text" class="form-control job-typeahead tt-input" placeholder="Nhập ví trí ứng tuyển .." id="tieuDe" onkeyup="myFunction()">
      				</div>
	        		 <div class="col-md-2">
	<%--    <!-- Loc nganh  -->
	        		   <html:checkbox name="timKiemBaiTuyenDungForm" property="locNganh" styleId="locNganh"  onchange="myFunction()"></html:checkbox>  --%>

		      			<html:select styleId="maNganh"  property="maNganh"  styleClass="js-example-basic-single js-states form-control" onchange="myFunction()">
		      				<option value="">-- Chọn ngành --</option>
							<html:optionsCollection name="timKiemBaiTuyenDungForm" property="listNganh" label="tenNganh" value="maNganh"  />
						</html:select>
		      		</div>
		      		 <div class="col-lg-2">
<%-- 		<!-- Loc noi Lam viec  -->      		 
		      		    <html:checkbox   property="locNoiLamViec" styleId="locNoiLamViec"  onchange="myFunction()"></html:checkbox>
		      		     --%>
		      			<html:select styleId="maNoiLamViec" property="maNoiLamViec" styleClass="form-control" onchange="myFunction()">
		      				<option value="">--Nơi làm việc--</option>
							<html:optionsCollection name="timKiemBaiTuyenDungForm" property="listNoiLamViec" label="tenNoiLamViec" value="maNoiLamViec" />
						</html:select>
		      		</div>
		      		<div class="col-md-2" style="margin-left: 14px;">
<%--  <!-- Loc Kinh nghiem  -->        		
		      		 <html:checkbox property="locKinhNghiem" styleId="locKinhNghiem" onchange="myFunction()"></html:checkbox> --%>
		      		 
		      			<html:select styleId="maKinhNghiem" property="maKinhNghiem" styleClass="form-control" onchange="myFunction()">
		      				<option value="">--Kinh nghiệm--</option>
							<html:optionsCollection name="timKiemBaiTuyenDungForm"  property="listKinhNghiem" label="tenKinhNghiem" value="maKinhNghiem" />
						</html:select>
		      		</div>
	        	</div>
	        	
		      	<div class="row" style="margin:10px;">
	        		 <div class="col-md-3" style="margin-left: 73px;width: 300px;" >
	<%--  <!-- Loc câp bậc -->               		 
	        		  <html:checkbox property="locCapBac" styleId="locCapBac" onchange="myFunction()"></html:checkbox> --%>
	        		  
		      			<html:select styleId="maTD" property="maTD" styleClass="form-control" onchange="myFunction()">
		      				<option value="">-- Chọn Cấp bậc --</option>
							<html:optionsCollection name="timKiemBaiTuyenDungForm" property="listCapBac" label="tenCapBac" value="maCapBac" />
						</html:select>
		      		</div>
		      		 <div class="col-md-2" style="width: 200px;">
	<%--  <!-- Loc Loai cong viec -->               		 
	        		  <html:checkbox property="locLoaiCongViec" styleId="locLoaiCongViec" onchange="myFunction()"></html:checkbox>
	        		   --%>
		      			<html:select styleId="maLoaiCongViec" property="maLoaiCongViec" styleClass="form-control" onchange="myFunction()">
		      				<option value="">--Loại công việc--</option>
							<html:optionsCollection name="timKiemBaiTuyenDungForm" property="listLoaiCongViec" label="tenLoaiCongViec" value="maLoaiCongViec" />
						</html:select>
		      		</div>
		      		
		      		<div class="col-md-2" style="margin-left: 2px;width: 200px;">
	<%--  <!-- Loc Loai cong viec -->               		 
	        		    <html:checkbox property="locLuong" styleId="locLuong" onchange="myFunction()" ></html:checkbox>
	        		   --%>
		      			<html:select styleId="maLuong" property="maLuong" styleClass="form-control" onchange="myFunction()">
		      				<option value="">-- Chọn Lương --</option>
							<html:optionsCollection name="timKiemBaiTuyenDungForm" property="listLuong" label="tenLuong" value="maLuong" />
						</html:select>
		      		</div>
		      		<%-- <div class="col-md-2" style="margin-left: 16px;">
		      			<input type="button" value="Tìm Kiếm" onclick="myFunction()"  class="btn btn-primary" style="margin-top: 22px;"><br />
      					 <html:submit styleClass="btn btn-warning" style="width:168px">Tìm Kiếm</html:submit>
      				</div> --%>
		      	</div>		  
	      	 </html:form>
	      	   <script >
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
					 
					/*  var locNganh ="0";
					 var locKinhNghiem="0";
					 var locNoiLamViec="0";
					 var locCapBac="0";
					 var locLoaiCongViec="0";
					 var locLuong="0";
					 //loc  tim kiem
					 if ($('#locNganh').is(':checked')) {
					      locNganh ="1";
					 }
					 if ($('#locNoiLamViec').is(':checked')) {
						 locNoiLamViec ="1";
					 }
					 if ($('#locKinhNghiem').is(':checked')) {
						 locKinhNghiem ="1";
					 }
					 if ($('#locCapBac').is(':checked')) {
						 locCapBac ="1";
					 }
					 if ($('#locLoaiCongViec').is(':checked')) {
						 locLoaiCongViec ="1";
					 }
					 if ($('#locLuong').is(':checked')) {
						 locLuong ="1";
					 }
					 */
					 var url="/Admin/tk-baituyendung1.do?maNganh="+nganh+
							"&&maNoiLamViec="+noiLamViec+"&&maKinhNghiem="+namKN+
							"&&maTD="+capbac+"&&maLoaiCongViec="+maCV+"&&maLuong="+maLuong+
							"&&tieuDe="+chuyennganh;/* +"&&locNganh="+locNganh+"&&locNoiLamViec="+locNoiLamViec+
					         "&&locKinhNghiem="+locKinhNghiem+"&&locCapBac="+locCapBac+"&&locLoaiCongViec="+locLoaiCongViec+
					         "&&locLuong="+locLuong; */
					        
				  /*  alert(url) ; */
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
    	</div>	<!-- /Chuc nang tim kiem -->
    	<!-- Ket qua tra ve -->
    	<div class="container" style=" margin-top: 15px;">
	  	  <div class="row" style="background: #fff ;" >
	          <div class="content col-md-8 col-sm-9 col-xs-12" >
	          <p id="ketqua"></p>		
	            <h3 class="archive-title" id="ketqua">Danh sách bài tuyển dụng</h3>	
	            	<!-- <p id="ketqua"></p>			 -->		
						<div class="item-archive"
							style="border: 1px solid #fff; background: #f1fbff; margin-top: 10px">
							<div class="box box-white job">
								
								<p id="danhsach"></p>
							</div>
						</div>
						<!-- end .item -->
	       <!-- Phan trang -->
	   
	 	 </div> <!-- /Ket Quan tra ve -->
	  		
	  		<div class="sidebar col-md-4 col-sm-3 col-xs-12" style="margin-top: 30px;">
	            <div class="sidebar-item">
	              <h4 class="widget-title">Bài Tuyển Dụng mới</h4>
	              <div class="textwidget">
	               <logic:iterate name="timKiemBaiTuyenDungForm" property="listBaiTuyenDungMoi"
											id="baiviet">
											<div class="other-post-item">
												<div class="other-post-img" >
													<a href="#"><img src="images/cty5.jpg" style=" height: 137px;"></a>
												</div>
												<div class="other-post-info">

													<bean:define id="maBaiViet" name="baiviet"
														property="maBaiViet"></bean:define>
													<b><html:link action="/ct-baituyendung?maBaiViet=${maBaiViet}">
														<bean:write name="baiviet" property="tieuDe" />
													</html:link></b>
													<br>
													<b>Nơi làm viêc:</b><bean:write name="baiviet" property="noiLamViec" /><br>
													<b>Loại công việc:</b><bean:write name="baiviet" property="loaiHinhLamViec" />
													<br>
													<b>Lương:</b><bean:write name="baiviet" property="luong" /><br>
													<b>Ngày Đăng:</b><bean:write name="baiviet" property="ngayDang"/><br>
													<b>Hạn DK :</b><bean:write name="baiviet" property="hanNopHoSo" />
												
												</div>
											</div>
										</logic:iterate> 
	              </div>
	            </div>
	          </div>
	          
	        </div> 
         </div>
      </div>
  <jsp:include page="/footer.jsp"></jsp:include>
  </body>
</html>