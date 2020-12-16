package service;

import org.springframework.stereotype.Service;

/**
 * Created by omid on 12/12/2020.
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GURUS = "hello gururs setter Qualifire !!!";
    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }
}
