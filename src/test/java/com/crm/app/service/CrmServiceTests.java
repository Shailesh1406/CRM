package com.crm.app.service;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class CrmServiceTests {
   
	@Autowired
	CrmService crmService;
	
	//Positive
	//Negative
	
	//Exception
	
	//Data structure - eg ArrayList - ArrayIndex
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
    @Test
    public void whenUserNameIsProvided_thenRetrievedMessageIsCorrect() {
       String actualMessage = crmService.sayHello("Somya");
       String expectedMessage = "Hello Somya !!!!";
       Assert.assertEquals(expectedMessage, actualMessage);
       //Actual Output
       //Expected Output
       
    }
    
    @Test
    public void whenUserNameIsProvided_thenRetrievedMessageIsInCorrect() {
       String actualMessage = crmService.sayHello("Somya");
       String expectedMessage = "Hello Shailesh !!!!";
       Assert.assertFalse("Message should not match :", expectedMessage.equals(actualMessage));
    }
    
    @Test
    public void whenUserNameIsNull_thenNullPointerThrown(){
       thrown.expect(NullPointerException.class);
       crmService.sayHello(null);
       
    }
}