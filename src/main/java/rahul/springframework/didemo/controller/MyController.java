package rahul.springframework.didemo.controller;

import org.springframework.stereotype.Controller;
import rahul.springframework.didemo.services.GreetingService;

/**
 * Created by Rahul on 2019-07-10
 */
@Controller
public class MyController {

    private  GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String hello(){
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();
    }
}
