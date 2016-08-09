<html>
<head>
<meta charset="UTF-8">
<title>Welcome To HSBC Online Service</title>
</head>
<link rel="stylesheet" type="text/css" href="./css/dialog.css">
<body background="./images/background.jpg" style="background-repeat: no-repeat;background-size: 1400px 1100px; ">
<script>
    var requestContextPath = '${pageContext.request.contextPath}';
</script>

<br>
<br>
<br>
<h1 align="center" style="font-family: serif;">WELCOME TO LEAVE MANAGEMENT SYSTEM
</h1>
<script src="./UI_LIB/jquery-1.11.1.js"></script>
<script src="./js/HSBCchat.js"></script>
<table class="table" width="200" border="1"  style=" border-spacing: inherit; position: absolute;bottom: 0;right:240; background-color: skyblue;">
<!-- <tr>
<td colspan="2"  align="center"  >
<span>Chat App</span>
</td>
</tr> -->
<th colspan="2" background-color="white" >Chat Application
</th>
	<tr>
		<td colspan="2">
			<div id="scroller" background-color: skyblue; style="overflow-y: scroll; height:200px; width:100%;"
			style="overflow-x: scroll; height:100%; width:100px;" >
			</div>
		</td>
	</tr>
	<tr hieght="70px">
		<td>
			<textarea id="msgArea" class="msgArea" rows="4" cols="50"> 
			</textarea>
		</td>
		<td >
		 <input type="image" id="btn" src="./images/arrow.jpg" alt="" width="56" height="68">
		</td>
	</tr>
</table>
</body>
</html>