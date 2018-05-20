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
<title>Quản lý hộp thư</title>
<link rel="stylesheet" href="css/style.css" />

<script src="js/jquery.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script src="js/bootstrap.min.js"></script>

</head>
<body style="background: #eee">
	<jsp:include page="menunhatuyendung.jsp"></jsp:include>
	<div class="container">
		<div>
			<ul class=" nav nav-pills nav-stacked col-xs-12 col-md-2"
				style="background: #fff">
				<li><a data-toggle="pill" href="#home">Thư ứng tuyển</a></li>
				<li><a data-toggle="pill" href="#menu1">Thư đã nhận</a></li>
				<li><a data-toggle="pill" href="#menu2">Thư đã gửi</a></li>
			</ul>

			<div class="tab-content col-md-9">
				<div id="home" class="tab-pane fade in active">
					<html:form action="/qlhopthu-tuyendung1">
						<html:select name="quanLyHopThuFrom" property="trangthai"
							styleClass="form-control" style="width: 735px;"
							styleId="trangThai">
							<html:option value="3">Tất Cả</html:option>
							<html:option value="0">Chưa xem</html:option>
							<html:option value="1">Đã xem</html:option>
						</html:select>
					</html:form>
					<table class="table " style="width: 89%; background: #fff">
						<thead>
							<tr>
								<th>Email ứng Viên</th>
								<th>Mã Bài tuyển dụng</th>
								<th>Macv</th>
								<th>Tiêu đè</th>
								<th>Ngày gửi</th>
								<th>Chi tiết</th>
							</tr>
						</thead>
						<tbody id="danhsach1">
						</tbody>
					</table>
					<script type="text/javascript">
    	
    	//load data ajax server -> client
    	function loadDataAjax(){  		
    		var trangThai=$('#trangthai').val();		
			$.ajax({
				type:'POST',
				async: true,
				url:'/Admin/qlhopthu-tuyendung1.do',
				data:"trangthai="+trangThai,
				cache:false,
				dataType:'json',
				success: function (response){
					//chuyển đổi JSONObject -> JSON
					var listHoSoUngTuyen=response.listHoSoUngTuyen;
					var listthuanhan=response.val;
					/* alert('adada'); */
					var arr = [];
					var ketqua1="";
					//chuyển đổi JSONObject -> JSON
					//var listThuNhan=response.listThuNhan;	
					for ( var key in listHoSoUngTuyen) {
                    	//set data from json to array
                    	arr.push(key);
                    	console.log(arr);
					}
					if(listHoSoUngTuyen.length!=0){
 						for ( var index in listHoSoUngTuyen) {							
					       ketqua1+=" <tr class=\"success\">"
					  		+"<tr>"
						    +" <td> "+listHoSoUngTuyen[index].emaiNguoiTimViec+ "</td>"
							+"<td>"+listHoSoUngTuyen[index].maBaiTuyenDung+"</td>"
							+"<td>"+listHoSoUngTuyen[index].maCV+" </td>"
							+"<td>"+listHoSoUngTuyen[index].tieuDe+" </td>"
							+"<td>"+listHoSoUngTuyen[index].ngayUngTuyen+" </td>"
							+"<td><a href=\"/Admin/ql-xemchitiet.do?maCV="+ listHoSoUngTuyen[index].maCV +"\" target=\"_BLANK\">Xem chi tiết CV</a></td>"
							+"   </tr>  "; 
							} 
					}else{
						ketqua1=" <p style=\"color:red;\">Bạn không có thư </p>";
					}
	                 var listnha="";
					if(listthuanhan.length!=0){
						 for (var index1 in listthuanhan) {  
				        	  
							 listnha+=" <tr class=\"success\">"
						  		+"        <tr>"
							  /*   +" <td> "+items[index1].emailNhaTuyenDung+ "</td>" */
								+"<td>"+listthuanhan[index1].emailNguoiTimViec+"</td>"
								+"<td>"+listthuanhan[index1].tieuDe+" </td>"
								+"<td>"+listthuanhan[index1].ngayPhanHoi+" </td>"
								+"<td><a href=\"/Admin/xemthunhan-tuyendung.do?maPhanHoi="+ listthuanhan[index1].maPhanHoi +"\" target=\"_BLANK\">Xem chi tiết Thu</a></td>"
								+"   </tr>  ";
						 }	
						 
						
					}
					else{
						listnha=" <p style=\"color:red;\">Bạn không có thư </p>";
					 }
				 $("#danhsach").html(listnha);
                  //hien thi table danh sach
			 	   $('#danhsach1').html(ketqua1);
    
				},
				error: function(e){
					if (trangthai=="" || trangthai==null) {
						alert('vui long chon nam');
						return;
					}	
                }
			});
		
    	}
    	
    	//su kien lay data
    	$(function(){
			
    		$('#trangThai').change(function(){
    			loadDataAjax();
    		});	   	
    	});
    	
    </script>

					<!-- end ajax -->

				</div>

				<div id="menu1" class="tab-pane fade">
					<html:form action="/qlhopthu-tuyendung1">
						<html:select name="quanLyHopThuFrom" property="trangthai"
							styleClass="form-control" style="width: 735px;"
							styleId="trangthai" onchange="loadDataAjax()">
							<html:option value="3">Tất Cả</html:option>
							<html:option value="0">Chưa xem</html:option>
							<html:option value="1">Đã xem</html:option>
						</html:select>
					</html:form>
					<br>
					<table class="table " style="width: 89%; background: #fff">
						<thead>
							<tr>
								<!-- 	<th>Email Nhà tuyển dụng</th> -->
								<th>Email người gửi</th>
								<th>Tiêu đề</th>
								<th>Ngày gửi</th>
								<th>Chi tiết</th>
							</tr>
						</thead>
						<tbody id="danhsach">
						</tbody>
					</table>
					<!--   <script >
		             var request;  
		               function myFunction()  
				 {  
					
					 var trangthai = document.getElementById("tranghai").value;
					 var url="/Admin/qlhopthu-tuyendung1.do?trangthai="+trangthai;
				   
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
					  alert(val);  
					 var ketqua="";
					 var items = JSON.parse(val);
					/*  alert(items); */
					          for (var index1 in items) {  
					        	  
					        ketqua+=" <tr class=\"success\">"
					  		+"        <tr>"
						  /*   +" <td> "+items[index1].emailNhaTuyenDung+ "</td>" */
							+"<td>"+items[index1].emailNguoiTimViec+"</td>"
							+"<td>"+items[index1].tieuDe+" </td>"
							+"<td>"+items[index1].ngayPhanHoi+" </td>"
							+"<td><a href=\"/Admin/xemthunhan-tuyendung.do?maPhanHoi="+ items[index1].maPhanHoi +"\" target=\"_BLANK\">Xem chi tiết Thu</a></td>"
							+"   </tr>  ";
					          }			        
					 $("#danhsach").html(ketqua);
					 }  
				 }  
				 </script>   -->
				</div>
				<div id="menu2" class="tab-pane fade">
					<table class="table " style="width: 89%; background: #fff">
						<thead>
							<tr>
								<!--  <th>Email Nhà tuyển dụng</th> -->
								<th>Email người nhận</th>
								<th>Tiêu đề</th>
								<th>Ngày Nhận</th>
								<th>Chi tiết</th>
							</tr>
						</thead>
						<tbody>
							<logic:iterate name="quanLyHopThuFrom"
								property="listTraLoiThuUngVien" id="thu">
								<tr class="success">
								<tr>
									<html:hidden name="thu" property="maPhanHoi" />
									<%--  <td><bean:write name="thu" property="emailNhaTuyenDung"/> </td> --%>
									<td><bean:write name="thu" property="emailNguoiTimViec" />
									</td>
									<td><bean:write name="thu" property="tieuDe" /></td>
									<td><bean:write name="thu" property="ngayPhanHoi" /></td>
									<td><bean:define id="maPhanHoi" name="thu"
											property="maPhanHoi"></bean:define> <html:link
											action="/xemthugui-tuyendung?maPhanHoi=${maPhanHoi}"
											target="_blank">Xem chi tiết</html:link></td>
								</tr>
							</logic:iterate>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<div style="margin-top: 350px;">
		<jsp:include page="/footer.jsp"></jsp:include>
	</div>

</body>
</html>
