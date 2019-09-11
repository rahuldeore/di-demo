package rahul.springframework.didemo.services;

/**
 * Created by Rahul on 2019-09-04
 */
public class GreetingServiceFactory {

    GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){

        switch (lang){
            case "en": return new PrimaryGreetingServiceImpl(greetingRepository);
            case "de": return new PrimaryGermanGreetingServiceImpl(greetingRepository);
            case "es": return new PrimarySpanishGreetingServiceImpl(greetingRepository);
            default: return  new PrimaryGreetingServiceImpl(greetingRepository);
        }
    }

}
