package com.nice.ironbankstarter.ironbanknicestart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Evgeny Borisov
 */
public class RavenSenderContextListener implements ApplicationListener<ContextRefreshedEvent>{
    @Autowired
    private RavenProps ravenProps;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Raven was sent to "+ravenProps.getDestination());
    }
}
