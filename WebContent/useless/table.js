$(function(){

	$("a").click(function(jsonArray){
		
	$.ajax({});
		
	
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
	
	});
	
});