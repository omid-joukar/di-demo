package omid.springframework.controllers;

import service.GreetingServiceImpl;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by omid on 12/12/2020.
 */
@RunWith(SpringRunner.class)
public class SetterInjectedControllerTest {
     private SetterInjectedController setterInjectedController;

    @Before
    public void setUp(){
         this.setterInjectedController = new SetterInjectedController();
         this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
     }

     @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,setterInjectedController.sayHello());
     }
}
