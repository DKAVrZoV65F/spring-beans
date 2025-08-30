package org.example.springbeans.config;

import org.example.springbeans.service.JavaConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.OffsetDateTime;

@Configuration
public class JavaConfig {

    @Bean("FullJavaConfigService")
    @Primary
    public JavaConfigService getJavaConfigService() {
        OffsetDateTime now = OffsetDateTime.now();
        JavaConfigService javaConfigService = new JavaConfigService(now.toString());
        javaConfigService.setDayOfMonth(now.getDayOfMonth());
        return javaConfigService;
    }

    @Bean("JavaConfigService")
    public JavaConfigService getJavaConfigService1() {
        OffsetDateTime now = OffsetDateTime.now();
        return new JavaConfigService(now.toString());
    }
}
