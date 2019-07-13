package rahul.springframework.didemo.controller;

import org.springframework.stereotype.Controller;
import rahul.springframework.didemo.services.GreetingService;

/**
 * Created by Rahul on 2019-07-10
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
