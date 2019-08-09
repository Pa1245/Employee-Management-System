<%@ include file="header.jsp"%>
<div class="container">
	<h3>Enter the employee details</h3>
	<form action="addemployee" method="post">
		<input type="text" name="empName" placeholder="Employee Name"><br>
		<input type="date" name="dob" placeholder="Date of Birth"><br>
		<input type="number" name="basicSalary" placeholder="Basic Salary"><br>
		<input type="submit" value="Add">
	</form>
</div>
<%@ include file="footer.jsp"%>