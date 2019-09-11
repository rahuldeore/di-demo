package rahul.springframework.didemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import rahul.springframework.didemo.services.*;

/**
 * Created by Rahul on 2019-09-04
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingRepository greetingRepository(){
        return new GreetingRepositoryImpl();
    }
    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"en","default"})
    PrimaryGreetingServiceImpl primaryGreetingService(GreetingRepository greetingRepository){
        return new PrimaryGreetingServiceImpl(greetingRepository);
    }

    @Bean
    @Profile("es")
    @Primary
    PrimarySpanishGreetingServiceImpl primarySpanishGreetingService(GreetingRepository greetingRepository){
        return new PrimarySpanishGreetingServiceImpl(greetingRepository);
    }

    @Bean
    @Profile("de")
    @Primary
    PrimaryGermanGreetingServiceImpl primaryGernamGreetingService(GreetingRepository greetingRepository){
        return new PrimaryGermanGreetingServiceImpl(greetingRepository);
    }
}
