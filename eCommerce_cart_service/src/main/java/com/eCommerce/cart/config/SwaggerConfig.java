
package com.eCommerce.cart.config;

import static springfox.documentation.schema.AlternateTypeRules.newRule;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Autowired
    private TypeResolver typeResolver;

    /**
     * configures swagger.
     * 
     * @return Docket.
     */
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.eCommerce.cart"))
                .build()
                .pathMapping("/")
                .genericModelSubstitutes(ResponseEntity.class, CompletableFuture.class)
                .alternateTypeRules(newRule(
                        typeResolver.resolve(DeferredResult.class,
                                typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
                        typeResolver.resolve(WildcardType.class)))
                .useDefaultResponseMessages(false)
                .apiInfo(getApiInformation());
    }
    
    private ApiInfo getApiInformation(){
        return new ApiInfo("employee service Rest API",
                "This is a employee service Rest API created using Spring Boot",
                "1.0",
                "API Terms of Service URL",
                new Contact("abcd", "", "ajit.kumar@atcs.com"),
                "API License",
                "API License URL",
                Collections.emptyList()
                );
    }
}
