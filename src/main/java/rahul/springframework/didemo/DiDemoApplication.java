package rahul.springframework.didemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import rahul.springframework.didemo.controller.MyController;
import rahul.springframework.didemo.examplebeans.FakeDataSource;

@SpringBootApplication
//@ComponentScan(basePackages = {"rahul.controller","rahul.services"})
public class DiDemoApplication implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties are set for the beans");
        System.out.println();
        //ApplicationContext context = SpringApplication.run(DiDemoApplication.class); Never do this. It creates endless loop
    }

    public static void main(String[] args) {               
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser() + " " + fakeDataSource.getPass() + " " + fakeDataSource.getUr());

    }


    @Override
    public void destroy() throws Exception {

    }
}
