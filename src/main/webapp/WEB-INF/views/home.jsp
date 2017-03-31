<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<div id="container">
		<div>
			<select id="first">
			<option>select</option>
			</select>
			<select id="second">
			<option>select</option>
			</select>
			<select id="third">
			<option>select</option>
			</select>
		</div>
		<div>
			<p id="phone">phone number</p>
		</div>

		<!-- JQuery Version 3.2.1 CDN -->
		<script src="http://code.jquery.com/jquery-3.2.1.min.js" type="text/javascript"></script>

		<script type="text/javascript">
			$.ajax({
				url : "init_ajax",
				type : "get",
				datatype : 'json',
				success : function(json) {
					var list = $.parseJSON(json);
					var html = '<option>select</option>';
					for (var i = 0; i < list.length; i++) {
						html += '<option>' + list[i].name + '</option>';
					}
					$("#first").html(html);
				}
			});

			$(document).ready(function() {
				$("#first").change(function() {
					$("#third").html("<option>select</option>");
					$("#phone").html("phone number");
					$.ajax({
						url : "first_ajax",
						type : "get",
						datatype : 'json',
						data : {
							"country" : $('#first option:selected').val()
						},
						success : function(json) {
							var list = $.parseJSON(json);
							var html = '<option>select</option>';
							for (var i = 0; i < list.length; i++) {
								html += '<option>' + list[i].name + '</option>';
							}
							$("#second").html(html);
						}
					});
				});
				
				$("#second").change(function(){
					$("#third").html("<option>select</option>");
					$("#phone").html("phone number");
					
					$.ajax({
						url : "second_ajax",
						type : "get",
						datatype : 'json',
						data : {
							"city" : $('#second option:selected').val()
						},
						success : function(json) {
							var list = $.parseJSON(json);
							var html = '<option>select</option>';
							for (var i = 0; i < list.length; i++) {
								html += '<option>' + list[i].name + '</option>';
							}
							$("#third").html(html);
						}
					});
				});
				
				$("#third").change(function(){
					$.ajax({
						url : "third_ajax",
						type : "get",
						data : {
							"city" : $('#second option:selected').val(),
							"name" : $('#third option:selected').val()
						},
						success : function(data) {
							$("#phone").html(data);
						}
					});
				});
			});
		</script>
	</div>
</body>
</html>
