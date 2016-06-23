<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery.js"></script>
<script type="text/javascript" src="./js/list.js"></script>
<script type="text/javascript">
$(function(){

	var data = ${jsonArray};
	var tr = $("#value");
	
	$.each(data,function(index,item){
		var ctr = tr.clone();
		var id = item.id;
		
		ctr.children("td").each(function(nindex){
			switch(nindex){
			case(0):
				$(this).html(item.num);
				break;
			case(1):
				$(this).html(item.name);
				break;
			case(2):
				$(this).html(item.age);
				break;
			case(3):
				$(this).html(item.sex);
				break;
			case(4):
				$(this).html(item.school);
				break;
			case(5):
				$(this).html(item.major);
				break;
			case(6):
				$(this).html(item.username);
				break;
			case(7):
				$(this).html(item.regtime);
				break;
			}
		});
		ctr.insertAfter(tr);
		$("button").click(function(){
			
			alert(id);
			$.ajax({
				type: "POST",
				url: "login!delete.action?id=" + id,
				success: function(){
					var data = ${jsonArray};
					var tr = $("#value");
					
					$.each(data,function(index,item){
						var ctr = tr.clone();
						var id = item.id;
						
						ctr.children("td").each(function(nindex){
							switch(nindex){
							case(0):
								$(this).html(item.num);
								break;
							case(1):
								$(this).html(item.name);
								break;
							case(2):
								$(this).html(item.age);
								break;
							case(3):
								$(this).html(item.sex);
								break;
							case(4):
								$(this).html(item.school);
								break;
							case(5):
								$(this).html(item.major);
								break;
							case(6):
								$(this).html(item.username);
								break;
							case(7):
								$(this).html(item.regtime);
								break;
							}
						});
						ctr.insertAfter(tr);
					});
					$("#value").hide();
					$("table").show();
				}
			})
			})
	});
	$("#value").hide();
	$("table").show();
	
	
	
});
</script>
<!-- css -->
<style>
body { text-align: center; }
a { text-decoration: none; }
</style>

<title>学生信息</title>
</head>
<body>
<p><button id="1">查看</button>　<button id="2">预览</button></p>
<%-- <script>

	var data = ${jsonArray};
	
	document.write('<table align="center" width="80%" border="1">');
	document.write('<tr><td>学号</td><td>姓名</td><td>年龄</td><td>性别</td><td>学校</td><td>专业</td><td>用户名</td><td>注册时间</td><td>操作</td></tr>');

	for( var x in data ){
		document.write('<tr>');
		
		document.write('<td>'+ data[x].num +'</td>');
		document.write('<td>'+ data[x].name +'</td>');
		document.write('<td>'+ data[x].age +'</td>');
		document.write('<td>'+ data[x].sex +'</td>');
		document.write('<td>'+ data[x].school +'</td>');
		document.write('<td>'+ data[x].major +'</td>');
		document.write('<td>'+ data[x].username +'</td>');
		document.write('<td>'+ data[x].regtime +'</td>');
//		document.write('<td><a href=login!delete?id=' + data[x].id + '>删除</a></td>');
		document.write('<td><button>删除</button></td>');
		
		document.write('</tr>');
		
		var id = data[x].id;
		
		$(function(){
			
			$.ajax({
				type: "post",
				url: "login!delete?id="+id,
				success: function(){
					var data = ${jsonArray};
					
					document.write('<table align="center" width="80%" border="1">');
					document.write('<tr><td>学号</td><td>姓名</td><td>年龄</td><td>性别</td><td>学校</td><td>专业</td><td>用户名</td><td>注册时间</td><td>操作</td></tr>');

					for( var x in data ){
						document.write('<tr>');
						
						document.write('<td>'+ data[x].num +'</td>');
						document.write('<td>'+ data[x].name +'</td>');
						document.write('<td>'+ data[x].age +'</td>');
						document.write('<td>'+ data[x].sex +'</td>');
						document.write('<td>'+ data[x].school +'</td>');
						document.write('<td>'+ data[x].major +'</td>');
						document.write('<td>'+ data[x].username +'</td>');
						document.write('<td>'+ data[x].regtime +'</td>');
//						document.write('<td><a href=login!delete?id=' + data[x].id + '>删除</a></td>');
						document.write('<td><a>删除</a></td>');
						
						document.write('</tr>');
						
						var id = data[x].id;
					}
					
					document.write('</table>');
				}
			})
			
		})
	}
	
	document.write('</table>');
	
	

</script> --%>
<%-- <script type="text/javascript">

	var json = ${jsonArray};
	var h1 = "<tr>";
	var h2 = '<td><a href="#">删除</a></td>';
	var h3 = "</tr>";
	
	$(function() {
		$.each(json,function(item,object){
			$("table").append(h1);
			
			$.each(object,function(name,value){
				var html = "<td>" + value + "</td>";
				$("table").append(html);
			});

			$("table").append(h2);
			$("table").append(h3);
		});
		
	});

</script> --%>
<table align="center" width="80%" border="1" style="display:none">
<thead><tr><td>学号</td><td>姓名</td><td>年龄</td><td>性别</td><td>学校</td><td>专业</td><td>用户名</td><td>注册时间</td><td>操作</td></tr></thead>
<tbody><tr id="value"><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td><button>删除</button></td></tr></tbody></table>
<p><input type="button" onclick="window.location.href('Index.jsp')" value="返回登录页面"></p>
</body>
</html>