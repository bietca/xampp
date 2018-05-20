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

<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script src="js/sweetalert.js"></script>
<link rel="stylesheet" href="css/sweetalert.css">
</head>
<body style="background: #eee">
	<jsp:include page="menunhatuyendung.jsp"></jsp:include>
	<div class="container" style="margin-top: 35px;">
		<div class="row">
			<bean:define id="ungvien" name="nhaTuyenDungForm"
				property="nhaTuyenDung1"></bean:define>
			<html:form action="/sua-nhatuyendung?email=${email}" styleClass="sua">
				<div class="col-md-8 content">
					<div class="post">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">Thông Tin Cá Nhân</h3>
							</div>
							<div class="panel-body">
								<bean:define id="email" name="ungvien" property="email"></bean:define>
								<html:form action="/sua-nhatuyendung?email=${email}"
									styleClass="sua">
									<table>
										<tr>
											<td><h4>Họ Tên :</h4></td>
											<td class="col-ml-6" style="width: 450px;">

												<h3>
													<p style="color: green">
														<html:errors property="suaok"></html:errors>
													</p>
													<html:text name="ungvien" property="tenNhaTuyenDung"
														styleClass="form-control"></html:text>
												</h3>
											</td>
										</tr>

										<tr>
											<td><h4>Số điện thoại</h4></td>
											<td><html:text name="ungvien" property="soDienThoai"
													styleClass="form-control"></html:text>
												<p style="color: red">
													<html:errors property="loisdt" />
												</p></td>

										</tr>
										<tr>
											<td><h4>Email</h4></td>
											<td>
												<h3>
													<html:text name="ungvien" property="email"
														styleClass="form-control" readonly="true"></html:text>
												</h3>
											</td>

										</tr>
										<tr>
											<td><h4>Địa chỉ</h4></td>
											<td>
												<h3>
													<html:text name="ungvien" property="diaChi"
														styleClass="form-control"></html:text>
												</h3>
											</td>

										</tr>
										<tr>
											<td><h4>Website</h4></td>
											<td>
												<h3>
													<html:text name="ungvien" property="website"
														styleClass="form-control">
													</html:text>
												</h3>

											</td>
											<td><h4></h4></td>
										</tr>


										<tr>
											<td><h4>Tên Công ty</h4></td>
											<td><h3>
													<html:text name="ungvien" property="tenCongTY"
														styleClass="form-control"></html:text>
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
								<div class="col-md-4">
									<div class="">
										<img alt="" src="images/anh.png" width="80px" height="80px" />
									</div>
								</div>
								<div class="col-md-8">
									<div>
										<h4>
											<bean:write name="tenDangNhap" />
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
			</html:form>
		</div>
		<script type="text/javascript">
  			 function sua(){
  				 confirm('Bạn muốn sửa thông tin ?')
  				 ducoment.form[0].submit();
  			 }
  			document.querySelector('.sweet-5').onclick = function(){
  		        swal({
  		          title: "Bạn muốn sưa thông tin ?",
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
  		          } else {
  		            swal("Không sửa");
  		          }
  		        });
  		      }; 
  				</script>
	</div>
	<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>