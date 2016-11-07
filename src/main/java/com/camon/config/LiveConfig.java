package com.camon.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("live")
@Slf4j
public class LiveConfig extends CommonConfig {

    static {
        log.info("### LiveConfig");
    }




}
