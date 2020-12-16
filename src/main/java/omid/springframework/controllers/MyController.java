package omid.springframework.controllers;

/**
 * Created by omid on 12/12/2020.
 */

import service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;
    @Autowired

    public MyController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println(greetingService.sayGreeting());
        return "foo";
    }
}
