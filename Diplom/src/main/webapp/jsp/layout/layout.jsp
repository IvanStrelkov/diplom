<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
</head>
<body>
	<table class="layout" align="center" height="100%">
		<tr height="10%">
			<td><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr height="5%">
			<td><tiles:insertAttribute name="menu" /></td>
		</tr>
		<tr height="85%">
			<td><tiles:insertAttribute name="body" /></td>
		</tr>
		<tr height="10%">
			<td><tiles:insertAttribute name="footer" /></td>
		</tr>
	</table>
</body>
</html>