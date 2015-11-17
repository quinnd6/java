<!Doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h2>STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h2>
	
	<form action="/SpringMVCTutorial13/submitAdmissionForm.html" method="post">
		<table>
		<tr>
			<td>Student's Name :</td> <td><input type="text" name="studentName"/></td>
		</tr>
		<tr>
			<td>Student's Hobby :</td> <td><input type="text" name="studentHobby"/></td>
		</tr>
		<tr>
			<td>Student's Mobile :</td> <td><input type="text" name="studentMobile"/></td>
		</tr>
		<tr>
			<td>Student's DOB :</td> <td><input type="text" name="studentDOB"/></td>
		</tr>
		<tr>
			<td>Student's Skills set :</td> <td><select name="studentSkills" multiple>
												<option value="Java Core">Java Core</option>
												<option value="Spring Core">Spring Core</option>
												<option value="Spring MVC">Spring MVC</option>
												</select></td>
		</tr>
		</table>
		<input type="submit" value="Submit this form by clicking here" />
	</form>
	
</body>
</html>