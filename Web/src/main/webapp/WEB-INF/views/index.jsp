<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue"></script>

<script>
	$(document).ready(function(){
		
		$.ajax({
			url : "/data"
			,type : "head"
			,success : function(data){
				console.log(data);
				
				var app4 = new Vue({
					  "el": '#app-4',
					  "data" : {
					    "todos": JSON.parse(data)
					  }
					})
			}
			
		})
		
	})
</script>
<body>
	<div>앞 ㅎㅎㅎ</div>
	<div id="app-4">
	  <ol>
	    <li v-for="todo in todos">
	      {{ todo.title }} : {{ todo.content }} 
	      
	    </li>
	  </ol>
	</div>
	<div>뒤</div>
</body>
</html>