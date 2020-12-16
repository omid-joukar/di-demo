package omid.springframework.controllers;

import service.MyService;

/**
 * Created by omid on 12/12/2020.
 */
public class SomeConroller {
    private final MyService myService;

    public SomeConroller(MyService myService) {
        this.myService = myService;
    }
}
