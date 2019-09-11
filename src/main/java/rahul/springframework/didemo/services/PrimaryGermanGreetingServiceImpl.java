package rahul.springframework.didemo.services;

/**
 * Created by Rahul on 2019-07-10
 */
public class PrimaryGermanGreetingServiceImpl implements GreetingService{
    //public static final String HELLO_GURUS_IN_GERMAN = "HALLO GURUS!  ";

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
