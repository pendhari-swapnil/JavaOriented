/**
 * 
 */
package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static com.google.common.base.Predicates.or;

/**
 * @author HP
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket postApis() {
		
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
							.select().apis(RequestHandlerSelectors.basePackage("com.example.demo.controller")).
							paths(postPaths()).build().apiInfo(apiInfo());
		
		
	}
	
	private Predicate<String> postPaths() {
		return or(regex("/hello.*"), regex("/authenticate.*"));
	}
	
	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Spring Boot API")
				.description("Java Spring Boot API reference for developers")
				.termsOfServiceUrl("http://javainuse.com")
				.contact("pendhari.swapnil@gmail.com").license("Java Spring boot License")
				.licenseUrl("pendhari.swapnil@gmail.com").version("1.0").build();
	}

}
