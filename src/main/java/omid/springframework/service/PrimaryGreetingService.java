package omid.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by omid on 12/12/2020.
 */
@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingService{
    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEglishGreeting();
    }
}
