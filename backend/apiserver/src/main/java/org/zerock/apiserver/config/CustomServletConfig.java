package org.zerock.apiserver.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.zerock.apiserver.controller.formatter.LocalDateFormatter;

@Configuration
@Log4j2
public class CustomServletConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        log.info("---------------------------");
        log.info("addFormatters");
        registry.addFormatter(new LocalDateFormatter());
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") //어느 경로에 적용할건가? 전체 경로
                .maxAge(500)
                .allowedMethods("GET","POST","PUT","DELETE","HEAD","OPTIONS")
                .allowedOrigins("*");
    }
}
