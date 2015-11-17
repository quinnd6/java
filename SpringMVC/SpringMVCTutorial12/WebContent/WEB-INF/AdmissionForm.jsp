<!Doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h2>STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h2>
	
	<form action="/SpringMVCTutorial12/submitAdmissionForm.html" method="post">
		<p>
			Student's Name : <input type="text" name="studentName" />
		</p>
		<p>
			Student's Hobby : <input type="text" name="studentHobby" />
		</p>
		<input type="submit" value="Submit this form by clicking here" />
	</form>
	
</body>
</html>