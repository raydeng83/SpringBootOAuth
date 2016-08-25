package com.ldeng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lede on 8/25/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan({ "com.ldeng" })
public class ResourceServerWebConfig extends WebMvcConfigurerAdapter {
}
