package omid.springframework.controllers;

import omid.springframework.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by omid on 12/12/2020.
 */
@Controller
public class SetterInjectedController {

    private GreetingServiceImpl greetingService;
    public String sayHello(){
       return greetingService.sayGreeting();
    }
    @Autowired
    @Qualifier("greetingServiceImpl")
    public void setGreetingService(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }
}
