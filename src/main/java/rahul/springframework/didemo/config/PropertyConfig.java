package rahul.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import rahul.springframework.didemo.examplebeans.FakeDataSource;
import rahul.springframework.didemo.examplebeans.FakeJmsBroker;

/**
 * Created by Rahul on 2019-09-10
 */
@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

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
        //fakeDataSource.setUser(user);
        //fakeDataSource.setUser(env.getProperty("logname"));
        fakeDataSource.setUser(env.getProperty("username"));
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

   /* @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/
}
