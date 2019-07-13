package rahul.springframework.didemo.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by Rahul on 2019-07-10
 */
@Controller
public class MyController {
    public String hello(){
        System.out.println("Hello!!!");
        return "foo";
    }
}
