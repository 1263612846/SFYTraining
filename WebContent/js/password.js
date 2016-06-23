$(function(){
	
	var p1 = $("#1");
	var p2 = $("#2");
	
	$("input#sub").click(function(){
		if($.trim(p1.val()) == "") {
			alert("请输入新密码！");
			p1.focus();
			return false;
		}
		if($.trim(p2.val()) == "") {
			alert("请输入密码确认！");
			p2.focus();
			return false;
		}
		if(p1.val() != p2.val()) {
			alert("新密码与密码确认不同！")
			p2.focus();
			return false;
		}
	});
	
});