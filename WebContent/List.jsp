<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery.js"></script>
<script type="text/javascript" src="./js/list.js"></script>

<!-- css -->
<style>
body { text-align: center; }
a { text-decoration: none; }
</style>

<title>学生信息</title>
</head>
<body>
<p><button id="1">切换</button>　<button id="2">预览</button></p>
<table align="center" width="80%" border="1">
<tr>
	<td>学号</td><td>姓名</td><td>年龄</td><td>性别</td><td>学校</td><td>系别</td><td>用户名</td><td>注册时间</td><td>操作</td>
</tr>
<s:iterator value="list">
<tr>
<td>${num}</td>
<td>${name}</td>
<td>${age}</td>
<td>${sex}</td>
<td>${school}</td>
<td>${major}</td>
<td>${username}</td>
<td>${regtime}</td>
<td>
	<a href="login!delete.action?id=${id}">删除</a>
</td>
</tr>
</s:iterator>
</table>
<p><input type="button" onclick="window.location.href('Index.jsp')" value="返回登录页面"></p>
</body>
</html>