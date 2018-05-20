<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="admin/js/jquery.min.js"></script>
   	<script src="admin/js/highcharts.js"></script> 
   	<script src="admin/js/data.js"></script>
<title>Thống kê</title>
</head>
<body>
	<jsp:include page="/admin/header.jsp"></jsp:include>
	
	<section id="main-content">
		<section class="wrapper">
			<div class="row">
				<div class="col-lg-12">
					<section class="panel">
						<header class="panel-heading"> Thống kê </header>
						<div class="panel-body">
							<div class="form">
								<html:form action="/thongKe" method="post">
									<div style="text-align: center;">
										<%-- <html:text property="tuNgay" styleId="datepicker1" styleClass="datepicker1" ></html:text>
										<html:text property="denNgay" styleId="datepicker" styleClass="datepicker"></html:text> --%>
										
										<input type="date" name="tuNgay" />
										<input type="date" name="denNgay" />
										<html:submit styleClass="btn btn-primary">Xem</html:submit>
										 <bean:write name="chartForm" property="thongBao" filter="false"/> 
									</div>
									
									<bean:define id="x" name="chartForm" />
									<label id="test1" style="display: none;"> <bean:write
											name="x" property="admin" />
									</label>
									<label id="test2" style="display: none;"> <bean:write
											name="x" property="candidate" />
									</label>
									<label id="test3" style="display: none;"> <bean:write
											name="x" property="employer" />
									</label>
								</html:form>

								<div class="row">
									<div class="col-md-6">
										<div id="container" style="width: auto; height: 400px; margin: 0 auto"></div>
									</div>
									<div class="col-md-6">
										<div id="container2"
											style="width: auto; height: 400px; margin: 0 auto"></div>
									</div>	
								</div>
							</div>
						</div>
					</section>
				</div>
			</div>
			<!-- page end -->
		</section>
	</section>
	
	<table id="datatable" style="display: none;">
		<thead>
			<tr>
				<th></th>
				<th>Toàn Thời Gian</th>
				<th>Bán Thời Gian</th>
				<th>Thực Tập Sinh</th>
			</tr>
		</thead>
		<logic:present property="listNgayDang" name="chartForm">
				<logic:iterate property="listNgayDang" name="chartForm" id="x" >
					<tr>
						<td>
							<bean:write name="x" property="date"/>
						</td>
						<td>
							<bean:write name="x" property="toanThoiGian"/>
						</td>
						<td>
							<bean:write name="x" property="banThoiGian"/>
						</td>
						<td>
							<bean:write name="x" property="thucTap"/>
						</td>
					</tr>
				</logic:iterate> 
				
		</logic:present>
 		
		</tbody>
	</table>
	<script lang="JavaScript">
	$( ".datepicker1" ).datepicker({
		   format: 'mm-dd-yyyy'
		});
	$( ".datepicker" ).datepicker({
		   format: 'mm-dd-yyyy'
		});
	$(document).ready(function() { 
	   var data = {
	      table: 'datatable'
	   };
	   var chart = {
	      type: 'column'
	   };
	   var title = {
	      text: 'Thống Kê Ngày Số Lượng Bài Đăng Theo Loại'   
	   };      
	   var yAxis = {
	      allowDecimals: false,
	      title: {
	         text: 'Lượt Đăng'
	      }
	   };
	   var tooltip = {
	      formatter: function () {
	         return '<b>' + this.series.name + '</b><br/>' +
	            this.point.y + ' ' + this.point.name.toLowerCase();
	      }
	   };
	   var credits = {
	      enabled: false
	   };  
	      
	   var json = {};   
	   json.chart = chart; 
	   json.title = title; 
	   json.data = data;
	   json.yAxis = yAxis;
	   json.credits = credits;  
	   json.tooltip = tooltip;  
	   $('#container').highcharts(json);
	});

	    $("#tuNgay").attr("placeholder", "Tháng-Ngày-Năm");
	    $("#denNgay").attr("placeholder", "Tháng-Ngày-Năm");
	    $("#tuNgay").attr("pattern", pattern);
	    $("#denNgay").attr("pattern", pattern);
	</script>
	<script type="text/javascript" lang="JavaScript">
			var aaa = parseInt( $("#test1").text());
			var bbb = parseInt( $("#test2").text());
			var ccc = parseInt( $("#test3").text());
		$(document).ready(function() {  
		   var chart = {
		       plotBackgroundColor: null,
		       plotBorderWidth: null,
		       plotShadow: false
		   };
		   var title = {
		      text: 'Danh Sach Người Dùng Trong Hệ Thống'   
		   };      
		   var tooltip = {
		      pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
		   };
		   var plotOptions = {
		      pie: {
		         allowPointSelect: true,
		         cursor: 'pointer',
		         dataLabels: {
		            enabled: true,
		            format: '<b>{point.name}%</b>: {point.percentage:.1f} %',
		            style: {
		               color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
		            }
		         }
		      }
		   };
		   var series= [{
		      type: 'pie',
		      name: 'Browser share',
		      data: [
		         ['Admin', aaa ],
		         ['Candidate',      bbb],
		         ['Employer',   ccc]
		      ]
		   }];     
		   // Radialize the colors
		   Highcharts.getOptions().colors = Highcharts.map(Highcharts.getOptions().colors, function (color) {
		      return {
		         radialGradient: { cx: 0.5, cy: 0.3, r: 0.7 },
		         stops: [
		            [0, color],
		            [1, Highcharts.Color(color).brighten(-0.3).get('rgb')] // darken
		         ]
		      };
		   });
			  
		   var json = {};   
		   json.chart = chart; 
		   json.title = title;     
		   json.tooltip = tooltip;  
		   json.series = series;
		   json.plotOptions = plotOptions;
		   $('#container2').highcharts(json);  
});
</script>
</body>
</html>







