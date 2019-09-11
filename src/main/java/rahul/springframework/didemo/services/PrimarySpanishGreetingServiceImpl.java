package rahul.springframework.didemo.services;

/**
 * Created by Rahul on 2019-07-10
 */
public class PrimarySpanishGreetingServiceImpl implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.geSpanishGreeting();
    }
}
