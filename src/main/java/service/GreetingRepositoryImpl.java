package service;

import org.springframework.stereotype.Component;

/**
 * Created by omid on 12/12/2020.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEglishGreeting() {
        return "hello - primary greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servico de saludo primaro";
    }

    @Override
    public String getGermanyGreeting() {
        return "Primirerer Gruss";
    }
}
