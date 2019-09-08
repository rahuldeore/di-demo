package rahul.springframework.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import rahul.springframework.didemo.services.GreetingService;

/**
 * Created by Rahul on 2019-07-10
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
