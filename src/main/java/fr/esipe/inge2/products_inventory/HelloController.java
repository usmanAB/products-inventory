package fr.esipe.inge2.products_inventory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

@RequestMapping("/hello")
public ModelAndView sayHello(String name){
	
	return new ModelAndView("hellopage","namemodel",name);
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
