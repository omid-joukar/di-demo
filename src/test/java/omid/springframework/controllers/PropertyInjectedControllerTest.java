package omid.springframework.controllers;

import service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by omid on 12/12/2020.
 */

@Ignore
class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }
    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello());
    }

}