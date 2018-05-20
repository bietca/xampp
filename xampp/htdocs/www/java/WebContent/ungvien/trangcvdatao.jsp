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
<title>CV đã tạo</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body style="background: #eee">
	<jsp:include page="menuungvien.jsp"></jsp:include>
	<div class="container" style="margin-bottom: 260px;">
		<div class="row" style="margin-top: 20px;">
			<div class="col-md-6">
				<html:link action="/taocv-ungvien" styleClass="btn btn-primary">
					<span class="glyphicon glyphicon-plus"> Thêm Hồ Sơ</span>
				</html:link>
			</div>
		</div>
		<div class="row">
			<div class="content col-md-8 col-sm-9 col-xs-12"
				style="border-color: black;">
				<h3 class="archive-title">Danh sách CV</h3>
				<logic:iterate name="trangCVDaTaoForm" property="listHoSo" id="hoSo">
					<div class="item-archive"
						style="border: 1px solid #fff; background: #f1fbff; margin-top: 10px">
						<div class="box box-white job">
							<div class="row">
								<div class="hidden-xs col-sm-2">
									<a href="#" title="<bean:write name="hoSo" property="anh"  />"><span><img
											src="<bean:write name="hoSo" property="anh" />" width="140px"
											height="150px" /></span></a>
								</div>
								<div class="col-md-6 col-sm-10" style="padding-left: 60px;">
									<h4 class="job-title">
										<p>
											Mã Hồ sơ :
											<bean:write name="hoSo" property="maCV" />
										</p>
										<bean:write name="hoSo" property="chuyenNganh" />
										<br>
										<bean:write name="hoSo" property="hoTen" />
									</h4>
									<bean:define id="maCV" name="hoSo" property="maCV"></bean:define>
									<html:link action="/xemcv-ungvien?maCV=${maCV}">
										<span class="glyphicon glyphicon-edit">Xem chi tiết ...</span>
									</html:link>
									<div></div>

									<div class="col-md-12 col-sm-10"
										style="margin-left: 400px; padding: 5px;">
										<div class="col-md-1">
											<html:link styleClass="btn btn-primary"
												action="/suahoso-ungvien?maHoSo=${maCV}">
												<i class="edit-alt2-icon">Sửa</i>
											</html:link>
										</div>
										<div class="col-md-offset-3">
											<html:link styleClass="btn btn-danger"
												action="/xoahoSo-ungvien?maHoSo=${maCV}"
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
	<div style="margin-top: 400px;">
		<jsp:include page="/footer.jsp"></jsp:include>
	</div>

</body>
</html>