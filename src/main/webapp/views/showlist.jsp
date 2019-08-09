<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>
<div class="container">
	<div class="container">
		<h2>${msg}</h2><br>
		<table class="striped">
			<thead>
				<tr>
					<th>Employee ID</th>
					<th>Employee Name</th>
					<th>Employee Name</th>
					<th>Basic Salary</th>
				</tr>
			</thead>
			<c:forEach items="${empList}" var="emp">
				<tr>
					<td>${emp.empId}</td>
					<td>${emp.empName}</td>
					<td>${emp.dob}</td>
					<td>${emp.basicSalary}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
<%@ include file="footer.jsp"%>