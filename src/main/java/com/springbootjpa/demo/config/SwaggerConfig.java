package com.springbootjpa.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// swagger配置信息
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public ApiInfo createApi(){
        return new ApiInfoBuilder().title("小demo项目接口文档").description("小demo").
                contact(new Contact("小demo","111","121212@163.com")).build();
    }

    @Bean
    public Docket createDoc(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApi()).
            select().apis(RequestHandlerSelectors.basePackage("com.springbootjpa.demo.controller")).build();
    }
}
