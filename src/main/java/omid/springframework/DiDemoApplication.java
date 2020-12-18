package omid.springframework;

import omid.springframework.controllers.ConstructedInjectedController;
import omid.springframework.controllers.MyController;
import omid.springframework.controllers.PropertyInjectedController;
import omid.springframework.controllers.SetterInjectedController;
import omid.springframework.examplebeans.FakeDatasource;
import omid.springframework.examplebeans.FakeJmsBroker;
import org.springframework.context.annotation.ComponentScan;
import service.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = {"service","omid.springframework"})
public class DiDemoApplication {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		FakeDatasource fakeDatasource = (FakeDatasource)ctx.getBean(FakeDatasource.class);
		System.out.println(fakeDatasource.getUser());
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);
	}

}
