$(function(){
	
	$("input.reg").click(function(){
		$("div").fadeToggle();
	});
	
	$("input#login").click(function(){
		var username = $("input#username");
		var password = $("input#password");
		if($.trim(username.val()) == "") {
			alert("请输入用户名！");
			username.focus();
			return false;
		}
		if($.trim(password.val()) == "") {
			alert("请输入密码！");
			password.focus();
			return false;
		}
	});
	
	$("input#reg").click(function(){
		var username = $("input.username");
		var password = $("input.password");
		if($.trim(username.val()) == "") {
			alert("请输入用户名！");
			username.focus();
			return false;
		}
		if ($.trim(password.val()) == "") {
			alert("请输入密码！");
			password.focus();
			return false;
		}
	});

});