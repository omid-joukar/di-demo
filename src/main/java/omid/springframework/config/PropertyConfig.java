package omid.springframework.config;

import omid.springframework.examplebeans.FakeDatasource;
import omid.springframework.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
public class PropertyConfig {

    @Value("${omid.username}")
    String user;
    @Value(("${omid.password}"))
    String password;
    @Value("${omid.dburl}")
    String url;
    @Value("${omid.jms.username}")
    String jmsUser;
    @Value("${omid.jms.password}")
    String jmsPassword;
    @Value("${omid.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDatasource fakeDatasource(){
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUser(user);
        fakeDatasource.setPassword(password);
        fakeDatasource.setUrl(url);
        return fakeDatasource;
    }
    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUserName(jmsUser);
        fakeJmsBroker.setPassword(password);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
