package rahul.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rahul.springframework.didemo.examplebeans.FakeDataSource;
import rahul.springframework.didemo.examplebeans.FakeJmsBroker;

/**
 * Created by Rahul on 2019-09-10
 */
@Configuration
public class PropertyConfig {

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String pass;

    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUsername;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPass(pass);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setJmsUsername(jmsUsername);
        fakeJmsBroker.setJmsPassword(jmsPassword);
        fakeJmsBroker.setJmsUrl(jmsUrl);
        return fakeJmsBroker;
    }

}
