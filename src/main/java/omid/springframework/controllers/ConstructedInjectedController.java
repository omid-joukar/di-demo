package omid.springframework.controllers;

import service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by omid on 12/12/2020.
 */
@Controller
public class ConstructedInjectedController {
    private GreetingService greetingService;
    @Autowired
    public ConstructedInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
