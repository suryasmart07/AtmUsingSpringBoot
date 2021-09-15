package com.example.demo;

import org.springframework.stereotype.Component;

import com.example.demo.Validator.Validation;
import com.example.demo.entity.Entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


import org.junit.*;
public class AtmTest  {

Validation val = mock(Validation.class);

@Before
public void before() {
val = new Validation();
}
@Test
public void Test() {
	Entity entity = new Entity();
	entity.setCard("1234567890123456");
	entity.setPin("1234");
	assertEquals("withdrawl successfull",val.validate(entity));
	verify(val.validate(entity));
	
}

}



