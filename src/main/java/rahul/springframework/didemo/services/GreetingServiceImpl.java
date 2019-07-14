package rahul.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Rahul on 2019-07-10
 */
@Service
public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO_GURUS = "Hello Gurus !!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
