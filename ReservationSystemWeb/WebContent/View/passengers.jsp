 <%@ page import="org.json.JSONObject"%>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <meta charset="utf-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
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


		function openAddPassenger() {
			alert("In Json");
			window.open("View/AddPassengers.jsp",null,"height=700,width=700,status=yes,toolbar=no,menubar=no")
			//window.location.href = "View/AddPassengers.jsp";
			
			//window.transfer("${pageContext.request.contextPath}/View/AddPassengers.jsp");
 			//out.write(jsObj)
 			return true;
		}
</script>

 <script type="text/javascript">


		function OnDelete(row) {
			
 	 		var checkvals = document.querySelectorAll("input#chkpassenger");
 	 		var delrows
 	 		alert("In Delete "+checkvals);
 	 		//var val = row.value
	 		var len= checkvals.length;
 	 		var checklist = new Array();
	 		//alert("In Delete "+len)
	 		for (i=0;i<len;i++)
	 			{
	 			//alert("Checks = "+i + " - " + checkvals[i].checked);
	 			if (checkvals[i].checked == true)
	 				{
	 				//alert(checkvals[i].value)

	 				checklist.push(checkvals[i].value);
	 					 
	 				}
	 			}
	 		document.location.href = "PassengerController?action=DeletePassenger&delpassenger="+checklist;
	 		
	 		return true;
		}
</script>

<jsp:include page="../common/header.jsp"></jsp:include>
<jsp:include page="../common/footer.jsp"></jsp:include>
 
</head>

<body>

<div class="container-fluid">

<%-- 			 <div>"${sessionScope.PassengerList}"</div> --%>

	<div class="card">
	<div class="card-body">
	<div  class="table-editable col-md-7">
		<table id="tbPassenger" class="table table-bordered table-responsive-sm table-striped table-warning table-hover">
			<thead class="thead-dark thead-md">
				<tr>
					<th class="text-center"></th>
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
			 <tr class = "text-center" id=""> 
					<td>
					<!-- <div class="checkbox" > -->  
					 <input type="checkbox" name="chkpassenger" id="chkpassenger" value=${psgList.passengerCode}>
					</td>
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
		<!--<button type="button" class="btn btn-success" onclick="openAddPassenger()" >Add Passenger</button>-->
		<button type="button" class="btn btn-success" data-toggle="modal" data-target="#AddPassenger">Add Passenger</button>
		<button type="button" class="btn btn-danger" onclick="OnDelete(this)">Delete</button>
			
		</div>
		

		</div>
	</div>
	
			<div class="modal" id ="AddPassenger">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Add Passengers</h4>
						<button type="button" class="close" data-dismiss="modal" >&times;</button>
					</div>
					
					<div class="modal-body">
						<form action="PassengerController?action=AddPassenger" method="post" class="was-validated">
						    <div class = "form-group form-group-sm">
							<label for="passengerCode">Passenger Code</label>
							<input type="text" class="form-control form-control-sm" name="passengerCode" id="passengerCode" placeholder="" required>
							<div class="valid-feedback">Valid</div>
							<div class="invalid-feedback">Please fill the field.</div>
							</div>
							<div class = "form-group form-group-sm">
							<label>Passenger Name</label>
							<input type="text" class="form-control form-control-sm" name="passengerName" id="passengerName" placeholder="" required>
							</div>
							<div class = "form-group form-group-sm">
							<label for="passengerAge">Age:</label>
							<input type="number" class="form-control form-control-sm" name="passengerAge" id="passengerAge" placeholder="" required>
							</div>
						<!-- 	<div class = "dropdown"> Gender 
							 <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">Select</button>
								<div class="dropdown-menu">
									<span class="dropdown-item-text">Male</span>
									<span class="dropdown-item-text">Female</span>
								</div>
							</div> 
							-->
							
							<div class="form-group form-group-sm"> Gender
								<select class="form-control form-control-sm">
									<option value="" selected>Select</option>
									<option value="F">Female</option>
									<option value="M">Male</option>
								</select>							
							</div>
							
							<div class = "form-group form-group-sm">
								<label for="passengerContactNumber">Contact Number</label>
								<input type="number" class="form-control form-control-sm tel" name="passengerContactNumber" id="passengerContactNumber" placeholder="999-999-9999" required>
							</div>
							<div class = "form-group form-group-sm ">
								<label>Email ID</label>
								<input type="email" class="form-control form-control-sm email" name="passengerContactMail" id="passengerContactMail" placeholder="" required>
							</div>
							<button type="submit" class="btn btn-primary pull-left">Submit</button> 
         						<p class="help-block pull-left text-danger hide" id="form-error">&nbsp; The form is not valid. </p>
						</form>	
					
					</div>
					
					<div class="modal-footer">
						<!-- <button type="submit" class="btn btn-primary" data-dismiss="modal">Save</button> -->
					</div>	
				</div>
			
			</div>
		
		</div>
</div>
</body>

