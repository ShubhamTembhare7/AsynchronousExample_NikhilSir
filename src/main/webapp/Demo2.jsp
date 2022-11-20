<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
    
    $("#t1").blur(function(){
        var name=$("#t1").val()
        console.log('the blur fn is called')
        $.ajax({
            type: 'POST',
            url:'AjaxServlet',
            data:"n1="+name,
            datatype:"text",
            success:function(result){
                $("#test1").html(result);
            }
        });





});
});
</script>
</head>
<body>





<button>Send an HTTP GET request to a page and get the result back</button>
<p id="test1"></p>
<input type="text" id="t1" >
</body>
</html>