<%-- 
<title>Insert title here</title>
</head>
<body>
<table id="datatable" style="display: none;">
		<thead>
			<tr>
				<th></th>
				<th>Toàn Thời Gian</th>
				<th>Bán Thời Gian</th>
				<th>Thực Tập Sinh</th>
			</tr>
		</thead>
 		<logic:iterate property="listNgayDang" name="theLoaiNgayDangForm" id="x" >
			<tr>
				<td>
					<bean:write name="x" property="date"/>
				</td>
				<td>
					<bean:write name="x" property="toanThoiGian"/>
				</td>
				<td>
					<bean:write name="x" property="banThoiGian"/>
				</td>
				<td>
					<bean:write name="x" property="thucTap"/>
				</td>
			</tr>
		</logic:iterate> 
		</tbody>
	</table>
	<div id="container" style="width: 550px; height: 400px; margin: 0 auto"></div>

<!-- <table id="datatable">
		<thead>
			<tr>
				<th></th>
				<th>Toàn Thời Gian</th>
				<th>Bán Thời Gian</th>
				<th>Thực Tập Sinh</th>
			</tr>
		</thead>
		<tbody>
		<tr>
			<th></th>
			<td></td>
			<td></td>
			<td></td>
		</tr> -->
		<logic:iterate property="listNgayDang" name="chartForm" id="xx">
			<tr>
				<td><bean:write name="xx" property="date" /></td>
				<td><bean:write name="xx" property="toanThoiGian" /></td>
				<td><bean:write name="xx" property="banThoiGian" /></td>
				<td><bean:write name="xx" property="thucTap" /></td>
			</tr>
		</logic:iterate>
<!-- 		</tbody>
	</table> -->
	<jsp:include page="/admin/header.jsp"></jsp:include>
	<section id="main-content">
		<section class="wrapper">
			<div class="row">
				<div class="col-lg-12">
					<section class="panel">
						<header class="panel-heading"> Chart </header>
						<div class="panel-body">
							<div class="form">
								<html:form action="/thongKe" method="post">
									<html:text property="tuNgay" styleId="tuNgay"></html:text>
									<html:text property="denNgay" styleId="denNgay"></html:text>
									<html:submit styleClass="btn btn-primary">Save</html:submit>
									<bean:define id="x" name="chartForm" />
									<label id="test1" style="display: none;"> <bean:write
											name="x" property="admin" />
									</label>
									<label id="test2" style="display: none;"> <bean:write
											name="x" property="candidate" />
									</label>
									<label id="test3" style="display: none;"> <bean:write
											name="x" property="employer" />
									</label>
								</html:form>

								<div class="row">
									
								</div>
								<div class="row">
									<div id="container2"
										style="width: 600px; height: 400px; margin: 0 auto"></div>
								</div>

							</div>
						</div>
					</section>
				</div>
			</div>
			page end
		</section>
	</section>
	


</body>
</html> --%>