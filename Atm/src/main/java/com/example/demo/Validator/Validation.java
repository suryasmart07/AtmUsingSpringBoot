package com.example.demo.Validator;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Entity;

@Component
public class Validation{

	public String validate(Entity entity) {
		String result="No response";
		if(entity.getCard().length() == 16) {
			if(entity.getPin().length() ==4) {
				
				int money = entity.getAmount();
				if(money %10 == 0 && money!=0) {
					if(money< 0) {
					result ="Amount cannot be dispensed"; 
					}
					else
					{
						result ="withdrawl successfull";
					}
				}
				else
				{
					result=" Amount cannot be dispensed";
				}
			}
			else {
				result="Not a valid Pin";
			}
			
		}
		else
		{
			result="Not a valid cardnumber";
		}
		
		return result;
	}

}
