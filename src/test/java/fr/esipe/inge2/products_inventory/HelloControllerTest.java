package fr.esipe.inge2.products_inventory;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import junit.framework.Assert;
import junit.framework.TestCase;
//import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 //*/
@Controller
public class HelloControllerTest extends TestCase
{
	/* 
	 private HelloController helloController = new HelloController();
	 @Test
	 public void shouldReturnDefaultNameInModel(){
		 ModelAndView mav = helloController.sayHello("professor");
		 String actualName = (String) mav.getModelMap().get("namemodel");
		 Assert.assertEquals("professor", actualName);
	 }
	 
	 @Test
	 public void shouldReturnGivenNameInModel(){
		 String given = "olivier";
		 ModelAndView mav = helloController.sayHello(given);
		 String actualName = (String) mav.getModelMap().get("namemodel");
		 Assert.assertEquals(given, actualName);
	 }
	 /*
	 @RequestMapping("/hello")
	 public ModelAndView sayHello(String name){
		 String processName = name;
		 if(StringUtils.isEmpty(processName){
			 processName = "professor";
		 }
	 }*/
    
}
