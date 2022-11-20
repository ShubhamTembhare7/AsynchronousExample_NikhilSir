<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#t1").blur(function(){
        console.log("the text has been blurred");
    });
	
  $("button").click(function(){
    $.get("AjaxServlet", function(data, status){
     $("#test1").html("<h2>"+data+"</h2>");
     
    });
  });
});
</script>
</head>
<body>

<button>Send an HTTP GET request to a page and get the result back</button>
<p id="test1"></p>
<input type="text" id="t1">
</body>
</html>
