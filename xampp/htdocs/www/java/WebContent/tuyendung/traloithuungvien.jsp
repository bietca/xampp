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
<title>Trả lời thư</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-te-1.4.0.min.js"
	charset="utf-8"></script>
<link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css" />
</head>
<body style="background: #eee">
	<div id="wrapper" style="with: 300px;">
		<div class="container"
			style="width: 800px; margin-left: 16%; margin-top: 35px;">
			<html:form action="/traloithu-ungtuyen">
				<div id="box" class="row">
					<div class="col-sm-1"></div>
					<div class="row col-md-10">
						<h1 style="margin-left: 240px;">Trả lời ứng viên</h1>
						<div class="row">
							<div class="form-group col-md-12" style="margin-top: 10px;">
								<label class="col-md-4">Email Nhà tuyển dụng</label>
								<div class="col-md-7">
									<html:text name="traLoiThuForm" property="emailNhaTuyenDung"
										styleClass="form-control" readonly="true"></html:text>
								</div>
							</div>
							<div class="form-group col-md-12" style="margin-top: 10px;">
								<label class="col-md-4">Email Ứng viên</label>
								<div class="col-md-7">
									<html:text name="traLoiThuForm" property="emaiNguoiTimViec"
										styleClass="form-control" readonly="true"></html:text>
								</div>
							</div>
						</div>
						<div class=" row">
							<div class="form-group col-md-12">
								<label class="col-md-4">Tiêu đề</label>
								<html:errors property="loirong" />
								<div class="col-md-7">
									<html:text name="traLoiThuForm" property="tieuDe"
										styleClass="form-control"></html:text>
								</div>
							</div>
						</div>
						<div class="form-group col-md-12">
							<label>Nội Dung thư</label>
							<html:textarea name="traLoiThuForm" property="noiDung"
								styleClass="jqte-test"></html:textarea>
							<html:hidden name="traLoiThuForm" property="trangThai"
								styleClass="form-control" value="0"></html:hidden>
							<html:hidden name="traLoiThuForm" property="trangThai2"
								styleClass="form-control" value="0"></html:hidden>
						</div>
						<hr>
						<div class="form-group col-md-12">
							<html:submit property="submit" value="submit"
								styleClass="btn btn-success">Trả lời</html:submit>
							<html:link action="/qlhopthu-tuyendung.do"> Trở về</html:link>
						</div>
					</div>
				</div>
			</html:form>
		</div>

		<script>
			$('.jqte-test').jqte();
		</script>
	</div>
</body>
</html>