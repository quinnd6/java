//gontuseries Spring MVC Tutorials 22 - Form Validations 06 (More on custom Form Validation annotation...)
package com.gontuseries.studentadmissioncontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.cfg.ConstraintDef;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{
	
	private String listOfValidHobbies;

	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidHobbies = isValidHobby.listOfValidHobbies();
		
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		if (studentHobby == null)
		{
			return false;
		}
		if(studentHobby.matches(listOfValidHobbies))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
