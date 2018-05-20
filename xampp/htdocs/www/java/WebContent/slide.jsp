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
<title>Danh sách sinh viên</title>
</head>
<div id="myCarousel" class="carousel slide" data-ride="carousel"
	style="margin-top: 99px;">
	<!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
		<li data-target="#myCarousel" data-slide-to="3"></li>
		<li data-target="#myCarousel" data-slide-to="4"></li>
		<li data-target="#myCarousel" data-slide-to="5"></li>
	</ol>

	<!-- Wrapper for slides -->
	<div class="carousel-inner" role="listbox">
		<div class="item active">
			<img src="images/cty2.jpg" style="width: 1450px; height: 600px;">
			<div class="carousel-caption" style="padding-bottom: 150px;">
				<div class="row"
					style="background: rgba(60, 118, 118, 0.21);; padding-bottom: 50px;">
					<div class="col-md-12 col-sm-offset-1">
						<h1>
							Tìm Công Việc Mơ Ước. <br class="visible-xs"> <strong>Nâng
								Bước Thành Công!</strong>
						</h1>
					</div>
					<div class="col-md-3 col-sm-offset-1">
						<input type="text" class="form-control job-typeahead tt-input"
							placeholder="Nhập chức danh , vị trí , kĩ năng ...">
					</div>
					<html:form action="/tk-baituyendung">

						<div class="col-md-3">
							<html:select styleId="maNganh" property="maNganh"
								styleClass="form-control">
								<option value="">-- Chọn ngành --</option>
								<html:optionsCollection name="trangChuForm" property="listNganh"
									label="tenNganh" value="maNganh" />
							</html:select>
						</div>
						<div class="col-md-3">
							<html:select styleId="maNoiLamViec" property="maNoiLamViec"
								styleClass="form-control">
								<option value="">-- Chọn nơi làm việc--</option>
								<html:optionsCollection name="trangChuForm"
									property="listNoiLamViec" label="tenNoiLamViec"
									value="maNoiLamViec" />
							</html:select>
						</div>
						<div class="col-md-2">
							<html:submit styleClass="btn btn-primary">Tìm Kiếm</html:submit>
						</div>
					</html:form>
				</div>
			</div>
		</div>
		<div class="item">
			<img src="images/cty5.jpg" style="width: 1400px; height: 600px;">
			<div class="carousel-caption" style="padding-bottom: 150px;">
				<div class="row"
					style="background: rgba(60, 118, 118, 0.21);; padding-bottom: 50px;">
					<div class="col-md-12 col-sm-offset-1">
						<h1>
							Tìm Công Việc Mơ Ước. <br class="visible-xs"> <strong>Nâng
								Bước Thành Công!</strong>
						</h1>
					</div>
					<div class="col-md-3 col-sm-offset-1">
						<input type="text" class="form-control job-typeahead tt-input"
							placeholder="Nhập chức danh , vị trí , kĩ năng ...">
					</div>
					<html:form action="/tk-baituyendung">

						<div class="col-md-3">
							<html:select styleId="maNganh" property="maNganh"
								styleClass="form-control">
								<option value="">-- Chọn ngành --</option>
								<html:optionsCollection name="trangChuForm" property="listNganh"
									label="tenNganh" value="maNganh" />
							</html:select>
						</div>
						<div class="col-md-3">
							<html:select styleId="maNoiLamViec" property="maNoiLamViec"
								styleClass="form-control">
								<option value="">-- Chọn nơi làm việc--</option>
								<html:optionsCollection name="trangChuForm"
									property="listNoiLamViec" label="tenNoiLamViec"
									value="maNoiLamViec" />
							</html:select>
						</div>
						<div class="col-md-2">
							<html:submit styleClass="btn btn-primary">Tìm Kiếm</html:submit>
						</div>
					</html:form>
				</div>
			</div>
		</div>

		<div class="item">
			<img src="images/cty6.jpg" style="width: 1400px; height: 600px;">
			<div class="carousel-caption" style="padding-bottom: 150px;">
				<div class="row"
					style="background: rgba(60, 118, 118, 0.21);; padding-bottom: 50px;">
					<div class="col-md-12 col-sm-offset-1">
						<h1>
							Tìm Công Việc Mơ Ước. <br class="visible-xs"> <strong>Nâng
								Bước Thành Công!</strong>
						</h1>
					</div>
					<div class="col-md-3 col-sm-offset-1">
						<input type="text" class="form-control job-typeahead tt-input"
							placeholder="Nhập chức danh , vị trí , kĩ năng ...">
					</div>
					<html:form action="/tk-baituyendung">

						<div class="col-md-3">
							<html:select styleId="maNganh" property="maNganh"
								styleClass="form-control">
								<option value="">-- Chọn ngành --</option>
								<html:optionsCollection name="trangChuForm" property="listNganh"
									label="tenNganh" value="maNganh" />
							</html:select>
						</div>
						<div class="col-md-3">
							<html:select styleId="maNoiLamViec" property="maNoiLamViec"
								styleClass="form-control">
								<option value="">-- Chọn nơi làm việc--</option>
								<html:optionsCollection name="trangChuForm"
									property="listNoiLamViec" label="tenNoiLamViec"
									value="maNoiLamViec" />
							</html:select>
						</div>
						<div class="col-md-2">
							<html:submit styleClass="btn btn-primary">Tìm Kiếm</html:submit>
						</div>
					</html:form>
				</div>
			</div>
		</div>
		<div class="item">
			<img src="images/cty7.jpg" style="width: 1400px; height: 600px;">
			<div class="carousel-caption" style="padding-bottom: 150px;">
				<div class="row"
					style="background: rgba(60, 118, 118, 0.21);; padding-bottom: 50px;">
					<div class="col-md-12 col-sm-offset-1">
						<h1>
							Tìm Công Việc Mơ Ước. <br class="visible-xs"> <strong>Nâng
								Bước Thành Công!</strong>
						</h1>
					</div>
					<div class="col-md-3 col-sm-offset-1">
						<input type="text" class="form-control job-typeahead tt-input"
							placeholder="Nhập chức danh , vị trí , kĩ năng ...">
					</div>
					<html:form action="/tk-baituyendung">

						<div class="col-md-3">
							<html:select styleId="maNganh" property="maNganh"
								styleClass="form-control">
								<option value="">-- Chọn ngành --</option>
								<html:optionsCollection name="trangChuForm" property="listNganh"
									label="tenNganh" value="maNganh" />
							</html:select>
						</div>
						<div class="col-md-3">
							<html:select styleId="maNoiLamViec" property="maNoiLamViec"
								styleClass="form-control">
								<option value="">-- Chọn nơi làm việc--</option>
								<html:optionsCollection name="trangChuForm"
									property="listNoiLamViec" label="tenNoiLamViec"
									value="maNoiLamViec" />
							</html:select>
						</div>
						<div class="col-md-2">
							<html:submit styleClass="btn btn-primary">Tìm Kiếm</html:submit>
						</div>
					</html:form>
				</div>
			</div>
		</div>

		<div class="item">
			<img src="images/cty8.png" style="width: 1400px; height: 600px;">
			<div class="carousel-caption" style="padding-bottom: 150px;">
				<div class="row"
					style="background: rgba(60, 118, 118, 0.21);; padding-bottom: 150px;">
					<div class="col-md-12 col-sm-offset-1">
						<h1>
							Tìm Công Việc Mơ Ước. <br class="visible-xs"> <strong>Nâng
								Bước Thành Công!</strong>
						</h1>
					</div>
					<div class="col-md-3 col-sm-offset-1">
						<input type="text" class="form-control job-typeahead tt-input"
							placeholder="Nhập chức danh , vị trí , kĩ năng ...">
					</div>
					<html:form action="/tk-baituyendung">

						<div class="col-md-3">
							<html:select styleId="maNganh" property="maNganh"
								styleClass="form-control">
								<option value="">-- Chọn ngành --</option>
								<html:optionsCollection name="trangChuForm" property="listNganh"
									label="tenNganh" value="maNganh" />
							</html:select>
						</div>
						<div class="col-md-3">
							<html:select styleId="maNoiLamViec" property="maNoiLamViec"
								styleClass="form-control">
								<option value="">-- Chọn nơi làm việc--</option>
								<html:optionsCollection name="trangChuForm"
									property="listNoiLamViec" label="tenNoiLamViec"
									value="maNoiLamViec" />
							</html:select>
						</div>
						<div class="col-md-2">
							<html:submit styleClass="btn btn-primary">Tìm Kiếm</html:submit>
						</div>

					</html:form>

				</div>
			</div>
		</div>

	</div>
	<!-- Left and right controls -->
	<a class="left carousel-control" href="#myCarousel" role="button"
		data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
		aria-hidden="true"></span> <span class="sr-only">Previous</span>
	</a> <a class="right carousel-control" href="#myCarousel" role="button"
		data-slide="next"> <span class="glyphicon glyphicon-chevron-right"
		aria-hidden="true"></span> <span class="sr-only">Next</span>
	</a>
</div>