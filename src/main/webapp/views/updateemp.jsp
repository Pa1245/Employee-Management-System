<%@ include file="header.jsp"%>
<div class="container">
<h3>Enter the employee details</h3>
<form action="updateemployee" method="post">
	<input type="text" name="empId" placeholder="Employee ID"><br>
	<input type="number" name="basicSalary" placeholder="Basic Salary"><br>
	<input type="submit" value="Update">
</form>
</div>
<%@ include file="footer.jsp"%>