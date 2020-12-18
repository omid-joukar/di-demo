package omid.springframework.config;

import omid.springframework.examplebeans.FakeDatasource;
import omid.springframework.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")})
public class PropertyConfig {
    @Autowired
    Environment environment;
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
    @Value("${omid.jms.class}")
    String jmsClass;
    @Bean
    public FakeDatasource fakeDatasource(){
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUser(environment.getProperty("USERNAME"));
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
        fakeJmsBroker.setClasses(jmsClass);
        return fakeJmsBroker;
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
