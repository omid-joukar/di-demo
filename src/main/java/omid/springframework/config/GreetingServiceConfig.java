package omid.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import service.GreetingRepository;
import service.GreetingService;
import service.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {
    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }
    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }
    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }
    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanyGreeting(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }

}
