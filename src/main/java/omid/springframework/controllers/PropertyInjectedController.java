package omid.springframework.controllers;

import service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by omid on 12/12/2020.
 */
@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingServiceImpl;
    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }


}
