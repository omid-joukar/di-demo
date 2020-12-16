package omid.springframework.controllers;

import service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by omid on 12/12/2020.
 */

@Ignore
public class ConstructedInjectedControllerTest {
    private ConstructedInjectedController constructedInjectedController;

    @Before
    public void setUp(){
        this.constructedInjectedController = new ConstructedInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,constructedInjectedController.sayHello());
    }
}
