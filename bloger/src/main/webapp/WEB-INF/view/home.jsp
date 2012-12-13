<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="w" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<style type="text/css">
table{
	position: absolute;
	left: 29%;
	background-color: rgba(1,30,43,0.1);
	z-index: 10;
}
table:HOVER {
	background-color: rgba(1,30,43,0.5);
}
</style>
</head>
<body>
<h1 align="center">欢迎来到城市查询主页</h1>
	<table style="">
		<w:iterator value="cities" var="singleCity">
			<tr>
				<td>${singleCity.id }</td>
				<td>${singleCity.name }</td>
				<td>${singleCity.countryCode }</td>
				<td>${singleCity.district }</td>
				<td>${singleCity.population }</td>
			</tr>
		</w:iterator>
	</table>

</body>
</html>