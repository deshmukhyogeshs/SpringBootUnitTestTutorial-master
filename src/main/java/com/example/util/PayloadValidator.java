package com.example.util;

import com.example.model.ToDo;

public class PayloadValidator {
	
	public static boolean validateCreatePayload(ToDo toDo){
		if (toDo.getId() == 8){
			return false;
		}
		return true;
	}

}
