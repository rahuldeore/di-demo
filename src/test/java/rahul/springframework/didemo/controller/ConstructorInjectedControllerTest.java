package rahul.springframework.didemo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rahul.springframework.didemo.services.GreetingServiceImpl;

/**
 * Created by Rahul on 2019-07-10
 */
public class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }

}
