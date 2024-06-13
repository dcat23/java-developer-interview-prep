package com.dcat23.spring.demo.headerValidation;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<HeaderValidationFilter> headerValidationFilter() {
        FilterRegistrationBean<HeaderValidationFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new HeaderValidationFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
