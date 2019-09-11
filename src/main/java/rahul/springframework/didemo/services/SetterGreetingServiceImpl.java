package rahul.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Rahul on 2019-07-10
 */
@Service
public class SetterGreetingServiceImpl implements GreetingService{
    public static final String HELLO_GURUS = "Hello, I was injected from Setter Greeting Service Impl !!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
