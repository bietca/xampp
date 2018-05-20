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
<title>Hộp thư</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body style="background: #eee">
	<jsp:include page="menuungvien.jsp"></jsp:include>
	<div class="container">
		<div>
			<ul class=" nav nav-pills nav-stacked col-xs-12 col-md-2"
				style="background: #fff">
				<li><a data-toggle="pill" href="#home">Thư đã ứng tuyển</a></li>
				<li><a data-toggle="pill" href="#menu1">Thư đã nhận</a></li>
				<li><a data-toggle="pill" href="#menu2">Thư đã gửi</a></li>
			</ul>

			<div class="tab-content col-md-9">
				<div id="home" class="tab-pane fade in active">
					<table class="table table-hover" style="background: #fff;">
						<thead>
							<tr>
								<th>Email</th>
								<th>MaBaiUngTuyen</th>
								<th>Mã CV đã ứng tuyên</th>
								<th>Ngày ứng tuyển</th>
								<th colspan="2">Hành động</th>
							</tr>
						</thead>
						<tbody>
							<logic:iterate name="trangCVDaUngTuyenForm"
								property="listThuUngTuyenNhanh" id="thu">
								<tr>
									<td><bean:write name="thu" property="emailNhaTuyenDung" />
									</td>
									<td><bean:write name="thu" property="maBaiTuyenDung" /></td>
									<td><bean:write name="thu" property="maCV" /></td>
									<td><bean:write name="thu" property="ngayUngTuyen" /></td>
									<td><bean:define id="maBaiTuyenDung" name="thu"
											property="maBaiTuyenDung" /> <html:link
											action="/cvut-ungvien?maBaiTuyenDung=${maBaiTuyenDung}">Xem chi tiết</html:link>
									</td>
								</tr>
							</logic:iterate>
						</tbody>
					</table>
				</div>
				<div id="menu1" class="tab-pane fade">
					<html:form action="/cvdt-ungvien1">
						<html:select name="trangCVDaUngTuyenForm" property="trangthai"
							styleClass="form-control" styleId="trangThai"
							onchange="myFunction()">
							<html:option value="3">Tất Cả</html:option>
							<html:option value="0">Chưa xem</html:option>
							<html:option value="1">Đã xem</html:option>
						</html:select>
					</html:form>
					<!--  <div id="danhsach"></div>	 -->
					<table class="table "
						style="width: 109%; background: #fff; margin-top: 10px;">
						<thead>
							<tr>
								<th>Email Nhà tuyển dụng</th>
								<!--  <th>Email ứng viên nhận</th> -->
								<th>Tiêu đề</th>
								<th>Ngày nhận</th>
								<th>Chi tiết</th>
							</tr>
						</thead>
						<tbody id="danhsach">
						</tbody>
					</table>
					<script>
						var request;
						function myFunction() {

							var trangthai = document
									.getElementById("trangThai").value;
							var url = "/Admin/cvdt-ungvien1.do?trangthai="
									+ trangthai;

							if (window.XMLHttpRequest) {
								request = new XMLHttpRequest();
							} else if (window.ActiveXObject) {
								request = new ActiveXObject("Microsoft.XMLHTTP");
							}

							try {
								request.onreadystatechange = getInfo;
								request.open("GET", url, true);
								request.send();
							} catch (e) {
								alert("Unable to connect to server");
							}
						}
						function getInfo() {
							if (request.readyState == 4) {
								var val = request.responseText;
								/* alert(val);   */
								var ketqua = "";
								var items = JSON.parse(val);
								/*  alert(items); */
								for ( var index in items) {

									ketqua += " <tr class=\"success\">"
											+ "        <tr>"
											+ " <td> "
											+ items[index].emailNhaTuyenDung
											+ "</td>"
											/* +"<td>"+items[index].emailNguoiTimViec+"</td>" */
											+ "<td>"
											+ items[index].tieuDe
											+ " </td>"
											+ "<td>"
											+ items[index].ngayPhanHoi
											+ " </td>"
											+ "<td><a href=\"/Admin/xemthunhan-ungvien.do?maPhanHoi="
											+ items[index].maPhanHoi
											+ "\" target=\"_BLANK\">Xem chi tiết Thu</a></td>"
											+ "   </tr>  ";
								}
								$("#danhsach").html(ketqua);
							}
						}
					</script>
				</div>
				<div id="menu2" class="tab-pane fade">
					<table class="table " style="width: 89%; background: #fff">
						<thead>
							<tr>
								<th>Email Nhà tuyển dụng</th>
								<!--  <th>Email ứng viên gửi</th> -->
								<th>Tiêu đề</th>
								<th>Ngày gửi</th>
								<th>Chi tiết</th>
							</tr>
						</thead>
						<tbody>

							<logic:iterate name="trangCVDaUngTuyenForm"
								property="listThuUngVienDagui" id="thu">
								<tr class="success">
								<tr>
									<html:hidden name="thu" property="maPhanHoi" />
									<td><bean:write name="thu" property="emailNhaTuyenDung" />
									</td>
									<%-- <td><bean:write name="thu" property="emailNguoiTimViec"/> </td>  --%>
									<td><bean:write name="thu" property="tieuDe" /></td>
									<td><bean:write name="thu" property="ngayPhanHoi" /></td>
									<td><bean:define id="maPhanHoi" name="thu"
											property="maPhanHoi"></bean:define> <html:link
											action="/xemthugui-ungvien?maPhanHoi=${maPhanHoi}"
											target="_blank">Xem chi tiết Thu</html:link></td>
								</tr>
							</logic:iterate>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
