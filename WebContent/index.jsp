<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>吉他查询</title>
</head>
<body>
	<div align="center">
		<h2>吉他搜索系统v1</h2>
	</div>
	</br>
	<hr>
	</br>
	<table height="20" align="center">
		<tr>

			<td height="30">
				<form action="FindAllguitar">
					<input name="pageNo" type="text" value=""> <input
						type="submit" value="搜索">
				</form>
			</td>
		</tr>
	</table>
	<p>&nbsp;</p>
	<table style="width: 800px" action="psot" height="73" align="center"
		border="0px" bordercolor="#000000" cellspacing="0px"
		style="border-collapse:collapse">
		<tr>
			<td align="center" valign="middle" bordercolor="#FFFFFF"><span
				class="STYLE2">编号</span></td>
			<td align="center" valign="middle" bordercolor="#FFFFFF"><span
				class="STYLE2">价格</span></td>
			<td align="center" valign="middle" bordercolor="#FFFFFF"><span
				class="STYLE2">制造商</span></td>
			<td align="center" valign="middle" bordercolor="#FFFFFF"><span
				class="STYLE2">型号</span></td>
			<td align="center" valign="middle" bordercolor="#FFFFFF"><span
				class="STYLE2">类型</span></td>
			<td align="center" valign="middle" bordercolor="#FFFFFF"><span
				class="STYLE2">表面木料</span></td>
			<td align="center" valign="middle" bordercolor="#FFFFFF"><span
				class="STYLE2">背面木料</span></td>
		</tr>
		<c:forEach items="${guitarlist }" var="guitar">
			<tr>
				<td align="center" valign="middle" bordercolor="#FFFFFF">${guitar.seralNumber }</td>
				<td align="center" valign="middle" bordercolor="#FFFFFF">${guitar.price }</td>
				<td align="center" valign="middle" bordercolor="#FFFFFF">${guitar.builder }</td>
				<td align="center" valign="middle" bordercolor="#FFFFFF">${guitar.model }</td>
				<td align="center" valign="middle" bordercolor="#FFFFFF">${guitar.type }</td>
				<td align="center" valign="middle" bordercolor="#FFFFFF">${guitar.backWood }</td>
				<td align="center" valign="middle" bordercolor="#FFFFFF">${guitar.topWood }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>