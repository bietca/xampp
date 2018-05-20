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
<title>Trang cá nhân</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-te-1.4.0.min.js"
	charset="utf-8"></script>
<link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css" />
<script src="js/sweetalert.js"></script>
<link rel="stylesheet" href="css/sweetalert.css">
</head>
<body style="background: #eee">
	<jsp:include page="menuungvien.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col-md-8 content">

				<div class="post">
					<div class="panel panel-default">
						<bean:define id="ungvien" name="trangCaNhanUngVienForm"
							property="ungVien"></bean:define>
						<div class="panel-heading">
							<h3 style="color: green">
								<html:errors property="loisua" />
							</h3>
							<h3 class="panel-title">Thông Tin Cá Nhân</h3>
						</div>
						<div class="panel-body">
							<bean:define id="email" name="ungvien" property="email"></bean:define>
							<html:form action="/sua-ungvien?email=${email}" styleClass="sua">
								<table>
									<tr>
										<td><h4>Họ Tên  </h4></td>
										<td class="col-ml-6" style="width: 450px;">
											<h3>
												<html:text name="ungvien" property="tenNguoiDung"
													styleClass="form-control col-md-offset-1" maxlength="50"></html:text>
											</h3>
										</td>
									</tr>
									<tr>
										<td><h4>Ngày Sinh  </h4></td>
										<td><h3>
												<html:text name="ungvien" property="ngaySinh"
													styleClass="form-control col-md-offset-1" maxlength="12" ></html:text>
													<span style="color: red"><html:errors property="loingay"/></span>
											</h3></td>
									</tr>
									<tr>
										<td><h4>Giới Tính</h4></td>
										<td>
											<h3>
												<html:text name="ungvien" property="gioiTinh"
													styleClass="form-control col-md-offset-1" maxlength="5"></html:text>
											</h3>
										</td>
									</tr>
									<tr>
										<td><h4>Điện thoại </h4></td>
										<td>
											<h3>
												<html:text name="ungvien" property="soDienThoai"
													styleClass="form-control col-md-offset-1" maxlength="11" ></html:text>
											    </h3><span style="color: red"> <html:errors property="loiso" /></span> 
										</td>
									</tr>
									<tr>
										<td><h4>Email </h4></td>
										<td>
											<h3>
												<html:text name="ungvien" property="email" readonly="true"
													styleClass="form-control col-md-offset-1">
												</html:text>
										</td>
										<td><h4></h4></td>
									</tr>
									<tr>
										<td><h4>Địa chỉ </h4></td>
										<td><h3>
												<html:text name="ungvien" property="queQuan"
													styleClass="form-control col-md-offset-1" maxlength="100"></html:text>
											</h3>
									</tr>
								</table>
							</html:form>
						</div>
					</div>
				</div>
				<!--/post-->
			</div>
			<!--/contet-->
			<div class="col-md-4 sidebar">
				<div class="panel panel-info newpost">
					<div class="panel-heading">
						<h3 class="panel-title">Xin Chào !</h3>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-md-3">
								<div class="">
									<img alt="" src="images/anh.png" width="80px" height="80px" />
								</div>
							</div>
							<div class="col-md-9">
								<div>
									<h4>
										<bean:write name="tenDangNhap" />
									</h4>
								</div>
								<div>
									<h4>
										<bean:write name="ungvien" property="ngaySinh" />
									</h4>
								</div>
								<div class="col-sm-2 text-center">
									<p>
										<button class="btn btn-primary sweet-5"
											onclick="_gaq.push(['_trackEvent', 'example', 'try', 'sweet-5']);">Sửa</button>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--/sidebar-->
		</div>
		<script type="text/javascript">
  			document.querySelector('.sweet-5').onclick = function(){
  		        swal({
  		          title: "Bạn muốn sưa thông tin?",
  		          type: "warning",
  		          showCancelButton: true,
  		          confirmButtonClass: 'btn-danger',
  		          confirmButtonText: 'sửa',
  		          cancelButtonText: "Không!",
  		          closeOnConfirm: false,
  		          closeOnCancel: false
  		        },
  		        function(isConfirm){
  		          if (isConfirm){
  		            swal("sửa",document.forms[0].submit());
  					return true;
  		          }  else {
  		            swal("Không sửa");
  		          } 
  		        });
  		      };
  				</script>
	</div>
	<%-- <div style="margin-top: 300px;">
		<jsp:include page="/footer.jsp"></jsp:include>
	</div> --%>
</body>
</html>