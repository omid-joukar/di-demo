package omid.springframework;

import omid.springframework.controllers.ConstructedInjectedController;
import omid.springframework.controllers.MyController;
import omid.springframework.controllers.PropertyInjectedController;
import omid.springframework.controllers.SetterInjectedController;
import omid.springframework.service.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructedInjectedController.class).sayHello());
		LifeCycleDemoBean lifeCycleDemoBean = ctx.getBean(LifeCycleDemoBean.class);
	    lifeCycleDemoBean.destroy();
	}

}
