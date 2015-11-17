<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Success</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h2>Congratulations!! the Engineering college has processed your Application Form successfully</h2>
	
	<h2>Details submitted by you</h2>
	<table>
		<tr>
			<td>Student Name:</td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby:</td>
			<td>${student1.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile:</td>
			<td>${student1.studentMobile}</td>
		</tr>
		<tr>
			<td>Student DOB:</td>
			<td>${student1.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills:</td>
			<td>${student1.studentSkills}</td>
		</tr>
		<tr><td>Student's Address : </td>
			<td>country:  ${student1.studentAddress.country}
				city:  ${student1.studentAddress.city}
				street: ${student1.studentAddress.street}
				pincode: ${student1.studentAddress.pincode}</td>
			 </tr>
	</table>	
	
</body>
</html>