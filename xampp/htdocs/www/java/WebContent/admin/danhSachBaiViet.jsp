
<%@page import="model.bean.*"%>
<%@page import="java.util.ArrayList"%>
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
<script src="js/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link href="../css/font-awesome.min.css" rel="stylesheet">
<link href="../css/compiled.min.css" rel="stylesheet">
<link href="../css/mdb.min.css" rel="stylesheet">
<link href="../css/sweetalert.css" rel="stylesheet">

</head>
<body>
	<jsp:include page="/admin/header.jsp"></jsp:include>
	<section id="main-content">
		<div class="row">

			<html:form action="/danh-sachbaiviet" method="post">
				<center>
					<h3>Quản Lí Bài Viết</h3>
				</center>
				<br>
				<div class="col-lg-4">
					<html:select property="pheDuyet" styleClass="form-control">
						<option value="-1">-- Chọn Trạng Thái Bài Viết --</option>
						<html:optionsCollection name="danhSachBaiVietForm"
							property="listPheDuyet" label="tenPheDuyet" value="pheDuyet" />
					</html:select>
				</div>
				<script type="text/javascript">
            	$("[name='pheDuyet']").val('<bean:write name="danhSachBaiVietForm" property="pheDuyet"/>');
            </script>
				<html:submit styleClass="btn btn-primary">Xem</html:submit>

			</html:form>
		</div>


		<!--  <div class="bs-example">
  <br> -->
		<table class="table table-striped" style="margin-left: 10PX;">

			<thead>
				<tr>
					<th>ID</th>
					<th>Tiêu Đề</th>
					<!--  <th>Công Ty</th> -->
					<th>SDT</th>
					<!--  <th>Mô Tả Công Việc</th> -->
					<th>Email</th>
					<th>Duyệt</th>
					<th>Chức Năng</th>
				</tr>
			</thead>
			<tbody>
				<logic:iterate name="danhSachBaiVietForm" property="listBaiViet"
					id="sv">
					<tr>  
					    <html:hidden name="sv" property="maBaiViet" styleId="maBaiViet"/>
						<th scope="row"><bean:write name="sv" property="maBaiViet"  />
						</th>
						<td class="col-md-2"><bean:write name="sv" property="tieuDe" />
						</td>					
						<td><bean:write name="sv" property="soDienThoai" /></td>					
						<td><bean:write name="sv" property="yeuCauUngVien" /></td>
						<td><bean:write name="sv" property="pheDuyet" /></td>


						<td><bean:define id="maBaiViet" name="sv" 	property="maBaiViet"></bean:define>
                        <logic:equal name="sv" property="pheDuyet" value="1">
                                    <button class="btn btn-action" type="button" name="pheduyet"
									data-toggle="tooltip" data-placement="top" title="Bỏ phê duyệt bài viết">
									<html:link action="/suaBaiViet?maBaiViet=${maBaiViet}&&pheDuyet=1" 
										onclick="return confirm('Ban có chắc muốn bỏ duyet Bài Viết này?')" >
										<i class="glyphicon glyphicon-lock"></i>
									</html:link>
								</button>
                       </logic:equal>
                                 
                          <logic:equal name="sv" property="pheDuyet" value="0">
                                    <button class="btn btn-action" type="button"data-toggle="tooltip"
                                       name="pheduyet" data-placement="top" title="phê duyệt bài viết">
									 
									 <html:link action="/suaBaiViet?maBaiViet=${maBaiViet}&&pheDuyet=0" 
										onclick="return confirm('Ban có chắc muốn Phê Duyêt Bài Viết này?')" >
										<i class="glyphicon glyphicon-check"></i>
									
									</html:link>
								</button>
                         </logic:equal>
                               <bean:define id="pheDuyet" name="sv" property="pheDuyet"></bean:define>
								<button class="btn btn-action" type="button" name="pheduyet"
									data-toggle="tooltip" data-placement="top" title="xem bài tuyển dụng">      
									<html:link action="/xembaiduyet?maBaiViet=${maBaiViet}&&pheDuyet=${pheDuyet}"
										target="_BLANK"
										onclick="return confirm('Ban có chắc muốn Xem Bài Viết này?')">

										<i class="glyphicon glyphicon-eye-open"></i>
									</html:link>
								</button>
								
								
								<button class="btn btn-action" type="button" name="pheduyet"
									data-toggle="tooltip" data-placement="top" title="xóa bài tuyên dụng">

									<html:link action="/xoaBaiViet?maBaiViet=${maBaiViet} "
										onclick="return confirm('Bạn  muốn Xóa Bài Viết này?')">

										<i class="glyphicon glyphicon-trash"></i>
									</html:link>
								</button>
					</tr>
					
				</logic:iterate>
			</tbody>
		</table>

   <!--   <script type="text/javascript">
         $(function(){
    	    var inputVal = $('#maBaiViet').val();
    	    $('#pheduyet').click(function(){
    	       alert(inputVal); 
    	    });
    	});
    	</script>  
		 -->
	</section>


</body>
</html>