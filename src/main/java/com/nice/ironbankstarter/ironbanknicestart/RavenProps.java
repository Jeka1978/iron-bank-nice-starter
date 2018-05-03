package com.nice.ironbankstarter.ironbanknicestart;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Evgeny Borisov
 */
@ConfigurationProperties("raven")
@Data
public class RavenProps {
    private String destination;
}
