package com.nice.ironbankstarter.ironbanknicestart;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */

@Configuration
@EnableConfigurationProperties(RavenProps.class)
public class StarterConfig {
    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("raven.destination")
    public RavenSenderContextListener contextListener(){
        return new RavenSenderContextListener();
    }

}
