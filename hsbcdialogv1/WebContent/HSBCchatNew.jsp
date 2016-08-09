<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" /> 

<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">

<script src="./UI_LIB/jquery-1.11.1.js"></script>
<script src="./js/HSBCchat.js"></script>
<link rel="stylesheet" type="text/css" href="./css/dialog.css">
<title>Insert title here</title>
<style>
div#myNavbar {
	background-color: grey;
	width: 700px;
	/* bottom:0;
    position:right;
    float:right;
    margin-left:10px;
} */

</style>
</head>
<body>




	
			<div id="myNavbar" class="topbar" style="background-colour: black;">

				<div  class="navbar-header">
				<a class="navbar-brand" style="color: white" href="#">Logo</a>
				</div>
					<div class="collapse navbar-collapse" >
					<!-- <ul class="nav navbar-nav navbar-right">
						<li><a href="#"><span style="color: white">News</span></a></li>
					</ul> -->

				</div>

			</div>

    <table  border="1" width="700px" height="300px" >
		<tr>

			<!-- <td width="50%" height="200"> -->
			<td  width="40%" align="left" valign="top" rowspan="2" >
				
				<!-- <div class="top"> -->
				<!-- <div align="left" valign="top" rowspan="2"> -->
						<img src="./images/agent1.png" alt="" height="100" width="100">
				<!-- </div> -->
					
					<br>
					<br>
					
					
					
					
					
					<div  style="overflow-y: scroll; height: 100px; width: 90%; "
						style="overflow-x: scroll; height:90%; width:100px;">
						
						<div>Frequently ask questions</div>
						<p>What is the change in carry forward of leaves in the new Leave Policy starting January 1 2016?</p>
						<p>What is the rationale behind this change?</p>
						<p>What are accumulated leaves?</p>
						<p>Where can one check the leave balance?</p>
						</div>
			</td >

			<td width="50%" height=298px>


					<div id="scroller" style="overflow-y: scroll; height: 100px; width: 100%;"
						style="overflow-x: scroll; height:100%; width:100px;"></div>


					<!-- <div> -->

							<br>
							 <div style="float:left"> 
							
							<textarea id="msgArea" name="msgArea" cols="50" rows="4"
							style="background-color: white"
							placeholder="Please type your question here"></textarea>
							
							
							 </div> 
							 <div style="float:right"> 
							
							<input type="image" id="btn" src="./images/ask (2).jpg" align="right"
							alt="" width="90" height="80">
							
							 </div>

							

					<!-- </div> -->



				</td>

			</tr>


		</table>



</body>
</html>