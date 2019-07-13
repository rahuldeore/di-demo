package rahul.springframework.didemo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rahul.springframework.didemo.services.GreetingServiceImpl;

/**
 * Created by Rahul on 2019-07-10
 */
public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS,setterInjectedController.sayHello());
    }
}
