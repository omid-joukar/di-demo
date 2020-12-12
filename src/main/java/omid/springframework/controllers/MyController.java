package omid.springframework.controllers;

/**
 * Created by omid on 12/12/2020.
 */

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("Hello !");
        return "foo";
    }
}
