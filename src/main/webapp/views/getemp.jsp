<%@ include file="header.jsp"%>
<div class="container">
	<h3>Enter the employee ID</h3>
	<form action="getemployee" method="get">
		<input type="text" name="empId" placeholder="Employee ID"><br> <input
			type="submit" value="Find">
	</form>
</div>
<%@ include file="footer.jsp"%>