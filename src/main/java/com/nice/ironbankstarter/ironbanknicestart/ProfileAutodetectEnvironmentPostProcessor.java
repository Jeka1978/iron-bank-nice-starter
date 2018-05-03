package com.nice.ironbankstarter.ironbanknicestart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author Evgeny Borisov
 */
public class ProfileAutodetectEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (environment.getActiveProfiles().length == 0) {
            if (getTempreture() < -50) {
                environment.addActiveProfile("WINTER_IS_HERE");
            }else {
                environment.addActiveProfile("WINTER_IS_COMING");
            }
        }
    }

    private int getTempreture() {
        return -100;
    }
}
