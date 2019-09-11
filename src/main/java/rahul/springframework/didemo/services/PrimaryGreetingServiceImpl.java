package rahul.springframework.didemo.services;

/**
 * Created by Rahul on 2019-07-10
 */
public class PrimaryGreetingServiceImpl implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
