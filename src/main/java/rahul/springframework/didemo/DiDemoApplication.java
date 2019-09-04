package rahul.springframework.didemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import rahul.controller.ConstructorInjectedController;
import rahul.controller.MyController;
import rahul.controller.PropertyInjectedController;
import rahul.controller.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages = {"rahul.controller","rahul.services"})
public class DiDemoApplication implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties are set for the beans");
        System.out.println();
    }

    public static void main(String[] args) {               
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }


    @Override
    public void destroy() throws Exception {

    }
}
