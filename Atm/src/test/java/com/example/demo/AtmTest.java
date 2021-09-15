package com.example.demo;
import com.example.demo.Validator.Validation;
import com.example.demo.entity.Entity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.*;
import org.mockito.Mock;
public class AtmTest  {
	
@Mock
Validation val;

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
	
	
}

}



