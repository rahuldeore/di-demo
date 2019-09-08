package rahul.springframework.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import rahul.springframework.didemo.services.GreetingService;

/**
 * Created by Rahul on 2019-07-10
 */
@Component
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
