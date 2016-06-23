$(function(){
	
	$("button#2").mouseover(function(){
		$("table").show();
	});
	
	$("button#2").mouseout(function(){
		$("table").hide();
	});
	
	$("button#1").click(function(){
		$("table").fadeToggle();
	});
	
	$("a").mouseover(function(){
		$(this).css("background-color","pink");
	});
	
	$("a").mouseout(function(){
		$(this).css("background-color","");
	});
	
});