package omid.springframework.service;

import org.springframework.stereotype.Service;

/**
 * Created by omid on 12/12/2020.
 */
@Service
public class GetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello ! was injected by Getter";
    }
}
