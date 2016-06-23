<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery.js"></script>
<script type="text/javascript" src="./js/index.js"></script>
<title>主页</title>
</head>
<body>
<form action="login!login.action" method="post">
<p>用户名：<input id="username" type="text" name="username" size="18"></p>
<p>密　码：<input id="password" type="password" name="password" size="19"></p>
<p><input id="login" type="submit" value="登录">　
   <input type="reset" value="重置" onclick="alert('已重置！')">　
   <input type="button" value="注册" class="reg"></p>
</form>
<br>
<p><input type="button" onclick="window.location.href('login!list.action')" value="查看全部学生信息">　
   <input type="button" onclick="window.location.href('JSONTest.jsp')" value="JSON"></p>
<br>
<div>
<form action="login!reg.action" method="post">
<p>用户名：<input class="username" type="text" name="username" size="18"></p>
<p>密　码：<input class="password" type="password" name="password" size="19"></p>
<p><input id="reg" type="submit" value="注册">　
   <input type="reset" value="重置" onclick="alert('已重置！')"></p>
</form>
</div>
</body>
</html>