package fr.esipe.inge2.products_inventory;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView sayHello(String name){

        if(StringUtils.isEmpty(name)){
            name = "professor";
        }

        return new ModelAndView("hellopage","namemodel",name);

    }

}
