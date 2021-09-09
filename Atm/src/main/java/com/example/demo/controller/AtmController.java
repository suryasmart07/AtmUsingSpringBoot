package com.example.demo.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.Validator.Validation;
import com.example.demo.entity.Entity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Component
@ResponseBody
@RestController
@RequestMapping("/check")
public class AtmController {
	@Autowired
	private Validation validation;
		@PostMapping("/data")
	public  String valid(@Valid @RequestBody Entity entity )
	{
			 
		
          return validation.validate(entity);
	}
}
