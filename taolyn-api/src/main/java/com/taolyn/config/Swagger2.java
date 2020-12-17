package com.taolyn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by 陶Lyn
 * on 2020/12/14.
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    // http://localhost:8088/swagger-ui.html
    // http://localhost:8088/doc.html
    //撇脂swagger2核心配置 docket
    @Bean
    public Docket  createRestApi (){
        return new Docket(DocumentationType.SWAGGER_2)//指定api类型为swagger2
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.taolyn.controller"))//指定controller包
                    .paths(PathSelectors.any())    //所有controller
                    .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("测试api")
                .contact(new Contact("taolyn","https://www.taolyn.com","test@emal.com"))
                .description("测试api")
                .version("1.1.1")
                .termsOfServiceUrl("https://www.taolyn.com")
                .build();
    }
}
