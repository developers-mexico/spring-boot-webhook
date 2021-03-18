package com.webhook.ansible;

import com.webhook.external.SystemExecution;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties({AnsibleProperties.class})
@Configuration
public class AnsibleConfiguration {

    @Bean
    public SystemExecution systemExecution(){
        return new AnsibleExecution();
    }

    // This is REDUNDANT
    /*
    @Bean
    public SystemProject systemProject(AnsibleProperties ansibleProperties){
        return ansibleProperties;
    }
    */
}
