package service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by omid on 12/12/2020.
 */

public class PrimaryGermanyGreeting implements GreetingService{
    private GreetingRepository greetingRepository;

    public PrimaryGermanyGreeting(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanyGreeting();
    }
}
