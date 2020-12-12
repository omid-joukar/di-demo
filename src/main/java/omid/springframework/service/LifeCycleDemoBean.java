package omid.springframework.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by omid on 12/12/2020.
 */
@Component
public class LifeCycleDemoBean implements InitializingBean,DisposableBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware {
    public LifeCycleDemoBean(){
        System.out.println("## I am in lifecyclebean Constructor");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factoey has bean set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My Bean Name is"+ s);

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The Lifecycle has been ended");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application Context has bean set");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("## The Post Construct annotated Method has been called");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("## The PreDestroy annotated Method has bean called");
    }
    public void beforeInit(){
        System.out.println("## Before init called by Bean post Processor");
    }
    public void afterInit(){
        System.out.println("##After init called by Bean Post Processor");
    }
}
