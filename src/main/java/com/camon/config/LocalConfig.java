package com.camon.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"default", "local"})
@Slf4j
public class LocalConfig extends CommonConfig {

    static {
        log.info("### LocalConfig");
    }




}
