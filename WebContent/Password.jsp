<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<script type="text/javascript" src="./js/jquery.js"></script>
<script type="text/javascript" src="./js/password.js"></script>
</head>
<body>
<form action="login!editPassword.action?id=${id}" method="post">
<p>新　密　码：<input id="1" type="password" name="password"></p>
<p>新密码确认：<input id="2" type="password"></p>
<p><input id="sub" type="submit" value="确认修改">　
   <input type="reset" value="重置">　
   <input type="button" onclick="window.location.href('javascript:history.back(-1);')" value="返回"></p>
</form>
</body>
</html>