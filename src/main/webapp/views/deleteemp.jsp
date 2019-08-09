<%@ include file="header.jsp"%>
<div class="container">
	<h3>Enter the employee ID</h3>
	<form action="deleteemployee" method="post">
		<input type="text" name="empId" placeholder="Employee ID"><br>
		<input type="submit" value="Delete">
	</form>
</div>
<%@ include file="footer.jsp"%>