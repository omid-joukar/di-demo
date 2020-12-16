package service;

import org.springframework.stereotype.Service;

/**
 * Created by omid on 12/12/2020.
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Constructor injected that!";
    }
}
