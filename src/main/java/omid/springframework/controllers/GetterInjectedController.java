package omid.springframework.controllers;

import service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by omid on 12/12/2020.
 */
@Controller
public class GetterInjectedController {


    private GreetingService greetingService;
    String sayHello(){
        return getGreetingService().sayGreeting();
    }
    @Autowired
    @Qualifier("getterGreetingService")
    public GreetingService getGreetingService() {
        return greetingService;
    }
}
