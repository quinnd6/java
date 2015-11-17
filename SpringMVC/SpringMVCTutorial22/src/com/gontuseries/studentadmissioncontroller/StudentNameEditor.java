//gontuseries Spring MVC Tutorials 22 - Form Validations 06 (More on custom Form Validation annotation...)
package com.gontuseries.studentadmissioncontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{
	//When you will submit the admission Form -->
	//Spring MVC will run setAsText function of this class -->
	//Before performing data binding task for studentName property of student object
	
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException
	{
		if(studentName.contains("Mr.")||studentName.contains("Ms."))
		{
			setValue(studentName);
		}
		else
		{
			studentName = "Ms. "+studentName;
			setValue(studentName); //What every value will provide to setValue -- Spring MVC will use the
								   //same value to peform data binding task for studentNsme property
		}
	}
}
