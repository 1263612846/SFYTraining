$(function(){
	
	var username = $("#username");
	
	$("#1").click(function(){
		
		if($.trim(username.val()) == ""){
			alert("用户名不能为空！");
			username.focus();
		}
		
		else{
		
		$.ajax({
			type : "POST",
			url : "student!test.action",
			data : "username=" + username.val(),
			success : function(json){
				var j = $.parseJSON(json);
				$("div").append(
					"<p>学号：" + j.num + "</p>" + 
					"<p>姓名：" + j.name + "</p>" + 
					"<p>年龄：" + j.age + "</p>" + 
					"<p>性别：" + j.sex + "</p>" + 
					"<p>学校：" + j.school + "</p>" + 
					"<p>专业：" + j.major + "</p>" + 
					"<p>用户名：" + j.username + "</p>" + 
					"<p>注册时间：" + j.regtime + "</p>"
				);
			}
		});
		
		}
		
	});
	
 	$("#2").click(function(){
		
		$.ajax({
			url : "student!test1.action",
			success : function(json){
				var json = $.parseJSON(json);
				$.each(json,function(i,j){
					$("table").append(
						"<tr>" + 
						"<td>" + j.num + "</td>" + 
						"<td>" + j.name + "</td>" + 
						"<td>" + j.age + "</td>" + 
						"<td>" + j.sex + "</td>" + 
						"<td>" + j.school + "</td>" + 
						"<td>" + j.major + "</td>" + 
						"<td>" + j.username + "</td>" + 
						"<td>" + j.regtime + "</td>" +
						"</tr>"
					);
				});
				$("table").show();
			}
		});
		
	});
	
});