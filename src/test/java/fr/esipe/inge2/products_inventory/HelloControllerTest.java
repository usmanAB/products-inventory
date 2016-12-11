package fr.esipe.inge2.products_inventory;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HelloControllerTest {

    private HelloController helloController = new HelloController();


    @Test
    public void shouldReturnDefaultNameInModel(){

        ModelAndView mav = helloController.sayHello(null);

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

}