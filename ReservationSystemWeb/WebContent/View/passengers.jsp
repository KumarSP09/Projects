 <%@ page import="org.json.JSONObject"%>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 
 
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
  <link rel="stylesheet" href="https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap4.min.css"> 
  <script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
  <script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
  <script type="text/javascript">
		$(document).ready(function(){
		    $('#tbPassenger').dataTable(
		    {
		    	"pagingType":"simple_numbers"
		    	
		    }		
		    );
		 
		});
		
</script>
<% 
JSONObject jsObj = new JSONObject();
%>
<script type="text/javascript">


		function setjsondata() {
			alert("In Json");
			
 			//out.write(jsObj)
		}
</script>

<jsp:include page="../common/header.jsp"></jsp:include>
<jsp:include page="../common/footer.jsp"></jsp:include>
 
</head>

<body>

<div class="container-fluid">

			 <div>"${sessionScope.PassengerList}"</div>

	<div class="card">
	<div class="card-body">
	<div  class="table-editable col-md-7">
		<table id="tbPassenger" class="table table-bordered table-responsive-sm table-striped table-warning table-hover">
			<thead class="thead-dark thead-md">
				<tr>
					<th class="text-center">Code</th>
					<th class="text-center">Name</th>
					<th class="text-center">Age</th>
					<th class="text-center">Gender</th>
					<th class="text-center">Contact Number</th>
					<th class="text-center">Email Address</th>		
				</tr>
			</thead>
			<tbody>
			
			 <c:forEach var="psgList" items="${sessionScope.PassengerList}">
			 <tr class = "text-center"> 
					<td contenteditable="true">${psgList.passengerCode}</td>
					<td contenteditable="true">${psgList.passengerName}</td>
					<td contenteditable="true">${psgList.passengerAge}</td>
					<td contenteditable="true">${psgList.passengerGender}</td>
					<td contenteditable="true">${psgList.passengerContactNumber}</td>
					<td contenteditable="true">${psgList.passengerContactMail}</td>
				</tr>
			 
			 </c:forEach>
				
				
			</tbody>
			
		</table>
		
		</div>
		
		<div class="col-sm-6">
<!-- 			<button class="btn btn-primary" onclick="setjsondata()">2</button> -->
			<button type="button" class="btn btn-success" onclick="setjsondata()">Add Passenger</button>
			
		</div>
		</div>
	</div>
</div>
</body>

